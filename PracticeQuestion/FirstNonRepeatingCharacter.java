import java.util.*;

class FirstNonRepeatingCharacter
{
    public static char FirstNonRepeatingChar(String s)
    {
        char ch = '1';
        int i = 0;
        int Arr[] = new int[26];

        for(i = 0; i < s.length(); i++)
        {
            Arr[s.charAt(i) - 'a']++;
        }

        for(i = 0; i < s.length(); i++)
        {
            if(Arr[s.charAt(i) - 'a'] == 1)
            {
                ch = s.charAt(i);
                break;
            }
        }
        return ch;
    }
    public static void main(String A[])
    {
        char cRet;
        String str = "";
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter String");
        str = sobj.nextLine();

        cRet = FirstNonRepeatingChar(str);

        System.out.println(cRet);

        sobj = null;
    }
}