package F_enumeracao.test.Enumeracao01;
import F_enumeracao.dominio.Enumeracao01.CalcEnum;
import java.util.Scanner;

public class CalcEnumTest01 {
    public static void main(String[] args) {
        CalcEnum[] operacoes = CalcEnum.values();
        Scanner input = new Scanner(System.in);

        System.out.print("Primeiro número das operações: ");
        double n1 = input.nextDouble();
        System.out.print("Segundo número das operações: ");
        double n2 = input.nextDouble();
        System.out.println();
        input.close();

        for (CalcEnum operacao: operacoes) {
            System.out.println("Expressão: '" + n1 + " " +  operacao.getOperacao() + " " + n2 + "' = " + operacao.executarOperacao(n1, n2));
        }
    }
}
