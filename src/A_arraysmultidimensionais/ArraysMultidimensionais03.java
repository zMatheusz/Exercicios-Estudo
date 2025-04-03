package A_arraysmultidimensionais;

public class ArraysMultidimensionais03 {
    // Tabuleiro de Xadrez: Crie um array bidimensional 8x8 que represente um tabuleiro de xadrez, onde as casas pretas são representadas por 1 e as brancas por 0. Exiba o tabuleiro na tela.
    public static void main(String[] args) {
        System.out.println();
        int tabuleiro[][] = new int[8][8];
        // Linha par + coluna par = 0 ; linha par + coluna impar = 1
        // Linha impar + coluna par = 1 ; linha impar + coluna impar = 0

        for (int i = 0; i < tabuleiro.length; i++) {
            for (int j = 0; j < tabuleiro[i].length; j++) {

                    if ((i % 2 == 0) && (j % 2 == 0)) { // linha par, coluna par
                        tabuleiro[i][j] = 0;
                    } else if ((i % 2 == 0) && (j % 2 != 0)) { // linha par, coluna impar
                        tabuleiro[i][j] = 1;
                    } else if ((i % 2 != 0) && (j % 2 == 0)) { // linha impar, coluna par
                        tabuleiro[i][j] = 1;
                    } else if ((i % 2 != 0) && (j % 2 == 0)) { // linha impar, coluna impar
                        tabuleiro[i][j] = 0;
                    }

                    // Substituição para cadeia de ifs:
                    // tabuleiro[i][j] = (i + j) % 2;
            }
        }

        for(int i = 0; i < tabuleiro.length; i++) {
            for (int j = 0; j < tabuleiro[i].length; j++) {
                System.out.print((tabuleiro[i][j] == 1 ? "■ " : "□ "));
            }
            System.out.println();
        }
    }
}