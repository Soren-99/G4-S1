package esercizio3;




import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args){


      Dipendente dipendente1 = new Dipendente(1455, 1600);
      Dipendente dipendente2= new Dipendente(1748, 18);
      Dipendente dipendente3= new Dipendente(5849, 40000);
      Volontario volontario1 =  new Volontario("Valerio", 34, "Esperienza in volontariato");


        List<Lavoratore> lavoratori = new ArrayList<>();
        lavoratori.add(dipendente1);
        lavoratori.add(dipendente2);
        lavoratori.add(dipendente3);
        lavoratori.add(volontario1);


        for (Lavoratore lavoratore: lavoratori){
          lavoratore.checkIn();
      }

    }
    }

