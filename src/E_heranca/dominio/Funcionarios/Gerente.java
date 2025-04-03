package E_heranca.dominio.Funcionarios;

public class Gerente extends Funcionario {
    public Gerente (String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double calcularBonus() {
        return super.getSalario() * 0.2;
    }
}
