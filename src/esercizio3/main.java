package esercizio3;
import esercizio2.DipendenteFullTime;
import esercizio2.DipendentePartTime;
import esercizio2.Dirigente;

public class main {
    public static void main(String[] args){


      Dipendente dipendente1 = new DipendenteFullTime(1455, 1600);
      Dipendente dipendente2= new DipendentePartTime(1748, 18, 28);
      Dipendente dipendente3= new Dirigente(5849, 40000);
      Volontario volontario1 =  new Volontario("Valerio", 34, "Esperienza in volontariato");

      Lavoratore[] lavoratori ={dipendente1, dipendente2, dipendente3, volontario1};
      Volontario volontario = volontario1;

      for (Lavoratore lavoratore: lavoratori){
          lavoratore.checkIn();
      }
    }
    }

