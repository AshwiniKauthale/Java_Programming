import java.util.*;

class ArmstrongNumber
{
    public static Boolean CheckArmstrong(int No)
    {
        int iDigit = 0;
        int Sum = 0;
        int iCount = 0;
        int temp = No;

        while(No != 0)
        {
            No = No/ 10;
            iCount++;
        }

        No = temp;

        while(No != 0)
        {
            iDigit = No % 10;
            Sum = Sum + (int)Math.pow(iDigit,iCount);
            No = No / 10;
        }

        return (Sum == temp);
    }

    public static void main(String A[])
    {
        Boolean bRet = true;
        int Value = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Number");
        Value = sobj.nextInt();

        bRet = CheckArmstrong(Value);

        if(bRet)
        {
            System.out.println(Value + " is a Armstrong Number");
        }
        else
        {
            System.out.println(Value + " is not a Armstrong Number");
        }

        sobj = null;
    }
}