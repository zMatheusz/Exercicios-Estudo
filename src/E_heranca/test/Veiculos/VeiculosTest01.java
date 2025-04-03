package E_heranca.test.Veiculos;
import E_heranca.dominio.Veiculos.*;

public class VeiculosTest01 {
    public static void main(String[] args) {
        Veiculo veiculo = new Veiculo("MarcaTeste", "ModeloTeste", 2000);
        Carro carro = new Carro("MarcaCarro", "ModeloCarro", 2001, 4);
        Moto moto = new Moto("MotoMarca", "MotoModelo", 2002, true);
        Caminhao caminhao = new Caminhao ("CaminhaoMarca", "CaminhaoModelo", 2003, 100);

        System.out.println("imprime veiculo: ");
        veiculo.imprime();

        System.out.println();

        System.out.println("imprime carro: ");
        carro.imprime();

        System.out.println();

        System.out.println("imprime moto: ");
        moto.imprime();

        System.out.println();

        System.out.println("imprime caminhao: ");
        caminhao.imprime();
    }
}