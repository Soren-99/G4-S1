package esercizio2;

public class Dirigente extends Dipendente {
    private double salarioAnnuo;

    public Dirigente(int matricola, double salarioAnnuo) {
        super(matricola, 5550);
        this.salarioAnnuo = salarioAnnuo;

    }

    @Override
    public double calculateSalary() {

        return salarioAnnuo/12;
    }
}
