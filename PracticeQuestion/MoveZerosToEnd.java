
class MoveZerosToEnd
{
    public static int[] MoveZeros(int Arr[])
    {
        int i = 0;
        int j = 0;
        int temp = 0;

        for(i = 0; i < Arr.length; i++)
        {
            for(j = i; j < Arr.length; j++)
            {
                if(Arr[i] == 0)
                {
                    temp = Arr[i];
                    Arr[i] = Arr[j];
                    Arr[j] = temp;
                }
            }
        }
        return Arr;
    }
    public static void main(String A[])
    {
        int iRet[] = null;
        int Arr[] = {0,1,0,3,13,0,24};

        iRet = MoveZeros(Arr);

        for(int i = 0; i < iRet.length; i++)
        {
            System.out.print(iRet[i]+ " ");
        }
    }
}