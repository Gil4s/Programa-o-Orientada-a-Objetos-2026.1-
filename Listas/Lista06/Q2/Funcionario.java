public class Funcionario {

    private String nome;
    private String cpf;
    private double salarioPorHora;

    // Construtor 1: recebe apenas o nome, salario padrao = R$2,00/h
    public Funcionario(String nome) {
        this.nome = nome;
        this.cpf = "nao informado";
        this.salarioPorHora = 2.0;
    }

    // Construtor 2: recebe nome e salario por hora
    public Funcionario(String nome, double salarioPorHora) {
        this.nome = nome;
        this.cpf = "nao informado";
        this.salarioPorHora = salarioPorHora;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalarioPorHora() {
        return salarioPorHora;
    }

    public void setSalarioPorHora(double salarioPorHora) {
        this.salarioPorHora = salarioPorHora;
    }

    // Calcula o salario total com base nas horas trabalhadas
    public double calcularSalarioTotal(int horasTrabalhadas) {
        return salarioPorHora * horasTrabalhadas;
    }

    @Override
    public String toString() {
        return "Funcionario: " + nome + " | CPF: " + cpf + " | Salario/hora: R$" + salarioPorHora;
    }
}