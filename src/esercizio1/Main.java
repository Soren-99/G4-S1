package esercizio1;


public class Main {

    public static void main(String[] args){

        Dipendente dipendente1 = new Dipendente(1455, 1400, Dipendente.Dipartimento.PRODUZIONE);
        Dipendente dipendente2 = new Dipendente(1748, 1550, Dipendente.Dipartimento.AMMINISTRAZIONE);
        Dipendente dipendente3 = new Dipendente(5849, 1200, Dipendente.Dipartimento.VENDITE);

        Dipendente[] dipendenti = {dipendente1, dipendente2, dipendente3};

        for (Dipendente dipendente: dipendenti){
            System.out.println("Matricola del dipendente: " + dipendente.getMatricola());
        }
    }
}
