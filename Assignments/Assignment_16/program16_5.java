


class Logic
{
    public void countDigits(int num)
    {
        int iCount = 0;
        int iDigit = 0;

        while(num != 0)
        {
            iDigit = num % 10;
            iCount++;
            num = num / 10;
        }
        System.out.println(iCount);
    }
}

// Time Complixity = O(N)

class program16_5
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.countDigits(7865);
    }
}
