import java.util.*;

class CollectionClassX
{
    public static void main(String A[])
    {
        List<Integer> list = new ArrayList<>();

        list.add(32);
        list.add(32);
        list.add(42);
        list.add(92);
        list.add(82);

        System.out.println("min element : "+Collections.min(list));
        System.out.println("min element : "+Collections.max(list));
        System.out.println(Collections.frequency(list,32));

        Collections.sort(list);

        System.out.println(list);

        Collections.sort(list,Comparator.reverseOrder());

        System.out.println(list);
    }
}