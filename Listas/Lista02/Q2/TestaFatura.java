
public class TestaFatura {
    public static void main(String[] args) {
        // Fatura normal
        Fatura f1 = new Fatura(1, "Teclado mecanico", 3, 250.0);
        f1.mostraFatura();

        System.out.println();

        // Fatura com quantidade negativa (deve virar 0)
        Fatura f2 = new Fatura(2, "Mouse gamer", -5, 180.0);
        f2.mostraFatura();

        System.out.println();

        // Fatura com preço negativo (deve virar 0.0)
        Fatura f3 = new Fatura(3, "Monitor 24pol", 2, -999.0);
        f3.mostraFatura();
    }
}
