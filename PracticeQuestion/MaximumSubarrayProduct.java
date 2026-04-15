
class MaximumSubarrayProduct
{
    public static int MaxProduct(int Brr[])
    {
        int Product = 1;

        if(Brr.length == 1)
        {
            return Brr[0];
        }

        int Max_neg = Integer.MIN_VALUE;
        int Zero_Count = 0;
        int neg_Count = 0;

        for(int i = 0; i <Brr.length; i++)
        {
            if(Brr[i] == 0)
            {
                Zero_Count++;
                continue;
            }

            if(Brr[i] < 0)
            {
                neg_Count++;

                Max_neg = Math.max(Max_neg,Brr[i]);
            }

            Product = Product * Brr[i];
        }

        if(Zero_Count == Brr.length)
        {
            return 0;
        }

        if(neg_Count % 2 == 1)
        {
            if(neg_Count == 1 && Zero_Count + neg_Count == Brr.length)
            {
                return 0;
            }

            Product = Product / Max_neg;
        }
        

        return Product;
    }

    public static void main(String A[])
    {
        int Arr[] = {5};

        System.out.println(MaxProduct(Arr));
    }
}