package D_associacao.ExercicioSeminarios.dominio;

import java.util.ArrayList;
import java.util.Arrays;

public class Professor {
    private String nome;
    private String especialidade;
    private ArrayList<Seminario> seminarios;

    public Professor (String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.seminarios = new ArrayList<>();
    }

    public void imprime () {
        System.out.println("O professor se chama: " + this.nome);
        System.out.println(this.nome + " atua em:  " + this.especialidade);

        if (seminarios.isEmpty()) {
            System.out.println(this.nome  + " não ministra nenhum seminário.");
        } else {
            System.out.print(this.nome + " ministra os seminários: ");
            for (Seminario seminario: seminarios) {
                System.out.println(seminario.getTitulo() + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public void addSeminario(Seminario seminario) {
            if (!this.seminarios.contains(seminario)) {
                this.seminarios.add(seminario);
            }

            if (seminario.getProfessor() != this) {
                seminario.setProfessor(this);
            }

    }

    public void removeSeminario(Seminario seminario) {
        if (seminarios.contains(seminario)) {
            seminarios.remove(seminario);
        }

        if (seminario.getProfessor() == this) {
            seminario.removeProfessor();
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public ArrayList<Seminario> getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(ArrayList<Seminario> seminarios) {
        this.seminarios = seminarios;
    }
}
