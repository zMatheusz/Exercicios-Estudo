package F_enumeracao.dominio.Enumeracao03;

public enum NivelAcesso {
    ADMIN("Acesso total ao sistema."),
    USUARIO("Acesso limitado ao sistema."),
    VISITANTE("Acesso somente para visualização.");

    private final String descricao;
    private NivelAcesso(String descricao) {
        this.descricao = descricao;
    }

    public static NivelAcesso porNome(String nivel) {
        for (NivelAcesso nivelAcesso: NivelAcesso.values()) {
            if (nivelAcesso.name().equalsIgnoreCase(nivel)) {
                return nivelAcesso;
            }
        }
        return null;
    }

    public String getDescricao() {
        return descricao;
    }
}
