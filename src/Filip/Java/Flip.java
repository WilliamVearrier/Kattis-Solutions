
import java.util.Scanner;

public class Flip {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String s = sc.nextLine();
            String[] split = s.split(" ");
            StringBuilder sb;
            sb = new StringBuilder(split[0]);
            int a = Integer.parseInt(sb.reverse().toString());
            sb = new StringBuilder(split[1]);
            int b = Integer.parseInt(sb.reverse().toString());
            if (b > a)
                System.out.print(b);
            else
                System.out.print(a);
        }
    }
}