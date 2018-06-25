import java.util.Scanner;

/**
 *
 * @author William Vearrier
 */
public class Bela {
    public static void main(String[] args) {
        Bela b = new Bela();
        b.run();
    }
    public void run(){
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] vals = line.split(" ");
        int hands = Integer.parseInt(vals[0]);
        char dom = vals[1].charAt(0);
        
        int points = 0;
        for (int i = 0; i < hands * 4; i++) {
            line = sc.nextLine();
            char card = line.charAt(0);
            char hand = line.charAt(1);
            
            switch (card) {
                case 'A':
                    points += 11;
                    break;
                case 'K':
                    points += 4;
                    break;
                case 'Q':
                    points += 3;
                    break;
                case 'J':
                    if(hand == dom)
                        points += 20;
                    else
                        points += 2;
                    break;
                case 'T':
                    points += 10;
                    break;
                case '9':
                    if(hand == dom)
                        points += 14;
                    break;
            }
        }
        
        System.out.println(points);
    }
}
