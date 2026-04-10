/*17. Duas cidades, A e B, têm populações de 7000 e 20000 habitantes, respectivamente. A 
cidade A tem um crescimento populacional de 3, 5% ao ano, enquanto a população da 
cidade B cresce 1% ao ano. Faça um programa que utilize laço(s) para calcular a quanti- 
dade de anos necessária para que a população da cidade A seja maior ou igual a popu- 
lação da cidade B.  */

public class Q17 {

  
    public static void main(String[] args) {
        double popCidadeA = 7000;
        double popCidadeB = 20000;

         int ano = 0;
        do {
        popCidadeA = popCidadeA + (popCidadeA*0.035);
        popCidadeB = popCidadeB + (popCidadeB*0.01); 

        ano++;

        } while (popCidadeA < popCidadeB);

        System.err.println("Quantidade de anos necessarios: " + ano);
    }
}
