package C_blocoinicializacao.test;
import C_blocoinicializacao.dominio.ConversorMoeda;
import java.util.Scanner;

public class ConversorMoedaTest01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite quantos dólares você deseja converter: ");
        double dol = scan.nextDouble();
        System.out.print("Digite quantos euros você deseja converter: ");
        double eur = scan.nextDouble();
        scan.close();

        System.out.println("\nA conversão de " + dol + " dólares resultou em: R$" + ConversorMoeda.dolarParaReal(dol));
        System.out.println("A conversão de " + eur + " euros resultou em: R$" + ConversorMoeda.euroParaReal(eur));
    }
}
