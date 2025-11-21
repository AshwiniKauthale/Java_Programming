import java.util.*;

class Pattern
{
    public void Display(int iNo)
    {
        int iCnt = 0;

        for(iCnt = 2; iCnt <= iNo * 2; iCnt++)
        {
            if((iCnt % 2) == 0)
            {
                System.out.print(iCnt +"\t");
            }
        }
        System.out.println();
    }
}

class program26_5
{
    public static void main(String A[])
    {
        int iValue  = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Frequency :");
        iValue = sobj.nextInt();

        Pattern pobj = new Pattern();
        pobj.Display(iValue);
    }
}