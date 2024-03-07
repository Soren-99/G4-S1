package esercizio2;

import esercizio3.Volontario;


public class main {
    public static void main(String[] args){

        Dipendente dipendente1 = new DipendenteFullTime(1455, 1600);
        Dipendente dipendente2 = new DipendentePartTime(1748, 18, 28);
        Dipendente dipendente3 = new Dirigente(5849, 40000);

        double stipendioDipendente1 = dipendente1.calculateSalary();
        double stipendioDipendente2 = dipendente2.calculateSalary();
        double stipendioDipendente3 = dipendente3.calculateSalary();

        System.out.println("Stipendio dipendente 1: " + stipendioDipendente1);
        System.out.println("Stipendio dipendente 2: " + stipendioDipendente2);
        System.out.println("Stipendio dipendente 3: " + stipendioDipendente3);

    }

}
