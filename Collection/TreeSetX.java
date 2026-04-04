
import java.util.*;

// Duplicate elements are not alloude
// Elements are in sorted format
// Implementation is based on BinarySearch tree


class TreeSetX
{
    public static void main(String A[])
    {
        Set<Integer> set = new TreeSet<>();

        set.add(11);
        set.add(21);
        set.add(51);
        set.add(101);
        set.add(111);
        set.add(11);    // Duplicate are are not alloud

        System.out.println(set);

        set.remove(51);

        System.out.println(set);

        System.out.println(set.contains(101));

        System.out.println(set.isEmpty());

        System.out.println(set.size());

        set.clear();

        System.out.println(set);
    }
}