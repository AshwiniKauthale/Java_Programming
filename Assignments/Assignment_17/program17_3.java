
class Logic
{
    public void findMax(int iNo1, int iNo2)
    {
        if(iNo1 > iNo2)
        {
            System.out.println(iNo1 + " is maximum.");
        }
        else
        {
            System.out.println(iNo2 + " is maximum.");
        }
    }
}

// Time Complixity = O(1)

public class program17_3
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.findMax(20,15);
    }
}
