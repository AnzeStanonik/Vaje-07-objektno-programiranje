class operater{
    private Paket[] paketi;
    public Operater(Paket[] paketi){
        this.paketi = paketi;
    }
    public void izpisiPakete(){
        for(int i = 0; i < paketi.length; i++){
            System.out.println(paketi[i].opis());
        }
    }
    public boolean ustreznaVrednst(Uporabnik uporabnik){
        
    }
}