package esercizio3;
import esercizio2.Dipendente;

public abstract class Dipendente implements Lavoratore {
    private int matricola;
    private double stipendio;

    public Dipendente(int matricola, double stipendio){
        this.matricola = matricola;
        this.stipendio = stipendio;

    }

    public abstract double calculateSalary();

    public int getMatricola(){
        return matricola;
    }
    public double getStipendio(){
        return stipendio;
    }

    @Override
    public void checkIn() {
        System.out.println("Dipendente con matricola: " + matricola + "sta per iniziare");
    }
}
