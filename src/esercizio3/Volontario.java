package esercizio3;

public class Volontario implements Lavoratore{
    private String nome;
    private int eta;
    private String cv;


    public Volontario(String nome, int eta, String cv){
        this.nome = nome;
        this.eta = eta;
        this.cv = cv;
    }

    public String getNome(){
        return nome;
    }

    public int getEta(){
        return eta;
    }

    public String getCv(){
        return cv;
    }
    @Override
    public void checkIn() {
        System.out.println("Il volontario: " + nome + " sta per iniziare");
    }


}
