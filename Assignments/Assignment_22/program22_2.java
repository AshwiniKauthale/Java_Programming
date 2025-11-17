import java.util.Scanner;

class Logic
{
    public int Frequency(int Arr[],int iSize)
    {
        int iCnt = 0, iCountEven = 0, iCountOdd = 0, iDiff = 0;

        for(iCnt = 0; iCnt < iSize; iCnt++)
        {
            if((Arr[iCnt] % 2) == 0)
            {
                iCountEven++;
            }
            else
            {
                iCountOdd++;
            }
        }
        iDiff = iCountEven - iCountOdd;
        return iDiff;
    }
}

class program22_2
{
    public static void main(String A[])
    {
        int iCnt = 0, iLength = 0, iRet = 0;

        Scanner sobj = new Scanner(System.in);
        Logic lobj = new Logic();

        System.out.println("Enter number of elements :");
        iLength = sobj.nextInt();

        int Arr[] = new int[iLength];


        System.out.println("Enter elements :");

        for(iCnt = 0; iCnt < iLength; iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }

        iRet = lobj.Frequency(Arr,iLength);
        System.out.println("Frequency is :"+iRet);

        lobj = null;
        sobj = null;

        System.gc();

    }
}