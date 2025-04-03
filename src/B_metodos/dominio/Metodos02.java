package B_metodos.dominio;

// Implemente um metodo chamado calcularPotencia que recebe dois números inteiros como
// parâmetros: a base e o expoente. O metodo deve retornar o resultado da base elevada ao expoente sem
// utilizar Math.pow(). No main, solicite os valores ao usuário, chame o metodo e exiba o resultado.

public class Metodos02 {
    public double calcularPotencia(int base, int expoente) {
        double result = base;

        if (expoente == 0) {
            return 1;
        }

        for (int i = 1; i < Math.abs(expoente); i++) {
            result *= base;
        }

        if (expoente < 0) {
            return 1/result;
        } else {
            return result;
        }

    }
}