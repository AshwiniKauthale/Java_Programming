
class ReverseString
{

    public static String Reverse(String str)
    {
        StringBuilder sb = new StringBuilder(str);

        sb.reverse();

        String s = sb.toString();

        return s;
    }

    public static String ReverseX(String str)
    {
        int i = 0;
        String s = "";

        for(i = str.length() - 1; i>= 0; i--)
        {
            
            s = s + str.charAt(i);
        }

        return s;
    }

    public static void main(String A[])
    {
        String sRet;
        String str = "India is my country";
        sRet = Reverse(str);
        System.out.println(sRet);

        sRet = ReverseX(str);
        System.out.println(sRet);
    }
}