package math_function;

public class math {

    public static void main (String[] args){

        //Vamos começar a introduzir as funções matemáticas em java

        double A_valor_abs, A_raiz, x, y, A_potencia;

        x = 10;

        y = 2;
        //Estou configurando uma variável criada para receber dados de uma outra variável
        //Porém, estou alterando os valores, fazendo receber os valores de x, com funções matemáticas implementadas

        // RAIZ QUADRADA
        A_raiz = Math.sqrt (x);
        
        // POTENCIA -> Aqui, eu estou pegando o valor de X e elevando para Y
        A_potencia = Math.pow (x, y);
        
        // Variável A recebe o valor absoluto de X
        A_valor_abs = Math.abs (x);

        System.out.printf ("Vamos configurar para mostrar a Raiz quadrada do valor de X(%.2f), mostrar também o valor de X^Y (y = %.2f)%n", x, y);
        
        System.out.printf ("O valor da Raiz Quadrada de X é: %.2f%n" , A_raiz);
        System.out.printf ("O valor da porentia de X é: %.2f%n" , A_potencia);
        System.out.printf ("O valor absoluto de X é: %.2f%n" , A_valor_abs);
                
    }


}