import java.util.*;

class CountEvenOdd
{
    public static void Count(List<Integer> list)
    {
        int Even = 0;
        int Odd = 0;

        for(int n : list)
        {
            if((n % 2) == 0)
            {
                Even++;
            }
            else
            {
                Odd++;
            }
        }

        System.out.println("Even Count is : "+Even);
        System.out.println("Odd Count is : "+Odd);

    }
    public static void main(String A[])
    {
        List<Integer> list = List.of(1,5,7,8,4,12,15,36,45,90);

        Count(list);
    }
}