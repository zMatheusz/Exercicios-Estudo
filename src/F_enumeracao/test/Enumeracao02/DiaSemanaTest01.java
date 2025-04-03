package F_enumeracao.test.Enumeracao02;
import F_enumeracao.dominio.Enumeracao02.DiaSemana;

import java.util.Scanner;

public class DiaSemanaTest01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Gostaria de usar o identificador em palavra ou número? ");
        String resp = input.nextLine();
        char resposta = resp.charAt(0);

        if (resposta == 'p' || resposta == 'P') {
            imprimePorString();
        } else if (resposta == 'n' || resposta == 'N') {
            imprimePorNumero();
        } else {
            System.out.println("O identificador informado não foi reconhecido.");
        }
    }

    public static void imprimePorString() {
        Scanner input = new Scanner(System.in);
        String diaString = "";
        int diaNum = 0;

        System.out.println("Informe o dia da semana que deseja checar (formato: 'Dia-feira' ou 'Dia'): ");
        diaString = input.nextLine();
        input.close();
        String exibicao = "";

        for (DiaSemana dia: DiaSemana.values()) {
            if (dia.getDescricao().equals(diaString)) {
                exibicao = dia.ehFimDeSemana() ? " é um final de semana." : " é um dia de semana normal.";
                diaNum = dia.getNumDia();
            }
        }

        if (diaNum > 0 && diaNum < 8)  {
            System.out.println(diaString + " (dia número: " + diaNum + ") " + exibicao);
        } else {
            System.out.println("O dia informado ('" + diaString + "') não existe ou não está no formato correto.");
        }
    }

    public static void imprimePorNumero() {
        Scanner input = new Scanner(System.in);
        String diaString = "";
        int diaNum = 0;

        System.out.println("Informe o dia da semana que deseja checar: ");
        diaNum = input.nextInt();
        input.close();
        String exibicao = "";

        for (DiaSemana dia: DiaSemana.values()) {
            if (dia.getNumDia() == diaNum) {
                exibicao = dia.ehFimDeSemana() ? " é um final de semana." : " é um dia de semana normal.";
                diaString = dia.getDescricao();
            }
        }

        if (diaNum > 0 && diaNum < 8)  {
            System.out.println("O dia número '" + diaNum + "' (" + diaString + ") " + exibicao);
        } else {
            System.out.println("O dia informado ('" + diaNum + "') não existe em uma semana.");
        }
    }
}
