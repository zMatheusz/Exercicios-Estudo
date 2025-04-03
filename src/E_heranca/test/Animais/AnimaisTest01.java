package E_heranca.test.Animais;
import E_heranca.dominio.Animais.*;

public class AnimaisTest01 {
    public static void main(String[] args) {
        Gato gato = new Gato();
        Vaca vaca = new Vaca();
        Cachorro cachorro = new Cachorro();

        System.out.println("Som do gato: ");
        gato.emitirSom();

        System.out.println("Som do cachorro: ");
        cachorro.emitirSom();

        System.out.println("Som da vaca: ");
        vaca.emitirSom();
    }
}
