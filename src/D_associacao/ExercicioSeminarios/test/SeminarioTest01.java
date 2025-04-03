package D_associacao.ExercicioSeminarios.test;
import D_associacao.ExercicioSeminarios.dominio.*;
import java.util.ArrayList;
import java.util.Arrays;

public class SeminarioTest01 {
    public static void main(String[] args) {
        Local local1 = new Local("Rua xique xique, 325");

        Estudante estudante1 = new Estudante("Roberto", 12);
        Estudante estudante2 = new Estudante("Carla", 15);

        Professor professor = new Professor("Pedro" , "Português");

        ArrayList<Estudante> estudantesS1 = new ArrayList<> (Arrays.asList(estudante1, estudante2));
        Seminario seminario1 = new Seminario("Além dos olhos", professor, estudantesS1, local1);

        System.out.println("Imprime semináro 1: ");
        seminario1.imprime();

        System.out.println("Imprime estudante 1 e 2: ");
        estudante1.imprime();
        estudante2.imprime();

        System.out.println("CARLA SAIU DO PROJETO sozinha");
        estudante2.sairSeminario();

        System.out.println("imprime seminário 1: ");
        seminario1.imprime();

        System.out.println("imprime estudante 2: ");
        estudante2.imprime();

        System.out.println("Roberto saiu do projeto sozinho");
        estudante1.sairSeminario();

        System.out.println("imprime seminário 1");
        seminario1.imprime();

        System.out.println("imprime estudante 1");
        estudante1.imprime();

        System.out.println("Carla e roberto voltam ao projeto.");
        seminario1.addEstudante(estudante1);
        seminario1.addEstudante(estudante2);

        System.out.println("imprime seminario 1");
        seminario1.imprime();

        System.out.println("imprime estudante 1");
        estudante1.imprime();

        System.out.println("imprime estudante 2");
        estudante2.imprime();


        System.out.println("----------TÓPICO PROFESSORES----------");

        System.out.println("imprime projeto 1");
        seminario1.imprime();

        System.out.println("imprime professor");
        professor.imprime();

        System.out.println("O professor saiu do projeto sozinho");
        professor.removeSeminario(seminario1);

        System.out.println("imprime seminario 1");
        seminario1.imprime();

        System.out.println("imprime professor");
        professor.imprime();

        System.out.println("Pedro voltou ao projeto sozinho");
        professor.addSeminario(seminario1);

        System.out.println("imprime seminario 1");
        seminario1.imprime();

        System.out.println("imprime professor");
        professor.imprime();
    }
}
