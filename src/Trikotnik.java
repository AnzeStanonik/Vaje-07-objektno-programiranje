class Trikotnik{
    int s;
    int s2;
    int s3;
    Trikotnik(int stranica,int stranica2,int stranica3){
        s = stranica;
        s2 = stranica2;
        s3 = stranica3;
    }
    void stranice(){
        System.out.println(s + " " + s2 + " " +  s3);
    }
    void obseg(){
        int o = s + s2 + s3;
        System.out.println(o);
    }
    void ploscina(){
        double sd = s;
        double sd2 = s2;
        double sd3 = s3;
        double o = sd + sd2 + sd3;
        double p = Math.sqrt(o/2 * (o/2 - sd) * (o/2 - sd2) * (o/2 - sd3));
        System.out.println(p);
    }
}