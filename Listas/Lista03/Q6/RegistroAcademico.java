/*6. Escreva uma versão da classe RegistroAcademico (vista em aula) que tenha o campo 
numeroDeMatriculas declarado como static, e que incremente o valor deste campo cada 
vez que uma instância da classe for criada. Use o atributo numeroDeMatriculas para 
definir o atributo matricula automaticamente com um valor diferente para cada instância. 
Escreva também uma aplicação que crie algumas instâncias da classe para demonstrar 
seu funcionamento.  */
public class RegistroAcademico {

    private String nome;
    private static int numeroDeMatriculas = 0; // compartilhado, conta total
    private int matricula;                      // individual de cada objeto
    private int codigoCurso;
    private double percentualCobranca;

    RegistroAcademico(String nome, int codigoCurso, double percentualCobranca) {
        this.nome = nome;
        this.codigoCurso = codigoCurso;
        this.percentualCobranca = percentualCobranca;
        numeroDeMatriculas++;
        this.matricula = numeroDeMatriculas; // guarda o valor atual como matricula
    }

    public double calculaMensalidade() {
        return 100 * codigoCurso * percentualCobranca;
    }

    public void imprime() {
        System.out.println("Matricula: " + this.matricula);
        System.out.println("Nome: " + this.nome);
        System.out.println("Codigo do curso: " + this.codigoCurso);
        System.out.println("Mensalidade: " + calculaMensalidade());
        System.out.println();
    }
}
