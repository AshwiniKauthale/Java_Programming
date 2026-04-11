import java.util.*;

class CheckPrime
{
    public static Boolean isPrime(int no)
    {
        if(no == 1)
        {
            return false;
        }
        
        Boolean bFlag = true;
        int i = 0;

        for(i = 2; i <= no / 2; i++)
        {
            if((no % i) == 0)
            {
                bFlag = false;
                break;
            }
        }

        return bFlag;
    }

    public static void main(String A[])
    {
        Boolean bRet = false;
        Scanner sobj = new Scanner(System.in);

        int Value = 0;

        System.out.println("Enter the number : ");
        Value = sobj.nextInt();

        bRet = isPrime(Value);

        if(bRet == true)
        {
            System.out.println(Value + " is a prime number");
        }
        else
        {
            System.out.println(Value + " is not a prime number");
        }

        sobj = null;
    }
}