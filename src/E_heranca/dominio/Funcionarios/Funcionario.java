package E_heranca.dominio.Funcionarios;

public class Funcionario {
    private String nome;
    private double salario;

    public Funcionario (String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public double calcularBonus() {
        return 0;
    }

    public void imprime () {
        System.out.println("Nome: " + this.nome + "; Salário base: " + this.salario + "; Bônus: " + this.calcularBonus() + "; Salário final: " + (this.salario + this.calcularBonus()));
    }

    public double getSalario() {
        return salario;
    }
}