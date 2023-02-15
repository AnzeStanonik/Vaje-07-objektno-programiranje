class Kocka{
    String[] vrednostii = new String[6];
    String[] vrednosti(){
        for(int i=1; i<6; i++){
            vrednostii[i] = "Ploskev: "+i+" Stevilo pik: "+i;
        }
        return vrednostii;
    }
}