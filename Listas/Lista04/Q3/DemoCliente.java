/*
  1. Crie um objeto de uma classe chamada Cliente com os atributos id, nome, idade, telefone.
     Faca um programa para solicitar os dados de varios clientes e armazenar em um ArrayList
     ate que se digite um numero de id negativo. Em seguida, exiba os dados de todos os clientes.
 */
import java.util.ArrayList;
import java.util.Scanner;

public class DemoCliente {
    public static void main(String[] args) {
        ArrayList<Cliente> clientes = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Cadastro de Clientes ===");
        System.out.println("(Digite um ID negativo para encerrar)");
        System.out.println();

        // Continua lendo clientes ate o id ser negativo
        while (true) {
            System.out.print("ID: ");
            int id = scanner.nextInt();

            // Encerra o cadastro se o id for negativo
            if (id < 0) {
                break;
            }

            scanner.nextLine(); // limpa o buffer apos nextInt

            System.out.print("Nome: ");
            String nome = scanner.nextLine();

            System.out.print("Idade: ");
            int idade = scanner.nextInt();

            scanner.nextLine(); // limpa o buffer apos nextInt

            System.out.print("Telefone: ");
            String telefone = scanner.nextLine();

            // Cria o objeto e adiciona na lista
            clientes.add(new Cliente(id, nome, idade, telefone));
            System.out.println("Cliente cadastrado com sucesso!");
            System.out.println();
        }

        // Exibe todos os clientes cadastrados
        System.out.println("=== Clientes Cadastrados ===");
        for (int i = 0; i < clientes.size(); i++) {
            clientes.get(i).imprime();
        }

        scanner.close();
    }
}