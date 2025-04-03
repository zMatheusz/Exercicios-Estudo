package F_enumeracao.dominio.Enumeracao04;

public enum TipoTransacao {
    DEPOSITO("Depósito" , 0.005),
    SAQUE("Saque" , 0.01),
    TRANSFERENCIA("Transferência" , 0.015);

    private final double taxa;
    private final String nome;

    private TipoTransacao(String nome, double taxa) {
        this.nome = nome;
        this.taxa = taxa;
    }

    public static TipoTransacao porNome(String nome) {
        for (TipoTransacao tipoTransacao: TipoTransacao.values()) {
            if (tipoTransacao.getNome().equalsIgnoreCase(nome)) {
                return tipoTransacao;
            }
        }
        return null;
    }

    public double getTaxa() {
        return taxa;
    }

    public String getNome() {
        return nome;
    }
}