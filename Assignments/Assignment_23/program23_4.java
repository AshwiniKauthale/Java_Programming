import java.util.*;

class Logic
{
    public void Range(int Arr[], int iLength,int iStart,int iEnd)
    {
        int iCnt = 0,iCount = 0;

        for(iCnt = 0 ; iCnt < iLength; iCnt++)
        {
            if(Arr[iCnt] > iStart && Arr[iCnt] < iEnd)
            {
                System.out.println(Arr[iCnt]);
            }
        }
    }
}

class program23_4
{
    public static void main(String A[])
    {
        int iCnt = 0, iRet = 0, iStart = 0,iEnd = 0;

        Scanner sobj = new Scanner(System.in);

        Logic lobj = new Logic();

        System.out.println("Enter number of elements : ");
        int iLength = sobj.nextInt();

        int Arr[] = new int[iLength];

        System.out.println("Enter the elements :");

        for(iCnt = 0; iCnt < iLength; iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }

        System.out.println("Enter the First element :");
        iStart = sobj.nextInt();

        System.out.println("Enter the Last element :");
        iEnd = sobj.nextInt();

        lobj.Range(Arr,iLength,iStart,iEnd);

        lobj = null;
        sobj = null;

        System.gc();
    }
}