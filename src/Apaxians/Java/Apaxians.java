
import java.util.Scanner;


/**
 *
 * @author William Vearrier
 */
public class Apaxians {
    public static void main(String[] args) {
        new Apaxians().run();
        
    }
    public void run(){
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        char[] vals = line.toCharArray();
        int counter = 0;
        while(counter < vals.length - 1){
            if(vals[counter] == vals[counter+1]){
                vals = remove(vals, counter);
                counter--;
            }
            counter++;
        }
        System.out.println(vals);
    }
    private char[] remove(char[] arr, int index){
        int numElts = arr.length - ( index + 1 ) ;
        System.arraycopy( arr, index + 1, arr, index, numElts );
        char[] arr2 = new char[arr.length - 1];
        System.arraycopy(arr, 0, arr2, 0, arr2.length);
        return arr2;
    }
}
