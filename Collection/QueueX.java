import java.util.*;

class QueueX
{
    public static void main(String A[])
    {
        Queue<Integer> queue = new LinkedList<>();

        queue.offer(11);
        queue.offer(21);
        queue.offer(51);
        queue.offer(101);

        System.out.println(queue);

        System.out.println(queue.poll());

        System.out.println(queue);

        System.out.println(queue.peek());
    }
}