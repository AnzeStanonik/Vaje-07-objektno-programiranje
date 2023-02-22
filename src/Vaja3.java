import java.util.Scanner;

//import java.util.Random;
//import java.util.Scanner;

class Vaja3{
    public static void main(String[] args){
    int[] a = new int[3];

        Scanner sc = new Scanner(System.in);
        int pos = sc.nextInt();
       // Random rand = new Random();
        a[0] = 6;
        a[1] = 12;
        a[2] = 20;
         for(int i = 0; i<3; i++) {
            Kocka k = new Kocka(a[i]);   //new Kocka(a[i], sc.nextInt() , rand.nextInt(20));
          //  Kocka(a[i]);
            int[] aaa = k.zaporedje(pos);
            for(int j = 0; j < aaa.length; j++)
                System.out.println(aaa[j]);
        }
    }
}
