import java.util.*;

class SecondLargest
{
    public static int SecLargest(int []Brr)
    {
        Arrays.sort(Brr);

        return Brr[Brr.length - 2];
    }

    public static int SecLargestX(int []Brr)
    {
        int SecMax = Brr[0];
        int Max = Brr[0];

        int i = 0;

        for(i = 0; i < Brr.length; i++)
        {
            if(Brr[i] >= Max)
            {
                SecMax = Max;
                Max = Brr[i];
            }
        }

        return SecMax;
    }

    public static void main(String A[])
    {
        int iRet = 0;
        int Arr[] = {10,67,89,34,2,5,6,7,45,89,90,101,555,67,89};

        iRet = SecLargest(Arr);

        System.out.println("Second Largest element is : "+ iRet);

        iRet = SecLargestX(Arr);

        System.out.println("Second Largest element is : "+ iRet);
    }
}