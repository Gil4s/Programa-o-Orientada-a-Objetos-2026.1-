class Aluno {
    int matricula;
    String nome;
    double p1;
    double p2;
    double t;

    Aluno(int matricula, String nome, double p1, double p2, double t) {
        this.matricula = matricula;
        this.nome = nome;
        this.p1 = p1;
        this.p2 = p2;
        this.t = t;
    }

    double media() {
        return 2.5 * p1 + 2.5 * p2 + 2.0 * t;
    }

    double provaFinal() {
        double mp = media();

        // Não precisa de exame final
        if (mp >= 7.0) {
            return 0.0;
        }

        // Reprovado direto, sem direito a exame
        if (mp < 3.0) {
            return 0.0;
        }

        // Precisa de exame: calcula o mínimo necessário
        // MF = (MP * 6 + EF * 4) / 10 >= 5
        // EF = (50 - MP * 6) / 4
        double ef = (50.0 - mp * 6.0) / 4.0;
        return ef;
    }

    void mostraSituacao() {
        double mp = media();
        System.out.println("=== " + nome + " ===");
        System.out.println("Matricula: " + matricula);
        System.out.println("P1: " + p1 + " | P2: " + p2 + " | T: " + t);
        System.out.println("Media Parcial: " + mp);

        if (mp >= 7.0) {
            System.out.println("Situacao: APROVADO sem exame final");
        } else if (mp < 3.0) {
            System.out.println("Situacao: REPROVADO sem direito a exame final");
        } else {
            System.out.println("Situacao: Precisa do exame final");
            System.out.println("Nota minima no EF: " + provaFinal());
        }
    }
}
