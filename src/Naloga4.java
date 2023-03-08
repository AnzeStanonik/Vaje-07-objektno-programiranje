import java.util.Scanner;
class Naloga4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String lik = sc.nextLine();

        if(lik.equals("pravokotnik")){
            int[] stranici = new int[2];
            for(int i = 0; 2 > i; i++){
                stranici[i] = sc.nextInt();
            }
            String metoda = sc.next();
            Pravokotnik p = new Pravokotnik(stranici[0], stranici[1]);
            if(metoda.equals("stranice")){
                p.stranice();
            }else if(metoda.equals("obseg")){
                p.obseg();
            }else if(metoda.equals("ploscina")){
                p.ploscina();
            }else{
                System.out.println("Napacen vnos metode");
            }

        }else if(lik.equals("kvadrat")){
            int stranica;
                stranica = sc.nextInt();
            String metoda = sc.next();
            Kvadrat k = new Kvadrat(stranica);
            if(metoda.equals("stranice")){
                k.stranice();
            }else if(metoda.equals("obseg")){
                k.obseg();
            }else if(metoda.equals("ploscina")){
                k.ploscina();
            }else{
                System.out.println("Napacen vnos metode");
            }

        }else if(lik.equals("trikotnik")){
                int[] stranice = new int[3];
            for(int i = 0; 3 > i; i++){
                stranice[i] = sc.nextInt();
            }
            String metoda = sc.next();
            Trikotnik t = new Trikotnik(stranice[0], stranice[1], stranice[2]);
            if(metoda.equals("stranice")){
                t.stranice();
            }else if(metoda.equals("obseg")){
                t.obseg();
            }else if(metoda.equals("ploscina")){
                t.ploscina();
            }else{
                System.out.println("Napacen vnos metode");
            }

        }else{
            System.out.println("Napacen vnos lika");
        }
    }
}