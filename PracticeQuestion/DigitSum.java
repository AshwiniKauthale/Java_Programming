import java.util.*;

class DigitSum
{
    public static int SumDigits(int No)
    {
        int Sum = 0;

        if(No < 0)
        {
            No = -No;
        }

        while(No != 0)
        {
            Sum = Sum + (No % 10);
            No = No / 10;
        }

        return Sum;
    }
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iRet = 0;
        int Value = 0;

        System.out.println("Enter the number");
        Value = sobj.nextInt();

        iRet = SumDigits(Value);

        System.out.println("Sum of Digits is : "+ iRet);

        sobj = null;
    }
}