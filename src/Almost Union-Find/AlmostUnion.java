
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author William Vearrier
 */
public class AlmostUnion {
    public static void main(String[] args) throws Exception {
        new AlmostUnion().run();
    }

    public void run() throws Exception{
        Scanner sc = new Scanner(System.in);

        String[] vals = sc.nextLine().split(" ");
        int size = Integer.parseInt(vals[0]);
        int commands = Integer.parseInt(vals[1]);
        List<Set<Integer>> list = new ArrayList<>();
        for (int i = 1; i <= size; i++) {
            Set<Integer> s = new HashSet<>();
            s.add(i);
            list.add(s);
        }
        for (int i = 0; i < commands; i++) {
            int[] options = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            switch (options[0]) {
            case 1:
                union(options[1], options[2], list);
                break;
            case 2:
                move(options[1], options[2], list);
                break;
            case 3:
                print(options[1], list);
                break;
            }
            //printSets(list);
        }
        
    }

    private void union(int p, int q, List<Set<Integer>> list) {
        Set<Integer> pSet = null;
        Set<Integer> qSet = null;
        for (Set<Integer> s : list) {
            if (s.contains(p) && s.contains(q)) {
                break;
            }
            if (s.contains(p))
                pSet = s;
            if (s.contains(q))
                qSet = s;
        }
        if (pSet != null && qSet != null) {
            qSet.addAll(pSet);
            list.remove(pSet);
        }
    }

    private void move(int p, int q, List<Set<Integer>> list) {
        Set<Integer> pSet = null;
        Set<Integer> qSet = null;
        for (Set<Integer> s : list) {
            if (s.contains(p) && s.contains(q)) {
                break;
            }
            if (s.contains(p))
                pSet = s;
            if (s.contains(q))
                qSet = s;
        }
        if (pSet != null && qSet != null) {
            pSet.remove(p);
            qSet.add(p);
            if (pSet.isEmpty())
                list.remove(pSet);
        }
    }

    private void print(int p, List<Set<Integer>> list) {
        for (Set<Integer> s : list) {
            if (s.contains(p)) {
                int sum = 0;
                for (int i : s) {
                    sum += i;
                }
                System.out.println(s.size() + " " + sum);
                break;
            }
        }
    }
    
    private void printSets(List<Set<Integer>> list){
        System.out.println("Sets:");
        for (Set<Integer> set : list) {
            System.out.println(Arrays.toString(set.toArray()));
        }
    }
}
