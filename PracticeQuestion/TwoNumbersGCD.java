import java.util.*;

class TwoNumbersGCD
{
    public static int GreatestCommonDivisor(int No1, int No2)
    {
        int GCD = 0;

        int i = 1;
        int j = 1;
        int n = No1 / 2 + 1;
        int m = No2 / 2 + 1;

        while(i <= n && i <= j)
        {
            if((No1 % i == 0) && (No2 % i) == 0)
            {
                GCD = i;
            }
            i++;
            j++;
        }

        return GCD;
    }
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iRet = 0;
        int Value1 = 0, Value2 = 0;

        System.out.println("Enter First Number");
        Value1 = sobj.nextInt();

        System.out.println("Enter First Number");
        Value2 = sobj.nextInt();

        iRet = GreatestCommonDivisor(Value1,Value2);

        System.out.println("Greatest Common GCD is : "+ iRet);

        sobj = null;
    }
}