import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<String>();

        queue.offer("Karen");
        queue.offer("Chad");
        queue.offer("Steve");
        queue.offer("Harold");

        System.out.println(queue);

        System.out.println("The first one in queue" +queue.peek());
        //Removing top of queue twice
        queue.poll();
        queue.poll();

        //Now shoudl be Steve since Karen and Chad were removed
        System.out.println("The first one in queue" +queue.peek());


        /*
        Where are Queues useful?
        1. Keyboard Buffer
        2. Printer Queue
        3. Used in Linked Lists, PriorityQueues, Breadth-first search
         */

        //Priority Queue vs Queue, PriorityQueue has a priority. It pops the highest prioritiues first before elemets with lower priority.
        PriorityQueue<Double> pQueue = new PriorityQueue<>();

        pQueue.offer(3.0);
        pQueue.offer(1.0);
        pQueue.offer(8.0);
        pQueue.offer(2.0);
        System.out.println(pQueue);

        // See the order they are polled(removed from queue)
        while(!pQueue.isEmpty())
        {
            System.out.println("Remoiving: " +pQueue.poll());
        }



    }
}