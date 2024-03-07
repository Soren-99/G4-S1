package esercizio2;

public class DipendenteFullTime extends Dipendente {

    double stipendioMensile;
    public DipendenteFullTime(int matricola, double stipendioMensile) {
        super(matricola, stipendioMensile);
        this.stipendioMensile = stipendioMensile;
    }
    @Override
    public double calculateSalary() {
        return getStipendio();
    }
}
