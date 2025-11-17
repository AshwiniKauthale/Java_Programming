import java.util.*;

class Logic
{
    public int LastOcc(int Arr[],int iSize,int iNo)
    {
        int iCnt = 0;

        for(iCnt = iSize - 1; iCnt >= 0; iCnt++)
        {
            if(Arr[iCnt] == iNo)
            {
                return iCnt;
            }
        }
        return -1;
    }
}

class program23_3
{
    public static void main(String A[])
    {
        int iCnt = 0, iRet = 0, iValue = 0;

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

        System.out.println("Enter the element that you want to search :");
        iValue = sobj.nextInt();

        iRet = lobj.LastOcc(Arr,iLength,iValue);
        System.out.println("First occurance of the element is : "+ iRet);

        lobj = null;
        sobj = null;

        System.gc();
    }
}