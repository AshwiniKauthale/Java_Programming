import java.util.*;

class Logic
{
    public void Display(int Arr[],int iSize)
    {
        int iCnt = 0;

        for(iCnt = 0; iCnt < iSize; iCnt++)
        {
            if((Arr[iCnt] % 11) == 0)
            {
                System.out.println(Arr[iCnt]);
            }
        }
    }
}
class program25_5
{
    public static void main(String A[])
    {
        int iCnt = 0, iRet = 0, iLength = 0;

        Scanner sobj = new Scanner(System.in);

        Logic lobj = new Logic();

        System.out.println("Enter number of elements : ");
        iLength = sobj.nextInt();

        int Arr[] = new int[iLength];

        System.out.println("Enter the elements :");

        for(iCnt = 0; iCnt < iLength; iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }

        lobj.Display(Arr,iLength);

        lobj = null;
        sobj = null;

        System.gc();
    }
}