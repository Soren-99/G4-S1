package esercizio2;

public class DipendentePartTime extends Dipendente {
    private int oreLavorate;
    private double salarioOrario;

    public DipendentePartTime(int matricola, int oreLavorate, double salarioOrario) {
        super(matricola, 0);
        this.oreLavorate = oreLavorate;
        this.salarioOrario = salarioOrario;
    }

    @Override
    public double calculateSalary() {
        return oreLavorate * salarioOrario;
    }
}
