package B_metodos.dominio;

public class Triangulo {
    public void construirTriangulo (int base) {
        for (int i = 1 ; i <= base ; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
