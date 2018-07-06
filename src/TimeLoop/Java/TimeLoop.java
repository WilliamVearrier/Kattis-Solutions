
import java.util.Scanner;


public class TimeLoop {
    public static void main(String[] args) {
        TimeLoop b = new TimeLoop();
        b.run();
    }
    public void run(){
        Scanner sc = new Scanner(System.in);
        int value = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < value; i++) {
            System.out.println((i+1) + " Abracadabra");
        }
    }
}