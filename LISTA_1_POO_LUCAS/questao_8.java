package LISTA_1_POO_LUCAS;
import java.util.Scanner;
public class questao_8{

    public static void main (String [] args) {

        Scanner scanner = new Scanner(System.in);
        // setore
        
        String cod;

        // int eletro = 222 ;
        // int cama = 111 ;

        double valor, valor_final;

        System.out.println("Qual o setor que você está pensando em fazer a compra? \n" + "DIGITE 111 PARA CAMA MESA E BANHO \n" + "DIGITE 222 PARA ELETRO");
        int tipo = scanner.nextInt();
                
        if (tipo != 111 && tipo != 222) {
            System.out.println ("Tipo inválido");
        valor_final = 0;
        cod = "Inválido" ;
        } else {

            System.out.println("Digite o valor da sua compra:");
            valor = scanner.nextDouble();

            switch (tipo) {

                case 222: cod = "Eletro"; 
                
                // entrar com uma condicional:
                if (valor > 500) {
                    
                valor_final = valor * 0.9; 
                } else {
                    valor_final = valor;  
                }
                break;
            

                case 111: cod = "Cama"; 
            
                if (valor > 100) {

                valor_final = valor * 0.60;
            
                } else if (valor >= 50 && valor <= 100) {

                valor_final = valor * 0.80;
                
                } else {
                
                valor_final = valor * 0.90;
                }

            
                break;

                default: cod = "Setor inválido";
                valor_final = 0;
            
                // Veja que aqui, eu defini o cod com alguma coisa, mas eu não posso não definir o valor final 
                
            }
        }

    if (valor_final != 0){
        System.out.printf("Seu código foi: %s e o valor a ser pago é %.2f" ,cod ,valor_final);     
        }else {
            System.out.printf("Seu tipo está %s. Tente novamente", cod);
        }
    } 
}