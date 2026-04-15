import java.util.*;

class RemoveDuplicate
{

    public static int[] RemoveDuplicateElement(int Brr[])
    {
        Arrays.sort(Brr);
        int i = 0;
        
        List <Integer> list = new ArrayList<>();

        list.add(Brr[0]);

        for(i = 1; i < Brr.length; i++)
        {
            if(Brr[i - 1] != Brr[i])
            {
                list.add(Brr[i]);
            }
        }

        int Arr[] = new int[list.size()];

        for(i = 0; i < list.size(); i++)
        {
            Arr[i] = list.get(i);
        }

        return Arr;
    }
    public static void main(String A[])
    {
        int iRet [] = null;
        int Arr[] = {1,3,4,5,2,3,1,0,9,8,6,100,190,500,450,0,45,200,45,100,190,0,7,9,6,5,5,9};

        iRet = RemoveDuplicateElement(Arr);

        for(int i = 0; i < iRet.length; i++)
        {
            System.out.print(iRet[i]+ " ");
        }
    }
}