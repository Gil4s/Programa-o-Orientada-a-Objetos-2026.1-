/* 5.Escreva uma classe que contenha métodos estáticos para retornar o maior de dois, três, 
quatro e cinco valores, considerando que os argumentos e o retorno dos métodos podem 
ser dos tipos int e int. Em outra classe, escreva um aplicativo de teste que, sem criar 
objetos, demonstre as capacidades da classe criada.  */

public class Maior {
    // --- Para int ---
    public static int maior(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }

    public static int maior(int num1, int num2, int num3) {
        return maior(maior(num1, num2), num3);
    }

    public static int maior(int num1, int num2, int num3, int num4) {
        return maior(maior(num1, num2, num3), num4);
    }

    public static int maior(int num1, int num2, int num3, int num4, int num5) {
        return maior(maior(num1, num2, num3, num4), num5);
    }

    // --- Para double ---
    public static double maior(double num1, double num2) {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }

    public static double maior(double num1, double num2, double num3) {
        return maior(maior(num1, num2), num3);
    }

    public static double maior(double num1, double num2, double num3, double num4) {
        return maior(maior(num1, num2, num3), num4);
    }

    public static double maior(double num1, double num2, double num3, double num4, double num5) {
        return maior(maior(num1, num2, num3, num4), num5);
    }
}
