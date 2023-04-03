public class Predmet {
    private String okrajsava, ime, opis;
    Predmet(String okrajsava, String ime){
        this.okrajsava = okrajsava;
        this.ime = ime;
    }
    Predmet(String okrajsava, String ime, String opis){
        this.okrajsava = okrajsava;
        this.ime = ime;
        this.opis = opis;
    }
    public String vrniOkrajsavo(){
        return okrajsava;
    }
    public String vrniIme(){
        return ime;
    }
    public String vrniOpis(){
        return opis;
    }
}
