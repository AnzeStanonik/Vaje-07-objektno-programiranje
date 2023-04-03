public class Urnik {
    private int steviloPredmetov;
    private Predmet[] predmeti;
    Urnik(int steviloPredmetov){
        this.steviloPredmetov = steviloPredmetov;
    }
    Urnik(Predmet[] predmeti){
        this.predmeti = predmeti;
    }
    // public void dodajPredmet(Predmet predmet){
        
    // }
    // public Predmet odstraniPredmet(Predmet predmet){
    //     return predmeti[3];
    // }
    private Predmet ret;
    public Predmet pridobiPredmet(String okrajsava){
        for (int i = 0; i < steviloPredmetov; i++)
        {
            if(okrajsava.equals(predmeti[i].vrniOkrajsavo())){
                ret = predmeti[i];
            }
        }
        return ret;
    }
    // public Predmet[] zbirkaPredmetov(){
    //     return predmeti;
    // }
    // public Ura dodajUro(int dan, Ura ura){

    // }
    // public Ura odstraniUro(int dan, String ura){

    // }
    // public int zbirkaUr(int dan){

    // }
    // public void izpisiVse(){
    //     System.out.println();
    // }
}
