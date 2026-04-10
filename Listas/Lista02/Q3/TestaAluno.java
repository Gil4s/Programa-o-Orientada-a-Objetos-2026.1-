public class TestaAluno {
    public static void main(String[] args) {
        // Aprovado direto (MP >= 7)
        Aluno a1 = new Aluno(20231001, "Ana Lima", 8.0, 7.0, 9.0);
        a1.mostraSituacao();

        System.out.println();

        // Reprovado direto (MP < 3)
        Aluno a2 = new Aluno(20231002, "Bruno Souza", 1.0, 0.0, 2.0);
        a2.mostraSituacao();

        System.out.println();

        // Precisa de exame final (3 <= MP < 7)
        Aluno a3 = new Aluno(20231003, "Carla Dias", 5.0, 4.0, 6.0);
        a3.mostraSituacao();
    }
}