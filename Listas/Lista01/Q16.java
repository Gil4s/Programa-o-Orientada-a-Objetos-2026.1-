/*16. Escreva um programa que determine quais são todos os números de 3 algarismos cuja 
soma dos cubos de seus algarismos sejam iguais ao próprio número. 
• Exemplo: 153 = 13 + 53 + 33 = 1 + 125 + 27.  */

public class Q16 {
    public static void main(String[] args) {

        for (int num = 100; num <= 999; num++) {
            int c = num / 100;
            int d = (num / 10) % 10;
            int u = num % 10;

            int soma = (c*c*c) + (d*d*d) + (u*u*u);

            if (soma == num) {
                System.out.println(num);
            }
        }
    }
}
