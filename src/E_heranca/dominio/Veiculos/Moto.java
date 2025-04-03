package E_heranca.dominio.Veiculos;

public class Moto extends  Veiculo {
    private Boolean temPartidaEletrica;

    public Moto (String marca, String modelo, int ano, boolean temPartidaEletrica) {
        super(marca, modelo, ano);
        this.temPartidaEletrica = temPartidaEletrica;
    }

    @Override
    public void imprime() {
        super.imprime();
        System.out.print("Partida elétrica no veículo: " + (temPartidaEletrica ? "Sim" : "Não") + "\n");

    }
}
