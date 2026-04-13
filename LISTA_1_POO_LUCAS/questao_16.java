package LISTA_1_POO_LUCAS;

public class questao_16 {
    public static void main(String[] args) {
        
        System.out.println("Os números de 3 algarismos que atendem a essa regra são:");

        // Laço testando absolutamente todos os números de 3 algarismos
        for (int numero = 100; numero <= 999; numero++) {
            
            // 1. O "fatiamento" do número atual
            int centena = numero / 100;
            int dezena  = (numero % 100) / 10;
            int unidade = numero % 10;
            
            // 2. A conta matemática: soma dos cubos de cada dígito
            // Nota: multiplicar o número por ele mesmo 3 vezes é o cubo dele.
            int somaDosCubos = (centena * centena * centena) + 
                               (dezena * dezena * dezena) + 
                               (unidade * unidade * unidade);
                               
            // 3. A pergunta final: a soma que fizemos bate com o número original?
            if (somaDosCubos == numero) {
                System.out.println(numero);
            }
        }
    }
}