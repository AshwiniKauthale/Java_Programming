
class MergSortedArrays
{
    public static void Merg(int [] Arr, int [] Brr)
    {
        int i = 0;
        int j = 0;
        int k = 0;
        int m = Arr.length;
        int n = Brr.length;
        int Array[] = new int[m + n];

        while(j < Arr.length && k < Brr.length)
        {
            if(Arr[j] < Brr[k])
            {
                Array[i] = Arr[j];
                j++;
                i++;
            }
            else
            {
                Array[i] = Brr[k];
                k++;
                i++;
            }
        }

        while(j < Arr.length)
        {
            Array[i] = Arr[j];
            i++;
            j++;
        }

        while(k < Brr.length)
        {
            Array[i] = Brr[k];
            i++;
            k++;
        }

        for(i = 0; i < Array.length; i++)
        {
            System.out.print(Array[i] + " ");
        }
    }

    public static void main(String A[])
    {
        int Arr[] = {1,4,6,7,9,22,45,110};
        int Brr[] = {2,3,5,6,8,10,36,78};

        Merg(Arr, Brr);
    }
}