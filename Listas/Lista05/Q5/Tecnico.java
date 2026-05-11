// Tecnico e um tipo de Assistente, com bonus salarial
public class Tecnico extends Assistente {
    private double bonus;

    public Tecnico(String nome, double salario, int matricula, double bonus) {
        super(nome, salario, matricula);
        this.bonus = bonus;
    }

    public double getBonus() { return bonus; }
    public void setBonus(double bonus) { this.bonus = bonus; }

    // 12 meses com salario + bonus, mais 13o com bonus mas sem adicional noturno
    // regra: o 13o pode ter bonus (se aplicavel)
    @Override
    public double ganhoAnual() {
        double salarioComBonus = getSalario() + bonus;
        return (salarioComBonus * 12) + salarioComBonus; // 12 mensais + 13o (ambos com bonus)
    }

    @Override
    public String toString() {
        return super.toString() + ", Bonus: R$" + bonus;
    }
}