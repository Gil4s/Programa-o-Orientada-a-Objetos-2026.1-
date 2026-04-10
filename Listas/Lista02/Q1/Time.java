
class Time {
    String nome;
    String cidade;
    int vitorias;
    int empates;
    int derrotas;

    Time(String nome, String cidade) {
        this.nome = nome;
        this.cidade = cidade;
        this.vitorias = 0;
        this.empates = 0;
        this.derrotas = 0;
    }

    void registraVitoria() {
        vitorias++;
    }

    void registraEmpate() {
        empates++;
    }

    void registraDerrota() {
        derrotas++;
    }

    int calculaPontos() {
        return (vitorias * 3) + (empates * 1);
    }

    int calculaJogos() {
        return vitorias + empates + derrotas;
    }

    void mostraDados() {
        System.out.println("=== " + nome + " ===");
        System.out.println("Cidade: " + cidade);
        System.out.println("Jogos: " + calculaJogos());
        System.out.println("Vitorias: " + vitorias);
        System.out.println("Empates: " + empates);
        System.out.println("Derrotas: " + derrotas);
        System.out.println("Pontos: " + calculaPontos());
    }
}
