import java.util.*;

class CountFrequency
{
    public static int CountFreq(int [] Arr,int No)
    {
        int iCount = 0;
        int i = 0;

        for(i = 0; i < Arr.length; i++)
        {
            if(Arr[i] == No)
            {
                iCount++;
            }
        }

        return iCount;
    }
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Arr[] = {1,1,1,4,5,67,9,8,7,6,9,9,9,934,5,6,7,9,9,9,0};

        int iRet = 0;
        int Value = 0;

        System.out.println("Enter the number");
        Value = sobj.nextInt();

        iRet = CountFreq(Arr,Value);

        System.out.println("Frequency is : "+ iRet);

        sobj = null;
    }
}