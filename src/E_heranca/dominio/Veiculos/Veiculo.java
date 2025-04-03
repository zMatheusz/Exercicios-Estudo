package E_heranca.dominio.Veiculos;

public class Veiculo {
    private String marca;
    private String modelo;
    private int ano;

    public Veiculo (String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public void imprime() {
        System.out.println("Marca do veículo: " + this.marca);
        System.out.println("Modelo do veículo: " + this.modelo);
        System.out.println("Ano do veículo: " + this.ano);
    }
}
