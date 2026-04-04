import java.util.*;

class TreeMapX
{
    public static void main(String A[])
    {
        Map<String,Integer> number = new TreeMap<>();

        number.put("one",1);
        number.put("Two", 2);
        number.put("Three",3);

        number.put("Two", 23); // Override

        if(!number.containsKey("Two"))
        {
            number.put("Two",23);
        }

        System.out.println(number.containsValue(3));

        number.putIfAbsent("Two",23);

        System.out.println(number);

        for(Map.Entry<String,Integer> e : number.entrySet())
        {
            System.out.println(e);

            System.out.println(e.getKey());

            System.out.println(e.getValue());
        }

        for(String key : number.keySet())
        {
            System.out.println(key);
        }

        for(Integer value : number.values())
        {
            System.out.println(value);
        }

        System.out.println(number.isEmpty());

        number.clear();

        System.out.println(number);
    }
}