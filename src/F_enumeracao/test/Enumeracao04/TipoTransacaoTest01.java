package F_enumeracao.test.Enumeracao04;
import F_enumeracao.dominio.Enumeracao04.TipoTransacao;
import java.util.Scanner;

public class TipoTransacaoTest01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o tipo de transação deseja fazer: ");
        String trans = input.nextLine();
        input.close();
        TipoTransacao tipoTransacao = TipoTransacao.porNome(trans);

        if (tipoTransacao != null) {
            System.out.println("O tipo de transação '" + trans + "' tem uma taxa de: " + tipoTransacao.getTaxa() * 100 + "%.");
        } else {
            System.out.println("O tipo de transação '" + trans + "' não é suportado ou não está no padrão correto da língua portuguesa.");
        }
    }
}