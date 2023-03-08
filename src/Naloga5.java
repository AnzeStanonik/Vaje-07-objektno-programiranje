import java.util.Scanner;
class Naloga5{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String telo = sc.next();
        for(int i = 0; i < 2; i++){
            if(telo.equals("kocka")){
                int d[] new int[2];
                d[i] = sc.nextInt();
                Kocka k = new Kocka(d[i]);
                

            }else if(telo.equals("kvader")){
                
            }else{
                System.out.println("Napacen vnos telesa");
            }
        }
        System.out.println()
    }
}