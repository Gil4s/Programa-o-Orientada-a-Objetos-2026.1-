public class app {

    public static void main (String []args) {

        
        EventoDelegacao delegacao = new EventoDelegacao(new DataHora(1, 1, 1, 1, 1), "qqr coisa");
        EventoHeranca heranca = new EventoHeranca("qqr coisa", 1, 1, 1, 1, 1);

        System.out.println(delegacao.toString());
        System.out.println(heranca.toString());
        
    }

}