class Uporabnik{
    private String ime, priimek;
    private int klici, sporocila, prenosPodatkov;
    public Uporabnik(String ime, String priimek, int klici, int sporocila, int prenosPodatkov){
        this.ime = ime;
        this. priimek = priimek;
        this.klici = klici;
        this.sporocila = sporocila;
        this.prenosPodatkov = prenosPodatkov;
    }
    public String vrniIme(){
        return ime + " " + priimek;
    }
    public int vrniklici(){//ne sme se imenovati enako, kot polje
        return klici;
    }
    public int vrnisporocila(){
        return sporocila;
    }
    public int vrniPrenosPodatkov(){
        return prenosPodatkov;
    }
}