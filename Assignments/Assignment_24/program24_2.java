import java.util.*;

class Logic
{
    public int Minimum(int Arr[], int iSize)
    {
        int iCnt = 0, iMin = Arr[0];

        for(iCnt = 0; iCnt < iSize; iCnt++)
        {
            if(Arr[iCnt] < iMin)
            {
                iMin = Arr[iCnt];
            }
        }
        return iMin;
    }
}

class program24_2
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

        iRet = lobj.Minimum(Arr,iLength);

        System.out.println("Smallest number is : "+ iRet);

        lobj = null;
        sobj = null;

        System.gc();
    }
}