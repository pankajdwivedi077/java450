import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class File5 {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.offer(30);
        System.out.println(q.peek());
        System.out.println(q.poll());
        System.out.println(q);

        Deque<Integer> dq = new ArrayDeque<>();
        q.offer(20);
     
        Queue<Integer> q2 = new ArrayDeque<>();
        
        Queue<Integer> pq = new PriorityQueue<>();
        pq.add(40);
        pq.add(22);
        System.out.println(pq.poll());

        Queue<Integer> pq2 = new PriorityQueue<>((a,b)->b-a);
        
    }
}
