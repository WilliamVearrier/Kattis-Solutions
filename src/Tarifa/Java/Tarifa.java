
import java.util.Scanner;


public class Tarifa {
    public static void main(String[] args) {
        Tarifa b = new Tarifa();
        b.run();
    }
    public void run(){
        Scanner sc = new Scanner(System.in);
        int monthlyAllow = Integer.parseInt(sc.nextLine());
        int months = Integer.parseInt(sc.nextLine());
        int total = 0;
        for (int i = 0; i < months; i++) {
            total += Integer.parseInt(sc.nextLine());
        }
        
        System.out.println( ( (months + 1) * monthlyAllow ) - total );
        
    }
}
