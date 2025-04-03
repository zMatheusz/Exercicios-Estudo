package D_associacao.ExercicioSeminarios.dominio;

public class Estudante {
    private String nome;
    private int idade;
    private Seminario seminario;

    public Estudante(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void imprime() {
        System.out.println();
        System.out.println("O aluno se chama: " + this.nome);
        System.out.println(this.nome + " tem: " + this.idade + " anos");

        if (seminario == null) {
            System.out.println(this.nome + " não está em nenhum seminário.");
        } else {
            System.out.println(this.nome + " participa do seminário: " + this.seminario.getTitulo());
        }
        System.out.println();
    }

    public void sairSeminario() {
        if (this.seminario != null) {
            this.seminario.getEstudantes().remove(this);
            this.seminario = null;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Seminario getSeminario() {
        return seminario;
    }

    public void setSeminario(Seminario seminario) {
        if (seminario == null) {
            System.out.println("O seminário informado não é válido.");
            return;
        }
        if (this.seminario != null) {
            this.seminario.removeEstudante(this);
        }
        this.seminario = seminario;

        if (!seminario.getEstudantes().contains(this)) {
            this.seminario.addEstudante(this);
        }
    }
}