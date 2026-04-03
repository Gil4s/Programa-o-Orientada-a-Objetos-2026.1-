package aula02_saida_de_dados;

    public class saidas {
        public static void main (String[] args ){ 

            System.out.println("Revisando a saída de dados com java"); 
            
            // Vamos declarar algumas variáveis no nosso programa

            int y = 10;

            int x = 20; 
            
            System.out.println ("O valor do Y criado no meu programa, é: " + y); // veja que conseguimos concatenar Strings e Números, somente com o +
            System.out.println ("O Valor do x criado no meu programa é: " + x); // veja que conseguimos concatenar Strings e Números, somente com o +

            // Agora, vamos aprender a controlar a quantidad de casas decimais em java 

            // A ideia é fazer isso em um print, certo? Logo, vamos aprender a entregar em valores decimais 
            double y_novo = y;
            System.out.println("O valor de Y em decimal é:" );
            System.out.printf("%.2f%n", y_novo); // o resultado disso vai ser: 10,00 
            
            // O formato de saída usando o printf vai ser no formato do computador que você está usando. 
            // Com eu estou usando um formato "Brasileiro", o método de entrega da linguagem vai ser esse
            // Mas e agora, como fazer para mudar?
            // Próxima Classe
            
    }  
} 