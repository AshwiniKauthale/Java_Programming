
class LargestSumSubarray
{
    public static int LargestSubArraySum(int Brr[])
    {
        int MaxSum = 0;
        int Sum = 0;
        int i = 0,j = 0;

        for(i = 0; i < Brr.length; i++)
        {
            Sum = 0;
            for(j = i; j < Brr.length; j++)
            {
                Sum = Sum + Brr[j];
                MaxSum = Math.max(MaxSum,Sum);
            }
        }

        return MaxSum;
    }
    public static void main(String A[])
    {
        int iRet = 0;
        int Arr[] = {0,-1,3,-2,1};

        iRet = LargestSubArraySum(Arr);

        System.out.println("Maximum summation is : "+ iRet);
    }
}