
public class DemRegistroAcademico {
    public static void main(String[] args) {
   
        RegistroAcademico michel = new RegistroAcademico("Michel", 2, 10);
        RegistroAcademico diego = new RegistroAcademico("Diego", 2, 20);
        RegistroAcademico daniel = new RegistroAcademico("Daniel", 2, 30);
        
        daniel.imprime();
        michel.imprime();
        diego.imprime();
    }
    
}
