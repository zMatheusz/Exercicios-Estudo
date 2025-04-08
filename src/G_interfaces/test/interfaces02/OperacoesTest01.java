package G_interfaces.test.interfaces02;
import G_interfaces.dominio.interfaces02.*;

public class OperacoesTest01 {
    public static void main(String[] args) {
        OperacaoMatematica soma = new Soma();
        OperacaoMatematica subtracao = new Subtracao();
        OperacaoMatematica multiplicacao = new Multiplicacao();
        OperacaoMatematica divisao = new Divisao();

        double n1 = 20;
        double n2 = 10;

        System.out.println("Soma: " + soma.calcular(n1,n2));
        System.out.println("Subtração: " + subtracao.calcular(n1,n2));
        System.out.println("Multiplicação: " + multiplicacao.calcular(n1,n2));
        System.out.println("Divisão: " + divisao.calcular(n1,n2));
    }
}
