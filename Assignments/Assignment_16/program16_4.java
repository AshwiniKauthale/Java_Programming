
class Logic
{
    public void reverseNumber(int num)
    {
        int iDigit = 0;

        while(num != 0)
        {
            iDigit = num % 10;
            System.out.print(iDigit);
            num = num / 10;
        }
    }
}

// Time Complixity = O(N)

class program16_4
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.reverseNumber(1234);
    }
}
