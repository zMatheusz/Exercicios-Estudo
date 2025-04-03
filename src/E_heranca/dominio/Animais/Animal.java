package E_heranca.dominio.Animais;

public abstract class Animal {
    private String som;

    public Animal(String som) {
        this.som = som;
    }

    public void emitirSom() {
        System.out.println(som + "\n");
    }
}
