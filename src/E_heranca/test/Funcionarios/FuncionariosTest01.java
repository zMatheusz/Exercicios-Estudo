package E_heranca.test.Funcionarios;
import E_heranca.dominio.Funcionarios.*;

public class FuncionariosTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Carla" , 2000d);
        Desenvolvedor desenvolvedor = new Desenvolvedor("José" , 4000d);
        Gerente gerente = new Gerente ("Roberto" , 6000d);

        System.out.println("Imprime funcionario");
        funcionario.imprime();

        System.out.println();

        System.out.println("imprime desenvolvedor");
        desenvolvedor.imprime();

        System.out.println();

        System.out.println("imprime gerente");
        gerente.imprime();
    }
}
