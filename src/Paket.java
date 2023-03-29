class Paket{
    private int klici, sporocila, prenosPodatkov;
    public Paket(int klici, int sporocila, int prenosPodatkov){
        this.klici = klici;
        this. sporocila = sporocila;
        this.prenosPodatkov = prenosPodatkov;
    }
    public String Opis(){
        return "Klici: " + klici + ", Sporocila: " + sporocila + ", Prenos podatkov: " + prenosPodatkov;
    }
    public boolean ustreza(int klici, int sporocila, int prenosPodatkov){
        return this.klici >= klici && this.sporocila >= sporocila && this.prenosPodatkov >= prenosPodatkov; 
    }
}