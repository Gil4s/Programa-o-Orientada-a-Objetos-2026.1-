/*2.Crie uma classe chamada Fatura para que uma loja de suprimentos de informática a 
utilize para representar uma fatura de um item vendido. Uma Fatura deve incluir as se- 
guintes informações sobre o item vendido: o número de identificação, a descrição, a 
quantidade comprada e o preço unitário. Se a quantidade não for positiva, ela deve ser 
configurada como 0. Se o preço por item não for positivo, ele deve ser configurado como 
0.0. Forneça também um método chamado calculaT otal que calcula e retorna o valor de 
fatura (isto é, multiplica a quantidade pelo preço por item). Escreva um aplicativo de teste 
que demonstre as capacidades da classe criada.  */

class Fatura {
    int numeroIdentificacao;
    String descricao;
    int quantidade;
    double precoUnitario;

    Fatura(int numeroIdentificacao, String descricao, int quantidade, double precoUnitario) {
        this.numeroIdentificacao = numeroIdentificacao;
        this.descricao = descricao;

        if (quantidade > 0) {
            this.quantidade = quantidade;
        } else {
            this.quantidade = 0;
        }

        if (precoUnitario > 0) {
            this.precoUnitario = precoUnitario;
        } else {
            this.precoUnitario = 0.0;
        }
    }

    double calculaTotal() {
        return quantidade * precoUnitario;
    }

    void mostraFatura() {
        System.out.println("=== Fatura ===");
        System.out.println("Nº identificacao: " + numeroIdentificacao);
        System.out.println("Descricao: " + descricao);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Preco unitario: R$ " + precoUnitario);
        System.out.println("Total: R$ " + calculaTotal());
    }
}
