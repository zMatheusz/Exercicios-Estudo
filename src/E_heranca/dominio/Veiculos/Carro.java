package E_heranca.dominio.Veiculos;

public class Carro extends Veiculo {
    private int numPortas;

    public Carro(String marca, String modelo, int ano, int numPortas) {
        super(marca, modelo, ano);
        this.numPortas = numPortas;
    }

    @Override
    public void imprime () {
        super.imprime();
        System.out.println("Número de portas do carro: " + this.numPortas);
    }
}
