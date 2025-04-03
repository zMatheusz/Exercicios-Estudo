package D_associacao.ExercicioSeminarios.dominio;

import java.util.ArrayList;

public class Seminario {
    private String titulo;
    private Professor professor;
    private ArrayList<Estudante> estudantes;
    private Local local;

    public Seminario(String titulo, Professor professor, ArrayList<Estudante> estudantes, Local local) {
        this.titulo = titulo;
        this.professor = professor;
        this.estudantes = estudantes;
        this.local = local;

        for (Estudante estudante: estudantes) {
            estudante.setSeminario(this);
        }
        professor.addSeminario(this);
    }

    public void imprime() {
        System.out.println();
        System.out.println("O título do seminário é: " + this.titulo);
        System.out.println("O endereço do seminário é: " + this.local.getEndereco());

        if (this.professor != null) {
            System.out.println("O professor responsável pelo seminário é: " + this.professor.getNome());
        } else {
            System.out.println(this.titulo + " não é ministrado por nenhum professor.");
        }

        if (!estudantes.isEmpty()) {
            System.out.print("Os alunos envolvidos são: ");
            for (Estudante x : estudantes) {
                System.out.print(x.getNome() + " ");
            }
            System.out.println();
            System.out.println();
        } else {
            System.out.println("Não há alunos participando desse seminário.");
        }
    }

    public void addEstudante(Estudante estudante) {
        if (!estudantes.contains(estudante)) {
            estudantes.add(estudante);
            estudante.setSeminario(this);
        }
    }

    public void removeEstudante(Estudante estudante) {
        if (estudantes.contains(estudante)) {
            estudantes.remove(estudante);
        }

        if (estudante.getSeminario() == this) {
            estudante.sairSeminario();
        }
    }

    public void removeProfessor() {
        if (this.professor != null) {
            this.professor.getSeminarios().remove(this);
            this.professor = null;
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        if (professor != null) {
            if (professor != getProfessor() && getProfessor() != null) {
                this.professor.removeSeminario(this);
            }

            this.professor = professor;

            if (!professor.getSeminarios().contains(this) || professor.getSeminarios() == null) {
                professor.addSeminario(this);
            }
        } else {
            System.out.println("O professor informado não é válido.");
        }
    }

    public ArrayList<Estudante> getEstudantes() {
        return estudantes;
    }

    public void setEstudantes(ArrayList<Estudante> estudantes) {
        this.estudantes = estudantes;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }
}