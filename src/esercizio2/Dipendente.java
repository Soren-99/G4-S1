package esercizio2;

public abstract class Dipendente {
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



}
