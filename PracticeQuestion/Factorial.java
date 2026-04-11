import java.util.*;

class Factorial
{
    public static int calcFact(int No)
    {
        if(No == 0)
        {
            return 1;
        }
        
        int iFact = 1;

        while(No != 0)
        {
            iFact = iFact * No;
            No--;
        }

        return iFact;
    }
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Value = 0;
        int iRet = 0;

        System.out.println("Enter the Number : ");
        Value = sobj.nextInt();

        iRet = calcFact(Value);

        System.out.println("Factorial is : " + iRet);

        sobj = null;
    }
}