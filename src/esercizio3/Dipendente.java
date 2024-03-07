package esercizio3;


public class Dipendente implements Lavoratore {
    private int matricola;
    private double stipendio;

    public Dipendente (int matricola, double stipendio){
        this.matricola = matricola;
        this.stipendio = stipendio;

    }


    @Override
    public void checkIn() {
        System.out.println("Dipendente con matricola: " + matricola + " sta per iniziare");
    }
}
