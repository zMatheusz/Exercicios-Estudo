package C_blocoinicializacao.test;
import C_blocoinicializacao.dominio.Contador;

// Crie uma classe chamada Contador que conte quantas instâncias dela foram criadas. Para isso:

public class ContadorTest01 {
    public static void main(String[] args) {
        Contador c1 = new Contador();
        Contador c2 = new Contador();
        Contador c3 = new Contador();
        Contador c4 = new Contador();
        Contador c5 = new Contador();

        Contador.resetInstancias();

        Contador c6 = new Contador();
        Contador c7 = new Contador();
        Contador c8 = new Contador();
        Contador c9 = new Contador();

        System.out.println("Total de instâncias criadas: " + Contador.getTotalInstancias());
    }
}