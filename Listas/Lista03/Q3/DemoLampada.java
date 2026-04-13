

public class DemoLampada {
    public static void main(String[] args) {
        Lampada lampada1 = new Lampada();

        lampada1.acende();
        lampada1.apaga();
        lampada1.mostraEstado();
        lampada1.acende();
        lampada1.apaga();
        lampada1.acende();
        lampada1.apaga();
        lampada1.acende();
        lampada1.mostraEstado();
        lampada1.apaga();
        lampada1.acende();
        lampada1.apaga();

        // Testando estaLigada
        lampada1.acende();
        System.out.println("Esta ligada? " + lampada1.estaLigada());
        lampada1.apaga();
        System.out.println("Esta ligada? " + lampada1.estaLigada());

        lampada1.quantLampAcesa();
    }
}
