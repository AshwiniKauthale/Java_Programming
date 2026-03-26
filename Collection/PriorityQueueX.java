import java.util.*;

class PriorityQueueX
{
    public static void main(String A[])
    {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.offer(11);
        pq.offer(21);
        pq.offer(51);
        pq.offer(51);

        System.out.println(pq);

        System.out.println(pq.peek());

        pq.poll();

        System.out.println(pq);

    }
}