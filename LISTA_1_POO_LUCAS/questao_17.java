package LISTA_1_POO_LUCAS;

public class questao_17 {
    public static void main(String[] args) {
        
        // 1. Nossas variáveis iniciais (usando double para não perder a precisão dos cálculos)
        double populacaoA = 7000;
        double populacaoB = 20000;
        int anos = 0; // O relógio começa no ano zero
        
        // 2. O Laço: Enquanto A for menor que B, a simulação continua rodando
        while (populacaoA < populacaoB) {
            
            // Calculamos o crescimento de A (3,5%) e somamos ao valor atual
            populacaoA = populacaoA + (populacaoA * 0.035);
            
            // Calculamos o crescimento de B (1%) e somamos ao valor atual
            populacaoB = populacaoB + (populacaoB * 0.01);
            
            // O ano termina, então viramos o calendário (+1)
            anos++;
        }
        
        // 3. Quando o laço acabar, significa que A ultrapassou (ou igualou) B!
        System.out.println("Serão necessários " + anos + " anos.");
        System.out.println("População final de A: " + (int) populacaoA + " habitantes.");
        System.out.println("População final de B: " + (int) populacaoB + " habitantes.");
    }
}