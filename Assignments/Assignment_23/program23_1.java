import java.util.Scanner;

class Logic
{
    public boolean Check(int Arr[], int iSize, int iNo)
    {
        int iCnt = 0;

        for(iCnt = 0; iCnt < iSize; iCnt++)
        {
            if(Arr[iCnt] == iNo)
            {
                break;
            }
        }
        return(iCnt != iSize);
    }
}
class program23_1
{
    public static void main(String A[])
    {
        int iCnt = 0, iLength = 0, iValue = 0;
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

        System.out.println("Enter that one number :");
        iValue = sobj.nextInt();

        bRet = lobj.Check(Arr,iLength,iValue);

        if(bRet == true)
        {
            System.out.println("Number is present.");
        }
        else
        {
            System.out.println("Number is not present.");
        }


        lobj = null;
        sobj = null;

        System.gc();
    }
}