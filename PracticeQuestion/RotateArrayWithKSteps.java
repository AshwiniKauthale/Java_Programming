import java.util.*;

class RotateArrayWithKSteps
{
    public static int[] KStepRotate(int[] Brr, int k)
    {
        int n = Brr.length;
        int i = 0;
        int j = Brr.length - 1;
        int temp = 0;
        k = k % n;

        while(i < j)
        {
            temp = Brr[i];
            Brr[i] = Brr[j];
            Brr[j] = temp;
            i++;
            j--;
        }

        i = 0;
        j = k - 1;

        while(i < j)
        {
            temp = Brr[i];
            Brr[i] = Brr[j];
            Brr[j] = temp;
            i++;
            j--;
        }

        i = k;
        j = Brr.length - 1;

        while(i < j)
        {
            temp = Brr[i];
            Brr[i] = Brr[j];
            Brr[j] = temp;
            i++;
            j--;
        }

        return Brr;
    }
    public static void main(String a[])
    {
        int iRet[] = null;
        Scanner sobj = new Scanner(System.in);

        int Arr[] = {1,2,3,4,5,6,7,8,9};

        System.out.println("Enter the Value of K");
        int K = sobj.nextInt();

        iRet = KStepRotate(Arr, K);

        for(int i = 0; i <iRet.length; i++)
        {
            System.out.print(iRet[i]+" ");
        }
        sobj = null;
    }
}