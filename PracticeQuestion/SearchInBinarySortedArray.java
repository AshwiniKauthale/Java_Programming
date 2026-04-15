import java.util.*;

class SearchInBinarySortedArray
{
    public static int BinarySearch(int Arr[], int n)
    {
        Arrays.sort(Arr);
        int Index = -1;
        int Mid = 0;
        int iStart = 0;
        int iEnd = Arr.length - 1;

        while(iStart <= iEnd)
        {
            Mid = iStart + ((iEnd - iStart) / 2);
            if(Arr[Mid] == n)
            {
                Index = Mid;
                break;
            }
            else if(n > Arr[Mid])
            {
                iStart = Mid + 1;
            }
            else if(n < Arr[Mid])
            {
                iEnd = Mid - 1;
            }
        }

        return Index;
    }
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iRet = 0;
        int Value = 0;
        int Arr[] = {1,5,8,3,5,90,26,45,80,96,101,2020};

        System.out.println("Enter number that you want to search");
        Value = sobj.nextInt();

        iRet = BinarySearch(Arr, Value);

        System.out.println(iRet);
    }
}