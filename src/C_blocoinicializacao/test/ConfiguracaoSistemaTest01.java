package C_blocoinicializacao.test;
import C_blocoinicializacao.dominio.ConfiguracaoSistema;

public class ConfiguracaoSistemaTest01 {
    public static void main(String[] args) {
        ConfiguracaoSistema c1 = new ConfiguracaoSistema();
        ConfiguracaoSistema c2 = new ConfiguracaoSistema();

        System.out.println("O total de instâncias criadas foi: " + ConfiguracaoSistema.getTotalInstancias());
    }
}
