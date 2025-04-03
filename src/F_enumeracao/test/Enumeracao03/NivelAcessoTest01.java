package F_enumeracao.test.Enumeracao03;
import F_enumeracao.dominio.Enumeracao03.NivelAcesso;
import java.util.Scanner;

public class NivelAcessoTest01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Sobre qual nível de acesso você deseja ver a descrição? ");
        String nivel = input.nextLine();
        System.out.println();

        NivelAcesso nivelAcesso = NivelAcesso.porNome(nivel);

        if (nivelAcesso != null) {
            System.out.println("O nível '" + nivel + "' tem a descrição: " + nivelAcesso.getDescricao());
        } else {
            System.out.println("O nível de acesso informado não existe.");
        }
        input.close();
    }
}
