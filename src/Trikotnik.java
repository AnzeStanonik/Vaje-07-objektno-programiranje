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
}