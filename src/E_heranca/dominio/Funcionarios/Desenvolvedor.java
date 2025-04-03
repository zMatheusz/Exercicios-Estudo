package E_heranca.dominio.Funcionarios;

public class Desenvolvedor extends  Funcionario {
    public Desenvolvedor (String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double calcularBonus() {
        return super.getSalario() * 0.1;
    }
}
