    package C_blocoinicializacao.dominio;
    // Crie uma classe chamada Contador que conte quantas instâncias dela foram criadas. Para isso:

    public class Contador {
        private static int totalInstancias = 0;

       public Contador (){
           Contador.totalInstancias++;
       }

        public static int getTotalInstancias() {
            return Contador.totalInstancias;
        }

        public static void resetInstancias() {
            Contador.totalInstancias = 0;
        }
    }