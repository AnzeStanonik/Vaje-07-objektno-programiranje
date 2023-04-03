class Naloga8{
    public static void main(String[] args){
        Urnik u = new Urnik(13);
        Predmet[] predmeti = new Predmet[13];
        predmeti[0] = new Predmet("RAC" , "Racunalnistvo", "Jan Susnik");
        predmeti[1] = new Predmet("SVZ" , "Sportna vzgoja", "Ivan Brajdic");
        predmeti[2] = new Predmet("MAT" ,"Matematika", "Goran Vujovic");
        predmeti[3] = new Predmet("/", "Prosto", "Smotko");
        predmeti[4] = new Predmet("NEM", "Nemscina", "Simona Rozman");
        predmeti[5] = new Predmet("ANG", "Anglescina", "Rok Skrlec");
        predmeti[6] = new Predmet("RU", "Razredna ura", "Simona Rozman");
        predmeti[7] = new Predmet("FIL", "Filane paprike", "Marko Arnez");
        predmeti[8] = new Predmet("ZGO", "Zgodovina", "Jerca Kebe");
        predmeti[9] = new Predmet("SLO", "Slovenscina", "Jolanda Skofic Zakotnik");
        predmeti[10] = new Predmet("LAVrac", "Laboratorijske vaje iz racunalnistva", "Jasn Susnik");
        predmeti[11] = new Predmet("RSO", "Racunalniski sistemi in omrezja", "Lina Decman Molan");
        predmeti[12] = new Predmet("FIZ", "Fizika","Natasa Medved");
        Urnik u2 = new Urnik(predmeti);
        Ura[][] ura = new Ura[5][10];
        ura[0][0] = new Ura(" 7:15 ", u2.pridobiPredmet("RAC"));
        ura[0][1] = new Ura(" 8:05 ", u2.pridobiPredmet("RAC"));
        ura[0][2] = new Ura(" 8:55 ", u2.pridobiPredmet("SVZ"));
        ura[0][3] = new Ura(" 9:45 ", u2.pridobiPredmet("SVZ"));
        ura[0][4] = new Ura(" 10:35 ", u2.pridobiPredmet("MAT"));
        ura[0][5] = new Ura(" 11:25 ", u2.pridobiPredmet("/"));
        ura[0][6] = new Ura(" 12:15 ", u2.pridobiPredmet("NEM"));
        ura[0][7] = new Ura(" 13:05 ", u2.pridobiPredmet("ANG"));
        ura[0][8] = new Ura(" 13:55 ", u2.pridobiPredmet("RU"));
        ura[0][9] = new Ura(" 14:45 ", u2.pridobiPredmet("/"));
        ura[1][0] = new Ura(" 7:15 ", u2.pridobiPredmet("RAC"));
        ura[1][1] = new Ura(" 8:05 ", u2.pridobiPredmet("RAC"));
        ura[1][2] = new Ura(" 8:55 ", u2.pridobiPredmet("SVZ"));
        ura[1][3] = new Ura(" 9:45 ", u2.pridobiPredmet("SVZ"));
        ura[1][4] = new Ura(" 10:35 ", u2.pridobiPredmet("MAT"));
        ura[1][5] = new Ura(" 11:25 ", u2.pridobiPredmet("/"));
        ura[1][6] = new Ura(" 12:15 ", u2.pridobiPredmet("NEM"));
        ura[1][7] = new Ura(" 13:05 ", u2.pridobiPredmet("ANG"));
        ura[1][8] = new Ura(" 13:55 ", u2.pridobiPredmet("RU"));
        ura[1][9] = new Ura(" 14:45 ", u2.pridobiPredmet("/"));
        ura[2][0] = new Ura(" 7:15 ", u2.pridobiPredmet("RAC"));
        ura[2][1] = new Ura(" 8:05 ", u2.pridobiPredmet("RAC"));
        ura[2][2] = new Ura(" 8:55 ", u2.pridobiPredmet("SVZ"));
        ura[2][3] = new Ura(" 9:45 ", u2.pridobiPredmet("SVZ"));
        ura[2][4] = new Ura(" 10:35 ", u2.pridobiPredmet("MAT"));
        ura[2][5] = new Ura(" 11:25 ", u2.pridobiPredmet("/"));
        ura[2][6] = new Ura(" 12:15 ", u2.pridobiPredmet("NEM"));
        ura[2][7] = new Ura(" 13:05 ", u2.pridobiPredmet("ANG"));
        ura[2][8] = new Ura(" 13:55 ", u2.pridobiPredmet("RU"));
        ura[2][9] = new Ura(" 14:45 ", u2.pridobiPredmet("/"));
        ura[3][0] = new Ura(" 7:15 ", u2.pridobiPredmet("RAC"));
        ura[3][1] = new Ura(" 8:05 ", u2.pridobiPredmet("RAC"));
        ura[3][2] = new Ura(" 8:55 ", u2.pridobiPredmet("SVZ"));
        ura[3][3] = new Ura(" 9:45 ", u2.pridobiPredmet("SVZ"));
        ura[3][4] = new Ura(" 10:35 ", u2.pridobiPredmet("MAT"));
        ura[3][5] = new Ura(" 11:25 ", u2.pridobiPredmet("/"));
        ura[3][6] = new Ura(" 12:15 ", u2.pridobiPredmet("NEM"));
        ura[3][7] = new Ura(" 13:05 ", u2.pridobiPredmet("ANG"));
        ura[3][8] = new Ura(" 13:55 ", u2.pridobiPredmet("RU"));
        ura[3][9] = new Ura(" 14:45 ", u2.pridobiPredmet("/"));
        ura[4][0] = new Ura(" 7:15 ", u2.pridobiPredmet("RAC"));
        ura[4][1] = new Ura(" 8:05 ", u2.pridobiPredmet("RAC"));
        ura[4][2] = new Ura(" 8:55 ", u2.pridobiPredmet("SVZ"));
        ura[4][3] = new Ura(" 9:45 ", u2.pridobiPredmet("SVZ"));
        ura[4][4] = new Ura(" 10:35 ", u2.pridobiPredmet("MAT"));
        ura[4][5] = new Ura(" 11:25 ", u2.pridobiPredmet("/"));
        ura[4][6] = new Ura(" 12:15 ", u2.pridobiPredmet("NEM"));
        ura[4][7] = new Ura(" 13:05 ", u2.pridobiPredmet("ANG"));
        ura[4][8] = new Ura(" 13:55 ", u2.pridobiPredmet("RU"));
        ura[4][9] = new Ura(" 14:45 ", u2.pridobiPredmet("/"));
        for(int i = 0; i < 10; i++){
            System.out.println(" ");
            System.out.print(i+1);
            for(int j = 0; j < 5; j++){
            System.out.print(ura[j][i].vrniCas() + ura[j][i].vrnipredmet());
            }
        }

    }
}