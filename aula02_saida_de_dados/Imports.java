package aula02_saida_de_dados; 

import java.util.Locale;

    public class Imports {

        public static void main (String [] args) { 

            // Veja que eu puxei uma classe já existente do SDK java

            // Essa biblioteca vai me permitir usar alguns artifícios, como pro exemplo, a conversão de virgula para ponto na formatação de valores decimais
            
            double y = 10.00; 

            System.out.printf("%.2f%n", y); 
            
            Locale.setDefault(Locale.US);
            
            System.out.printf("%.2f%n", y); 

            // Agora, vamos concatenar com o printf
            // A forma de concatenar usando o printf é bem diferente, pois estamos usando uma concatenção via o conectivo vírgula 
            // Além disso, perceba que eu tenho que formatar a variável dentro da minha "String" referente a mensagem, logo, precisa se atentar a isso
            System.out.printf("Veja que temos uma diferença entre as duas saídas a cima, portanto, para a região US, temos: %.2f double em US%n ", y);
            
            


        }
    }
