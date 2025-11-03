
class Logic
{
    public void sumOfDigits(int num)
    {
        int iDigit = 0;
        int iSum = 0;

        while(num != 0)
        {
            iDigit = num % 10;
            iSum = iSum + iDigit;
            num = num / 10;
        }
        System.out.println(iSum);
    }
}

// Time Complixity = O(N)

class program17_1
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.sumOfDigits(1234);
    }
}
