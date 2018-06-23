
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author William Vearrier
 */
public class ABC {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        String[] abc = s.split(" ");
        int[] abci = {
            Integer.parseInt(abc[0]),
            Integer.parseInt(abc[1]),
            Integer.parseInt(abc[2])
        };
        Arrays.sort(abci);
        
        String out = "";
        
        for (int i = 0; i < 3; i++) {
            switch (t.charAt(i)) {
                    case 'A':
                            out += " " + abci[0];
                            break;
                    case 'B':
                        out += " " + abci[1];
                        break;
                    case 'C':
                        out += " " + abci[2];
                        break;
            }
        }
        System.out.print(out.substring(1));
            
    }
}