package A_arraysmultidimensionais;

public class ArraysMultidimensionais02 {
    // Imagem em Escala de Cinza: Considere uma matriz 5x5 representando uma imagem em escala de cinza (valores de 0 a 255). Escreva um programa que encontre o maior e o menor valor da matriz.
    public static void main(String[] args) {
        int imagem[][] = new int[5][5];

        for (int i = 0; i < imagem.length; i++) {
            for (int j = 0; j < imagem[i].length; j++) {
                double ale = Math.random();
                imagem[i][j] = (int) (0 + ale * (255 - 0));
            }
        }

        int maiorV = imagem[0][0];
        int menorV = imagem[0][0];

        for (int i = 0; i < imagem.length; i++) {
            for (int j = 0; j < imagem[i].length; j++) {
                int nAtual = imagem[i][j];
                if (nAtual > maiorV) {
                    maiorV = nAtual;
                }
                if (nAtual < menorV) {
                    menorV = nAtual;
                }
            }
        }

        System.out.println("A matriz gerada foi: ");
        System.out.println();
        for (int i = 0; i < imagem.length; i++) {
            for (int j = 0; j < imagem[i].length; j++) {
                System.out.print(imagem[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("O maior valor é: " + maiorV);
        System.out.println("O menor valor é: " + menorV);
    }
}