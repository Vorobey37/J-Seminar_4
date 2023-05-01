import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * task_1
 */
public class task_1 {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();
        long start = System.nanoTime();
        for (int i = 0; i < 1000000; i++) {
           list.add(i);
        }
        long end = System.nanoTime();
        System.out.println(end-start);
        
        start = System.nanoTime();
        for (int i = 0; i < 1000000; i++) {
           list2.add(i);
        }
        end = System.nanoTime();
        System.out.println(end-start);
        
        
    }
}