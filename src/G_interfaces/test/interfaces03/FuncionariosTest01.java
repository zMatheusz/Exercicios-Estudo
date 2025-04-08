package G_interfaces.test.interfaces03;
import G_interfaces.dominio.interfaces03.*;

public class FuncionariosTest01 {
    public static void main(String[] args) {
        Funcionario gerente = new Gerente();
        Programador programador = new Programador();

        System.out.println(gerente.toString());

        programador.addHorasTrabalhadas(10);
        System.out.println(programador.toString());
    }
}
