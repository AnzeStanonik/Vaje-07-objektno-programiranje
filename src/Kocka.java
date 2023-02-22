import java.util.Random;
class Kocka{
    int steviloPloskev;

    Kocka(int steviloPl) {
        steviloPloskev = steviloPl;
    }

    int[] poskusi = new int[steviloPloskev]; //{1, 2, 3};

    void vrednosti(int steviloPloskev){
        for(int i = 0; i < steviloPloskev; i++){
            System.out.println
            ("ploskev "+ i + " = stevilo pik " + i );
        }
    }
    
  /*   int[] metanje(int steviloP){
        Random rand = new Random(steviloP);
        for(int i = 0; i < poskusi.length; i++){
            poskusi[i] = rand.nextInt(steviloP);
        }
        return poskusi;
    }*/
    int[] zaporedje(int poskusov) {
        Random r = new Random();
        poskusi = r.ints(poskusov, 0, steviloPloskev).toArray();
        for(int i = 0; i < poskusov; i++){
            poskusi[i]++;
        }
        return poskusi;
    }

}
