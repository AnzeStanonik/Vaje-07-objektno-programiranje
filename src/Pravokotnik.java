class Pravokotnik{
    int s;
    int s2;
    Pravokotnik(int stranica,int stranica2){
        s = stranica;
        s2 = stranica2;
    }
    void stranice(){
        System.out.println(s + " " + s2);
    }
    void obseg(){
        int o = 2 * (s + s2);
        System.out.println(o);
    }
    void ploscina(){
        int p = s * s2;
        System.out.println(p);
    }
}