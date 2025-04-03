package C_blocoinicializacao.dominio;

public class ConfiguracaoSistema {
    private static int totalInstancias = 0;

    static {
        System.out.println("Configurações do sistema carregadas.");
        System.out.println();
    }

    {
        System.out.println("Nova instância de ConfiguracaoSistema criada.");
        imprimirConfiguracoes();
        totalInstancias++;
        System.out.println();
    }

    public  void imprimirConfiguracoes() {
        System.out.println("Modo: Produção.");
    }

    public static int getTotalInstancias() {
        return ConfiguracaoSistema.totalInstancias;
    }
}
