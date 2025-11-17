import java.util.*;

class Logic
{
    public boolean Check(int Arr[],int iSize)
    {
        int iCnt = 0;

        for(iCnt = 0; iCnt < iSize; iCnt++)
        {
            if(Arr[iCnt] == 11)
            {
                return true;
            }
        }
        return false;
    }
}
class program22_3
{
    public static void main(String[] args)
    {
        int iCnt = 0, iLength = 0;
        boolean bRet = false;

        Scanner sobj = new Scanner(System.in);

        Logic lobj = new Logic();

        System.out.println("Enter number of elements :");
        iLength = sobj.nextInt();

        int Arr[] = new int[iLength];

        System.out.println("Enter the elements :");

        for(iCnt = 0; iCnt < iLength; iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }

        bRet = lobj.Check(Arr,iLength);

        if(bRet == true)
        {
            System.out.println("11 is present int the data.");
        }
        else
        {
            System.out.println("11 is not present in the data.");
        }

        lobj = null;
        sobj = null;

        System.gc();
    }
}