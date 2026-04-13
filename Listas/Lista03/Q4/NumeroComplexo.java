/*4. Escreva uma classe para representar um número complexo. Essa classe deve conter 
três construtores. Um construtor deverá receber os dois valores (parte real e parte imagi- 
nária) como argumentos, o outro somente o valor real, considerando o imaginário como 
sendo zero, e o terceiro construtor não recebe argumentos, considerando as partes real e 
imaginária do número complexo como sendo iguais a zero. Escreva um método toString 
que apresente o número complexo em notação apropriada (ex.: 2 + 4i) e o use em um 
aplicativo de teste que demonstre as capacidades da classe criada.  */

public class NumeroComplexo {
    private float parteReal;
    private float parteImaginaria;

    public NumeroComplexo(float parteReal, float parteImaginaria) {
        this.parteReal = parteReal;
        this.parteImaginaria = parteImaginaria;
    }

    public NumeroComplexo(float parteReal) {
        this.parteReal = parteReal;
    }

    public NumeroComplexo() {
       
    }

    public String toString() {
        if (this.parteImaginaria < 0) {
            return this.parteReal + " - " + (-this.parteImaginaria) + "i";
        } else {
            return this.parteReal + " + " + this.parteImaginaria + "i";
        }
    }
}