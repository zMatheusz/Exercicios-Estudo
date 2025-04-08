package G_interfaces.test.interfaces01;
import G_interfaces.dominio.interfaces01.*;

public class AnimaisTest01 {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        Passaro passaro = new Passaro();

        cachorro.emitirSom();
        cachorro.mover();

        System.out.println();

        passaro.emitirSom();
        passaro.mover();
    }
}
