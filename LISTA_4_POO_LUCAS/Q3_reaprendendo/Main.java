import java.util.ArrayList;
import java.util.Scanner;

public class Main{

    public static void main (String [] args ) {

        ArrayList<Cliente> banco_de_dados = new ArrayList<>();

        System.out.print("Para sair, digite o ID negativo");

        Scanner sc = new Scanner(System.in);
        
        while (true){


        System.out.print("ID: ");

        int id = sc.nextInt();

            if (id < 0) { 

                break;
            }

        sc.nextLine();
        System.out.print("Digite o seu nome: ");
        String nome = sc.nextLine();

        
        System.out.print("Digite o seu idade: ");
        int idade = sc.nextInt();

        sc.nextLine();
        System.out.print("Digite o seu telefone: ");
        int telefone = sc.nextInt();
            
        banco_de_dados.add(new Cliente(id, nome, idade, telefone)); //método para adicionar algo no meu array
        }
        
    

        for (int i = 0; i < banco_de_dados.size(); i++) {

        banco_de_dados.get(i).impress();

        }
        

        sc.close();
    }

   
    

}