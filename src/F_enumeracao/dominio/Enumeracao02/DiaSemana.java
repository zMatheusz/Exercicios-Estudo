package F_enumeracao.dominio.Enumeracao02;

public enum DiaSemana {
    DOMINGO("Domingo", 1),
    SEGUNDA("Segunda-feira", 2) ,
    TERCA("Terça-feira",3),
    QUARTA("Quarta-feira",4),
    QUINTA("Quinta-feira",5),
    SEXTA("Sexta-feira",6),
    SABADO("Sábado",7);

    private final String descricao;
    private final int numDia;

    private DiaSemana(String descricao, int numDia) {
        this.descricao = descricao;
        this.numDia = numDia;
    }

    public boolean ehFimDeSemana() {
        return switch (this) {
            case SABADO -> true;
            case DOMINGO -> true;
            default -> false;
        };
    }

    public String getDescricao() {
        return descricao;
    }

    public int getNumDia() {
        return numDia;
    }
}