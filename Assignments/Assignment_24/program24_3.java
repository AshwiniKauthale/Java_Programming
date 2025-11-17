import java.util.*;

class Logic
{
    public int Difference(int Arr[], int iSize)
{
    int iCnt = 0, iMax = Arr[0], iMin = Arr[0], iAns = 0;

    for(iCnt = 0; iCnt < iSize; iCnt++)
    {
        if(Arr[iCnt] > iMax)
        {
            iMax = Arr[iCnt];
        }
    }

    for(iCnt = 0; iCnt < iSize; iCnt++)
    {
        if(Arr[iCnt] < iMin)
        {
            iMin = Arr[iCnt];
        }
    }
    iAns = iMax - iMin;
    return iAns;
}
}

class program24_3
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

        iRet = lobj.Difference(Arr,iLength);

        System.out.println("Differenct between largest and smallest is : "+ iRet);

        lobj = null;
        sobj = null;

        System.gc();
    }
}