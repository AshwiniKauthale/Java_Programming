
class Logic
{
    void checkPalindrome(int num)
    {
        int iRev = 0;
        int iTemp = num;

        while(num > 0)
        {
            int iRem = num % 10;
            iRev = iRev * 10 + iRem;
            num = num / 10;
        }
        
        if(iRev == iTemp)
        {
            System.out.println(iTemp + " is a Palindrome number.");
        }
        else
        {
            System.out.println(iTemp + " is not a Palindrome number,");
        }
    }
}
// Time Complixity = O(N)

class program17_2
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.checkPalindrome(121);
    }
}