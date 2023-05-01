import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;
import java.util.Stack;





public class task_2 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Queue <Integer> queue = new ArrayDeque<>();
        for (int i = 0; i < 15; i++) {
            stack.push(i);
        }

        for (int i = 0; i < 15; i++) {
            queue.add(i);
        }

        while (!stack.isEmpty()){
            System.out.print(stack.pop() + " ");
            //System.out.println();
        }
        System.out.println();

        while(!queue.isEmpty()){
            System.out.print(queue.remove() + " ");
            //System.out.println();
        }
        System.out.println();

        PriorityQueue<Integer> pQueue = new PriorityQueue<>();
        Random rand = new Random();
        for (int i = 0; i < 15; i++) {
            pQueue.add(rand.nextInt(10));
        }

        while(!pQueue.isEmpty()){
            System.out.print(pQueue.remove() + " ");
            //System.out.println();
        }
        System.out.println();
    }
}
