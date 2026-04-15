import java.util.*;

class IntersectionOfArrays
{
    public static int[] intersection(int[] nums1, int[] nums2)
    {
        List<Integer> list1 = new ArrayList<>();
        Set<Integer> set = new HashSet<>();

        for(int n : nums1)
        {
            list1.add(n);
        }

        for(int i = 0; i < nums2.length; i++)
        {
            if(list1.contains(nums2[i]))
            {
                set.add(nums2[i]);
            }
        }

        int Arr[] = new int[set.size()];
        int i = 0;

        for(int n : set)
        {
            Arr[i] = n;
            i++; 
        }

        return Arr;

    }

    public static void main(String A[])
    {
        int iRet[] = null;

        int Arr[] = {1,2,2,1};
        int Brr[] = {2,2};

        iRet = intersection(Arr, Brr);

        for(int i = 0; i < iRet.length; i++)
        {
            System.out.print(iRet[i] + " ");
        }
    }
}