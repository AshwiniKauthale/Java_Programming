
import java.util.Arrays;


class MaximumElement
{
    public static int Maximum(int []Brr)
    {
        int Max = Brr[0];
        int i = 0;

        for(i = 0; i < Brr.length; i++)
        {
            if(Brr[i] > Max)
            {
                Max = Brr[i];
            }
        }

        return Max;
    }

    public static int MaximumX(int []Brr)
    {
        Arrays.sort(Brr);

        return Brr[Brr.length - 1];
    }
    
    public static void main(String A[])
    {
        int iRet = 0;
        int Arr[] = {10,58,53,56,90,101,56,4,7};

        iRet = Maximum(Arr);

        System.out.println("Maximum element is : "+ iRet);

        iRet = MaximumX(Arr);

        System.out.println("Maximum element is : "+ iRet);
    }
}