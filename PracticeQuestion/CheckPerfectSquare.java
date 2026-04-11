import java.util.*;

class CheckPerfectSquare
{
    public static Boolean PerfectSquare(int No)
    {
        Boolean bFlag = false;
        int i = 0;

        if(No == 1)
        {
            return true;
        }

        for(i = 2; i < No / 2 + 1; i++)
        {
            if(No == i*i)
            {
                bFlag = true;
                break;
            }
        }
        return bFlag;
    }
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        Boolean bRet = false;

        System.out.println("Enter Number");
        int Value = sobj.nextInt();

        bRet = PerfectSquare(Value);

        if(bRet == true)
        {
            System.out.println(Value + " Its a Perfect Square");
        }
        else
        {
            System.out.println(Value + " Its not a perfect Square");
        }

        sobj = null;
    }
}