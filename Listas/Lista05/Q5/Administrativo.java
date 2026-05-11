// Administrativo e um tipo de Assistente, com turno e adicional noturno
public class Administrativo extends Assistente {
    private String turno; // "dia" ou "noite"
    private double adicionalTurno;

    public Administrativo(String nome, double salario, int matricula, String turno, double adicionalTurno) {
        super(nome, salario, matricula);
        this.turno = turno;
        this.adicionalTurno = adicionalTurno;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public double getAdicionalTurno() {
        return adicionalTurno;
    }

    public void setAdicionalTurno(double adicionalTurno) {
        this.adicionalTurno = adicionalTurno;
    }

    // regra: 13o NAO tem adicional noturno
    // entao: 12 meses com adicional + 1 mes (13o) sem adicional
    @Override
    public double ganhoAnual() {
        double salarioComAdicional = getSalario() + adicionalTurno;
        return (salarioComAdicional * 12) + getSalario(); // 12 com adicional + 13o sem adicional
    }

    @Override
    public String toString() {
        return super.toString() + ", Turno: " + turno + ", Adicional: R$" + adicionalTurno;
    }
}