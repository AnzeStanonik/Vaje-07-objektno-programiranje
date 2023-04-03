public class Ura {
    private String cas;
    private Predmet predmet;
    Ura(String cas, Predmet predmet){
        this.cas = cas;
        this.predmet = predmet;
    }
    public String vrniCas(){
        return cas;
    }
    public Predmet vrnipredmet(){
        return predmet;
    }
}
