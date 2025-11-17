import java.util.*;

class Logic
{
    public int Product(int Arr[],int iSize)
    {
        int iCnt = 0, iProduct = 1;

        for(iCnt = 0; iCnt < iSize; iCnt++)
        {
            if((Arr[iCnt] % 2) != 0)
            {
                iProduct = iProduct * Arr[iCnt];
            }
        }
        return iProduct;
    }
}

class program23_5
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

        iRet = lobj.Product(Arr,iLength);

        if(iRet == 1)
        {
            System.out.println("Product is : 0");
        }
        else
        {
            System.out.println("Product of Odd element is : "+ iRet);
        }

        lobj = null;
        sobj = null;

        System.gc();
    }
}