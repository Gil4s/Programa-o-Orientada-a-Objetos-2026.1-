/*18. Crie uma função recursiva potencia(base,expoente) que, quando chamada, retorna baseexpoente. 
Por exemplo, potencia(3,4) deve ser implementado como 3 ∗ 3 ∗ 3 ∗ 3. (A saída é apenas 
81 nesse exemplo) 
Assuma que expoente é um inteiro maior ou igual a 1 */

public class Q18 {
    public static void main(String[] args) {
        int resultado = potencia(2, 5);
        System.err.println("Resultado: " + resultado);
    }

    public static int potencia(int base, int expoente ){
    int baseExpoente = 1;
     for (int i = 1; i <= expoente; i++) {
        baseExpoente = baseExpoente * base;
     }

    return baseExpoente; 
 }
 
}
