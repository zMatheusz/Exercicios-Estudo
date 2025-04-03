package E_heranca.dominio.Veiculos;

public class Caminhao extends Veiculo {
    private int capacidadeCarga;

    public Caminhao (String marca, String modelo, int ano, int capacidadeCarga) {
        super(marca, modelo, ano);
        this.capacidadeCarga = capacidadeCarga;
    }

    @Override
    public void imprime() {
        super.imprime();
        System.out.println("Capacidade de carga do veículo (em kg): " + capacidadeCarga);
    }
}
