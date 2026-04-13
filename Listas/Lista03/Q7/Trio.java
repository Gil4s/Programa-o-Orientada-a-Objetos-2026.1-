/*7. Escreva uma classe genérica com 3 atributos de um mesmo tipo genérico. Além do 
construtor, essa classe deve ter: 
• Um método que diz quantos dos 3 atributos são iguais; 
• Um método que imprime os 3 atributos. 
Escreva também uma classe executável para demonstrar o uso da classe criada com 
diferentes tipos de dados. */

public class Trio<T> {
    private T valor1;
    private T valor2;
    private T valor3;

    public Trio(T valor1, T valor2, T valor3) {
        this.valor1 = valor1;
        this.valor2 = valor2;
        this.valor3 = valor3;
    }

    public int quantosIguais() {
        int iguais = 0;

        if (valor1.equals(valor2)) {
            iguais++;
        }
        if (valor1.equals(valor3)) {
            iguais++;
        }
        if (valor2.equals(valor3)) {
            iguais++;
        }

        return iguais;
    }

    public void imprime() {
        System.out.println("Valor 1: " + valor1);
        System.out.println("Valor 2: " + valor2);
        System.out.println("Valor 3: " + valor3);
        System.out.println("Pares iguais: " + quantosIguais());
        System.out.println();
    }
}
