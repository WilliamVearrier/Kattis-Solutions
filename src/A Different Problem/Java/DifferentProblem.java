
import java.util.Scanner;

/**
 *
 * @author William Vearrier
 */
public class DifferentProblem {
    public static void main(String[] args) {
        DifferentProb b = new DifferentProb();
        b.run();
    }
    public void run(){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String line = sc.nextLine();
            String[] vals = line.split(" ");
            long one = Long.parseLong(vals[0]);
            long two = Long.parseLong(vals[1]);
            
            if(one > two)
                System.out.println(one - two);
            else
                System.out.println(two - one);
            
        }
    }
}
