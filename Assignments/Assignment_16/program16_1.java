
class Logic
{
    void calculateSum(int iNo)
    {
        int iSum = 0;
        int iCnt = 0;

        for(iCnt= 1; iCnt <= iNo; iCnt++)
        {
            iSum = iSum + iCnt;
        }
        System.out.println(iSum);
    }
}

// Time Complixity = O(N)

class program16_1
{
    public static void main(String args[])
    {
        Logic obj = new Logic();

        obj.calculateSum(10);
    }
}