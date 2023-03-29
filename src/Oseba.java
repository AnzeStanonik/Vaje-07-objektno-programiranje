class Oseba{
    private String ime, priimek;
    private char spol;
    private int letoRojstva;
    private Oseba oce, mati;

    public Oseba(String ime, String priimek, char spol, int letoRojstva, Oseba oce, Oseba mati){
        this.ime = ime;
        this.priimek = priimek;
        this.spol = spol;
        this.letoRojstva = letoRojstva;
        this.oce = oce;
        this.mati = mati;
    }
    public String vrniIme(){
        return ime + " " + priimek;
    }
    public int starost(int leto){
        return leto - letoRojstva;
    }
    public String toString(){
        return vrniIme() + ", " + spol + ", " + letoRojstva; 
    }
    public boolean jeStarejsaOd(Oseba oseba){
        return letoRojstva < oseba.letoRojstva;
    }
    public boolean jeBratAlitSestraOd(Oseba oseba){
        return oce == oseba.oce && mati == oseba.mati; //primerjamo polnilniski lokaciji
    }
    public String imeOceta(){
        if(oce.ime != null){
            return oce.vrniIme();
        }
        return null;//samo prvi return se vrne
    }
    public String imeMatere(){
        if(mati.ime != null){
            return mati.vrniIme();
        }
        return null;//samo prvi return se vrne
    }

}