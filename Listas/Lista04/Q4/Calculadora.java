public class Calculadora {

    // O ... indica que o metodo aceita qualquer quantidade de argumentos
    // Internamente, numeros e tratado como um array
    public static int produto(int... numeros) {
        int resultado = 1;

        // Percorre todos os argumentos multiplicando
        for (int i = 0; i < numeros.length; i++) {
            resultado *= numeros[i];
        }

        return resultado;
    }
}