package aula02_saida_de_dados;

    public class Concatenate {

        public static void main(String [] args){ 

            //Vamos abordar todas as concatenações básicas vistas até então

            //Println
            String concatenar = "concatenar";
            double concatenar_double = 2.00;
            int concatenar_inteiro = 2;
            System.out.println("Concatenação com o println +" + concatenar);

            System.out.printf("Concatenação com o printf -> - %s - agora foram %.2f e %d concatenações%n", concatenar, concatenar_double, concatenar_inteiro);


            // RESUMÃO 

            // INTEIRO -> %d
            // TEXTO -> %s
            // FLOAT -> %f
            // QUEBRA DE LINHA -> %n
        }
    }
