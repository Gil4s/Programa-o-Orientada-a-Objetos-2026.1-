public class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    // adiciona o valor do aumento diretamente ao salario
    public void aumentarSalario(double valor) {
        this.salario += valor;
    }

    // 12 salarios mensais + 13o salario
    public double ganhoAnual() {
        return salario * 13;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Salario: R$" + salario;
    }
}