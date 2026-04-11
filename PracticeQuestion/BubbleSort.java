
class BubbleSort
{
    public static int[] Sort(int[]Brr)
    {
        int i= 0;
        int j = 0;
        int temp = 0;

        for(i = 0; i < Brr.length;i++)
        {
            for(j = 0; j < Brr.length; j++)
            {
                if(Brr[i] < Brr[j])
                {
                    temp = Brr[i];
                    Brr[i] = Brr[j];
                    Brr[j] = temp;
                }
            }
        }
        return Brr;
    }
    public static void main(String A[])
    {
        int iRet[];
        int Arr[] = {9,6,89,0,5,3,2,0,0,10,48,49};

        iRet = Sort(Arr);

        for(int i = 0; i < iRet.length; i++)
        {
            System.out.print(iRet[i] + " ");
        }
    }
}