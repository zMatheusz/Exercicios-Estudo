package B_metodos.test;
import java.util.Scanner;
import B_metodos.dominio.Metodos03;

// Crie um metodo chamado ehPalindromo que recebe uma palavra como parâmetro e retorna true se a
// palavra for um palíndromo (lida da mesma forma de trás para frente) e false caso contrário. No main,
// peça ao usuário para inserir uma palavra, chame o metodo e informe se ela é um palíndromo.

public class Metodos003 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Metodos03 checarPalindromo = new Metodos03();

        System.out.print("Digite a palavra que você deseja checar: ");
        String palavra = input.nextLine();
        input.close();
        System.out.println();

        if (checarPalindromo.ehPalindromo(palavra)) {
            System.out.println("A palavra '" + palavra + "' é um palíndromo!");
        } else {
            System.out.println("A palavra '" + palavra + "' não é um palíndromo!");
        }
    }
}
