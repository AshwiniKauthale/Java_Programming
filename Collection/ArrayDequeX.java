import java.util.*;

class ArrayDequeX
{
    public static void main(String A[])
    {
        ArrayDeque<Integer> adq = new ArrayDeque<>();

        adq.offer(11);  // Add element at last by default
        adq.offerFirst(21); // Add element at first position
        adq.offerLast(51);  // Add element at last postion
        adq.offer(101);

        System.out.println(adq);

        System.out.println(adq.peek());
        System.out.println(adq.peekFirst());
        System.out.println(adq.peekLast());

        System.out.println(adq.poll());
        System.out.println("Poll : "+adq);

        System.out.println(adq.pollFirst());
        System.out.println("Poll : "+adq);

        System.out.println(adq.pollLast());
        System.out.println("Poll : "+adq);
    }
}