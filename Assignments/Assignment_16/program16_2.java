
class Logic
{
    void checkEvenOdd(int iNo)
    {
            if((iNo % 2) == 0)
            {
                System.out.println("Number Is Even");
            }
            else
            {
                System.out.println("Number is Odd");
            }
    }
}

// Time Complixity = O(1)

class program16_2
{
    public static void main(String args[])
    {
        Logic obj = new Logic();

        obj.checkEvenOdd(7);
    }
}