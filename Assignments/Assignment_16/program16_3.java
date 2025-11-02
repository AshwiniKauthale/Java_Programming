
class Logic
{
    void findFactorial(int iNo)
    {
            int iCnt = 0;

            for(iCnt = 1; iCnt <= iNo/2; iCnt++)
            {
                if((iNo % iCnt) == 0)
                {
                    System.out.println(iCnt);
                }
            }
    }
}

// Time Complixity = O(N/2)

class program16_3
{
    public static void main(String args[])
    {
        Logic obj = new Logic();

        obj.findFactorial(5);
    }
}