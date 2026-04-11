import java.util.*;

class CheckStringPalindrome
{
    public static Boolean isPalindrome(String str)
    {
        Boolean bFlag = true;

        str = str.trim();

        str = str.replaceAll(" ","");
        str = str.replaceAll(",","");

        int i = 0;
        int j = 0;

        for(i = 0,j = str.length() - 1; i <= j; i++,j--)
        {
            if(str.charAt(i) != (str.charAt(j)))
            {
                bFlag = false;
                break;
            }
        }

        return bFlag;
    }

    public static void main(String A[])
    {
        Boolean bRet = false;
        String str = null;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter String");
        str = sobj.nextLine();

        bRet = isPalindrome(str);

        if(bRet == true)
        {
            System.out.println(str + " is a palindromic string");
        }
        else
        {
            System.out.println(str + " is not a palindromic string");
        }

        sobj = null;
    }
}