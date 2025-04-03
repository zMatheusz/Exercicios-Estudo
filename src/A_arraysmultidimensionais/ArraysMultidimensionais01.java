package A_arraysmultidimensionais;

public class ArraysMultidimensionais01 {
    // Matriz de Notas: Crie um programa que armazene as notas de 3 alunos em 4 disciplinas usando um array bidimensional. Depois, calcule e exiba a média de cada aluno.

    public static void main(String[] args) {
        float notas[][] = new float[3][4];
        String materias[] = {"Português" , "Matemática" , "Artes" , "Geografia"};

        // Notas Aluno 1
        notas[0][0] = 8.0f; //Português
        notas[0][1] = 6.0f; //Matemática
        notas[0][2] = 9.0f; //Artes
        notas[0][3] = 7.0f; //Geografia

        // Notas Aluno 2
        notas[1][0] = 4.0f; //Português
        notas[1][1] = 5.0f; //Matemática
        notas[1][2] = 6.0f; //Artes
        notas[1][3] = 8.0f; //Geografia

        // Notas Aluno 3
        notas[2][0] = 5.0f; //Português
        notas[2][1] = 8.0f; //Matemática
        notas[2][2] = 4.0f; //Artes
        notas[2][3] = 3.0f; //Geografia

        for (int i = 0; i < notas.length; i++) {
            float media = 0.0f;

            System.out.println("Informações sobre o aluno " +  (i+1) + ": ");
            System.out.println();

            for (int j = 0; j < notas[i].length; j++) {
                media += notas[i][j];
                System.out.println("Nota em " + materias[j] + ": " + notas[i][j]);
            }

            media /= notas[i].length;
            System.out.println("A media do aluno " + (i+1) + " é: " + media);
            System.out.println();
        }
    }
}