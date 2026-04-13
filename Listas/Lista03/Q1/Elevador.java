/*1.Crie uma classe denominada Elevador para armazenar as informações de um elevador 
dentro de um prédio. A classe deve armazenar o número do andar atual, o total de 
andares no prédio, a capacidade do elevador e quantas pessoas estão presentes nele. 
Outras classes não devem ter acesso direto aos atributos de Elevador. A classe deve 
também disponibilizar os seguintes métodos: 
    • construtor : que deve receber como parâmetros a capacidade do elevador e o total 
de andares no prédio (um elevador sempre começa no térreo e vazio);
    • entra : para acrescentar uma pessoa no elevador (só deve acrescentar se ainda 
houver espaço); 
    • sai : para remover uma pessoa do elevador (só deve remover se houver alguém 
dentro dele); 
    • sobe : para subir um andar (não deve subir se já estiver no último andar); 
    • desce : para descer um andar (não deve descer se já estiver no térreo). 
 
Escreva um aplicativo de teste que demonstre as capacidades da classe criada, ou seja, 
execute todos os métodos da classe.  */

public class Elevador {
    private int andarAtual;
    private int totalAndares;
    private int capacidade;
    private int pessoasPresentes;

    Elevador() {
        this.andarAtual = 0;
        this.totalAndares = 0;
        this.capacidade = 0;
        this.pessoasPresentes = 0;
    }

    void construtor(int capacidade, int totalAndares) {
        this.capacidade = capacidade;
        this.totalAndares = totalAndares;
    }

    void entra() {
        if (this.pessoasPresentes < this.capacidade) {
            this.pessoasPresentes++;
        } else {
            System.out.println("Elevador cheio! Nao e possivel entrar.");
        }
    }

    void sai() {
        if (this.pessoasPresentes > 0) {
            this.pessoasPresentes--;
        } else {
            System.out.println("Elevador vazio! Nao ha ninguem para sair.");
        }
    }

    void sobe() {
        if (this.andarAtual < this.totalAndares) {
            this.andarAtual++;
        } else {
            System.out.println("Ja esta no ultimo andar!");
        }
    }

    void desce() {
        if (this.andarAtual > 0) {
            this.andarAtual--;
        } else {
            System.out.println("Ja esta no terreo!");
        }
    }

    void imprime() {
        System.out.println("Andar atual: " + andarAtual +
            " | Total de andares: " + totalAndares +
            " | Capacidade: " + capacidade +
            " | Pessoas: " + pessoasPresentes);
    }
}