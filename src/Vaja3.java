import java.util.Scanner;
import java.util.Random;
class Vaja3{
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      Random rand = new Random();
      Kocka k = new Kocka();
      int ploskve = sc.nextInt();
      System.out.println(k.vrednosti());
    }
}