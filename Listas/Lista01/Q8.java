/*Para alavancar as vendas, uma loja resolveu fazer a seguinte promoção relâmpago em dois setores: 
    - No setor de Eletros, que possui código 222, todas as peças que custam mais de R$ 
500 vão ter 10% de desconto. 
    - No setor de Cama, mesa e banho, que possui código 111, peças com valor acima 
de R$ 100 vão ter 40% de desconto, peças que custam entre R$ 50 e R$ 100 vão ter 
20% de desconto e peças abaixo de R$ 50 vão ter 10% de desconto. 
Escreva um programa que recebe do usuário o código do setor da loja e o valor original de 
um produto e imprime na tela o nome do setor e o valor do produto com desconto. Caso 
o usuário forneça um código diferente de 111 ou 222, exiba a mensagem Setor Invalido.  */
import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o codigo do setor da loja. ");
        int codigo = input.nextInt();
        System.out.print("Digite o valor original do produto. ");
        double valorProduto = input.nextDouble();

        if (codigo == 222) {

            if (valorProduto > 500) {
                valorProduto = valorProduto - (valorProduto * (10/100));
            }
            
            System.out.print("Setor Eletros. Valor do produto com desconto: " + valorProduto);
        }
        else if (codigo == 111) {
            if (valorProduto > 100) {
                valorProduto = valorProduto - (valorProduto * (40/100));
            }
            else  if (valorProduto > 50 && valorProduto < 100) {
                valorProduto = valorProduto - (valorProduto * (20/100));
            }
            else if (valorProduto < 50) {
                valorProduto = valorProduto - (valorProduto * (10/100));
            }
            System.out.print("Setor Eletros. Valor do produto com desconto: " + valorProduto);
        }

        System.out.print("Setor Invalido.");
    }
}
