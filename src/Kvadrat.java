class Kvadrat{
    int s;
    Kvadrat(int stranica){
        s = stranica;
    }
    void stranice(){
        System.out.println(s);
    }
    void obseg(){
        int o = s * 4;
        System.out.println(o);
    }
    void ploscina(){
        int p = s * s;
        System.out.println(p);
    }
}