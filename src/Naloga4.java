import java.util.Scanner;
class Naloga4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        String lik = sc.nextLine();
        if(lik.equals("pravokotnik")){
            a = 2;
        }else if(lik.equals("kvadrat")){
            a = 1;
        }else{
            a = 3;
        }
        int[] stranice = new int[a];
        for(int i = 0; a > i; i++){
            stranice[i] = sc.nextInt();
        }
        String metoda = sc.next();
        Trikotnik t = new Trikotnik(stranice[0], stranice[1], stranice[2]);
        if(metoda.equals("stranice")){
        t.stranice();
        }
    }
}