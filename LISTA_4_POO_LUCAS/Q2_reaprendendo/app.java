import java.util.Scanner;

public class app{

    public static void main (String [] args){

        float [][] matrizNova ={
            {5.0f, 2.0f},
            {3.0f, 4.0f}
        };

        MatrizMaior minhaMatriz = new MatrizMaior(matrizNova);

        System.out.println("\nMatriz usada;");
        minhaMatriz.impressao();
        System.out.println("\n");
        System.out.println("Determinante = " + minhaMatriz.calcularDeterminante());
        
    }

}