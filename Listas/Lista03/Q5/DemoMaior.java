

    public class DemoMaior {
        public static void main(String[] args) {

            // int
            System.out.println("Maior entre 3 e 7: " + Maior.maior(3, 7));
            System.out.println("Maior entre 3, 7 e 5: " + Maior.maior(3, 7, 5));
            System.out.println("Maior entre 3, 7, 5 e 9: " + Maior.maior(3, 7, 5, 9));
            System.out.println("Maior entre 3, 7, 5, 9 e 1: " + Maior.maior(3, 7, 5, 9, 1));

            System.out.println();

            // double
            System.out.println("Maior entre 3.5 e 7.2: " + Maior.maior(3.5, 7.2));
            System.out.println("Maior entre 3.5, 7.2 e 5.1: " + Maior.maior(3.5, 7.2, 5.1));
            System.out.println("Maior entre 3.5, 7.2, 5.1 e 9.8: " + Maior.maior(3.5, 7.2, 5.1, 9.8));
            System.out.println("Maior entre 3.5, 7.2, 5.1, 9.8 e 1.3: " + Maior.maior(3.5, 7.2, 5.1, 9.8, 1.3));
        }
    }

