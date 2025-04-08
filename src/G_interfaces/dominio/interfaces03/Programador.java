package G_interfaces.dominio.interfaces03;

public class Programador implements  Funcionario {
    private final String descricaoCargo = "Descrição programador....";
    private double horasTrabalhadas;
    private final double valorDaHoraEmReais = 10;

    @Override
    public double calcularSalario() {
        if (horasTrabalhadas == 0) {
            return 0;
        }
        return horasTrabalhadas * valorDaHoraEmReais;
    }

    @Override
    public String getDescricaoCargo() {
        return descricaoCargo;
    }

    public double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void addHorasTrabalhadas (double horas) {
        horasTrabalhadas += horas;
    }

    @Override
    public String toString() {
        return "Programador{" +
                "descricaoCargo='" + descricaoCargo + '\'' +
                ", horasTrabalhadas=" + horasTrabalhadas + '\'' +
                ", salario=" + calcularSalario() +
                '}';
    }
}
