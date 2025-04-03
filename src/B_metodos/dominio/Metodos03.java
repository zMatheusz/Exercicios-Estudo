package B_metodos.dominio;

// Crie um metodo chamado ehPalindromo que recebe uma palavra como parâmetro e retorna true se a
// palavra for um palíndromo (lida da mesma forma de trás para frente) e false caso contrário. No main,
// peça ao usuário para inserir uma palavra, chame o metodo e informe se ela é um palíndromo.

public class Metodos03 {
    public boolean ehPalindromo (String palavra) {
        palavra = palavra.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        StringBuilder palavraInverso = new StringBuilder(palavra).reverse();

        System.out.println("Palavra: " + palavra);
        System.out.println("Palavra invertida: " + palavraInverso);
        System.out.println();

        if (palavra.equals(palavraInverso.toString())) {
            return true;
        }
        return false;
    }
}
