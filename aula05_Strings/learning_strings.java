package aula05_Strings;

public class learning_strings {
    public static void main(String[] args) {

        String original = "abcde FGHIJ ABC abc DEFG    ";

        String s01 = original.toLowerCase(); // aqui, eu converto toda a minha string original em minúsculas
        String s02 = original.toUpperCase(); // aqui, eu converto toda a minha string original e maiúsculas
        String s03 = original.trim(); // Mantém a mesma estrutura original, mas vai tirar os espaços extras no final
        String s04 = original.substring(2); // gera uma nova string a partir do caracter de íncide 2 em diante
        String s05 = original.substring(2, 5); // gera uma nova string a partir do caracter de íncide 2 até o de índice
                                               // 5(sem incluí-lo)
        String s06 = original.replace("a", "x"); // gera uma nova string substituindo o primeiro argumento pelo segundo
        String s07 = original.replace("a", "xy"); // gera uma nova string substituindo o primeiro argumento pelo segundo
        String s08 = original.split(" ")[0]; // gera uma nova string dividindo a string original em um array de strings
        int i = original.indexOf("bc"); // retorna o índice da primeira ocorrência do caractere
        int j = original.lastIndexOf("bc"); // retorna o índice da última ocorrência do caractere

        System.out.println("Original: " + original);
        System.out.println("s01: " + s01);
        System.out.println("s02: " + s02);
        System.out.println("s03: " + s03);
        System.out.println("s04: " + s04);
        System.out.println("s05: " + s05);
        System.out.println("s06: " + s06);
        System.out.println("s07: " + s07);
        System.out.println("s08: " + s08);
        System.out.println("i: " + i);
        System.out.println("j: " + j);

    }
}