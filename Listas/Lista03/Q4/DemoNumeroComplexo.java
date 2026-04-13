public class DemoNumeroComplexo {
    public static void main(String[] args) {
        NumeroComplexo n1 = new NumeroComplexo(5f, 5.7f);
        System.out.println(n1); // 5.0 + 5.7i

        NumeroComplexo n2 = new NumeroComplexo(8f);
        System.out.println(n2); // 8.0 + 0.0i

        NumeroComplexo n3 = new NumeroComplexo();
        System.out.println(n3); // 0.0 + 0.0i

        NumeroComplexo n4 = new NumeroComplexo(3f, -4f);
        System.out.println(n4); // 3.0 - 4.0i

        /*// Essas duas linhas fazem a mesma coisa:
            System.out.println(n1.toString());
            System.out.println(n1); // Java chama toString sozinho */
    }
}