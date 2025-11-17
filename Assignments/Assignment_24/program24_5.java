import java.util.*;

class Logic
{
    public void DigitsSum(int Arr[],int iSize)
    {
        int iCnt = 0,iDigit = 0,iSum = 0;

        for(iCnt = 0; iCnt < iSize; iCnt++)
        {
            iSum = 0;
            while(Arr[iCnt] != 0)
            {
                iDigit = Arr[iCnt]%10;
                iSum = iSum + iDigit;
                Arr[iCnt] = Arr[iCnt]/10;
            }
            System.out.println(iSum);
        }
    }
}
class program24_5
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

        lobj.DigitsSum(Arr,iLength);

        lobj = null;
        sobj = null;

        System.gc();
    }
}