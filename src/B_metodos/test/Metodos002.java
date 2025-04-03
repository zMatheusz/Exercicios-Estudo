package B_metodos.test;
import B_metodos.dominio.Metodos02;
import java.util.Scanner;

// Implemente um metodo chamado calcularPotencia que recebe dois números inteiros como
// parâmetros: a base e o expoente. O metodo deve retornar o resultado da base elevada ao expoente sem
// utilizar Math.pow(). No main, solicite os valores ao usuário, chame o metodo e exiba o resultado.

public class Metodos002 {
    public static void main(String[] args) {
        Metodos02 calculadoraPotencia = new Metodos02();
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor da base: ");
        int base = input.nextInt();
        System.out.print("Digite o valor do expoente:  ");
        int expoente = input.nextInt();

        System.out.println();
        System.out.print("O resultado de '" + base + "' elevado a '" + expoente + "'2 é: ");
        System.out.println(calculadoraPotencia.calcularPotencia(base, expoente));
    }
}
