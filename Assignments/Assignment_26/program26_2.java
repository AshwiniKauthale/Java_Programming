import java.util.*;

class Pattern
{
    public void Display(int iNo)
    {
        int iCnt = 0;

        for(iCnt = iNo; iCnt >= 1; iCnt--)
        {
            System.out.print(iCnt +"\t # \t");
        }
        System.out.println();
    }
}

class program26_2
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