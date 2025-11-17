import java.util.Scanner;

class Logic
{
    public int Frequency(int Arr[], int iSize, int iNo)
    {
        int iCnt = 0, iCount = 0;

        for(iCnt = 0; iCnt < iSize; iCnt++)
        {
            if(Arr[iCnt] == iNo)
            {
                iCount++;
            }
        }
        return iCount;
    }
}
class program22_5
{
    public static void main(String A[])
    {
        int iCnt = 0, iLength = 0, iRet = 0, iValue = 0;

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

        System.out.println("Enter that one number :");
        iValue = sobj.nextInt();

        iRet = lobj.Frequency(Arr,iLength,iValue);

        System.out.println("Total number of occurance is "+ iRet);

        lobj = null;
        sobj = null;

        System.gc();
    }
}