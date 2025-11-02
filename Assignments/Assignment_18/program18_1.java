
class Logic
{
    void checkPrime(int iNo)
    {
        int iCnt = 0;

        for(iCnt = 2; iCnt <= iNo -1; iCnt++)
        {
            if((iNo % iCnt) != 0)
            {
                System.out.println("It is  Prime");
                break;
            }
            else
            {
                System.out.println("It is not Prime");
                break;
            }
        }
    }
}

// Time Complixity = O(N)

class program18_1
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.checkPrime(11);
    }
}