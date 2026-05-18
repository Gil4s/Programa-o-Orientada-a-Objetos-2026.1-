import java.util.ArrayList;


public class Agenda {


    private ArrayList<EntradaEmAgenda> compromisso = new ArrayList<>();

    public Agenda () {}

    public void addCompromisso (EntradaEmAgenda compromissoX){
        
        compromisso.add(compromissoX); 

    }

    public void listaDia (int dia, int mes, int ano){
        
        for (int i = 0; i<compromisso.size() ; i++) {
            // tipo -> Entrada em agenda para que eu consiga acessar os dados de dia, mes e ano. Se lembrar dessa tipagem aqui
            EntradaEmAgenda entrada = compromisso.get(i); // pegando os dados do índice passado como parâmetro nesse vetor
            
            if (entrada.ehNoDia(dia, mes, ano)) {  // argumento eu passo como que um dado somente, igual o C. Quero somente os dados da minha entrada, sem tipar nada// lembrar de configurar os parâmetros para o ehNoDia
                System.out.println(entrada.toString());
            } 

        }
    }
}