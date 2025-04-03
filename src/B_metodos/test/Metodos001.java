package B_metodos.test;
import B_metodos.dominio.Metodos01;
import java.util.Scanner;

// Crie um metodo chamado ehPar que recebe um numero inteiro como parametro e retorna true se o
// número for par e false caso contrário. No main, peça ao usuário um número, chame o metodo e exiba
// a mensagem adequada.

public class Metodos001 {
    public static void main(String[] args) {
        Metodos01 calculadoraParidade = new Metodos01();
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o número: ");
        int num = input.nextInt();

        if (calculadoraParidade.ehPar(num)) {
            System.out.println("O número '" + num + "' é um valor par.");
        } else {
            System.out.println("O número '" + num + "' é um valor ímpar.");
        }
    }
}
