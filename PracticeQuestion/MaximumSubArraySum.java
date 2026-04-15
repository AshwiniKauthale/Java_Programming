
class LongestSubArraySum
{
    public static int LongestLength(int []Brr, int m)
    {
        int left = 0;
        int right = 0;
        int n = Brr.length;
        int sum = Brr[0];
        int maxLen = 0;

        while(right < n)
        {
            while(left <= right && sum > m)
            {
                sum -= Brr[left];
                left++;
            }
            if(sum == m)
            {
                maxLen = Math.max(maxLen, right - left + 1);
            }
            right++;
            if(right < n)
            {
                sum += Brr[right];
            }
            
        }


        return maxLen;
    }
    public static void main(String A[])
    {
        int iRet = 0;

        int k = 6;
        int Arr[] = {1,2,3,1,1,1,1,3,3};

        iRet = LongestLength(Arr, k);

        System.out.println(iRet);
    }
}