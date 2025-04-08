package G_interfaces.dominio.interfaces01;

public class Cachorro implements  Animal {
    @Override
    public void emitirSom() {
        System.out.println("AuAu");
    }

    @Override
    public void mover() {
        System.out.println("Correndo....");
    }
}
