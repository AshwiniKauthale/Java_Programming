import java.util.*;

class CheckAnagramString
{
    public static boolean CheckAnagram(String A, String B)
    {
        Boolean bFlag = true;

        char Arr[] = A.toCharArray();
        char Brr[] = B.toCharArray();

        Arrays.sort(Arr);
        Arrays.sort(Brr);

        bFlag = Arrays.equals(Arr,Brr);

        return bFlag;
    }

    public static void main(String Arr[])
    {
        Boolean bRet = true;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter First String");
        String A = sobj.nextLine();

        System.out.println("Enter Second String");
        String B = sobj.nextLine();

        bRet = CheckAnagram(A, B);

        if(bRet == true)
        {
            System.out.println("Strings are anagram");
        }
        else
        {
            System.out.println("Strings are not anagram");
        }

        sobj = null;
    }
}