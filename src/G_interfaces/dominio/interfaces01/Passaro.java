package G_interfaces.dominio.interfaces01;

public class Passaro implements  Animal {
    @Override
    public void emitirSom() {
        System.out.println("PiuPiu");
    }

    @Override
    public void mover() {
        System.out.println("Voando....");
    }
}
