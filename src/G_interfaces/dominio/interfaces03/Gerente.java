package G_interfaces.dominio.interfaces03;

public class Gerente implements  Funcionario {
    private final String descricaoCargo = "Descrição do gerente....";
    private final double salario = 5000d;
    private final double bonusSalario = 0.1;

    @Override
    public double calcularSalario() {
        return salario + (salario * bonusSalario);
    }

    @Override
    public String getDescricaoCargo() {
        return this.descricaoCargo;
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "descricaoCargo='" + descricaoCargo + '\'' +
                ", salario=" + salario +
                '}';
    }
}
