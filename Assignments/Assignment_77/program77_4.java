import java.util.*;

class program77_4
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int units = 0;
        int weeksLate = 0;
        double bill = 0;

        System.out.println("Enter water units:");
        units = sobj.nextInt();

        System.out.println("Enter weeks late:");
        weeksLate = sobj.nextInt();

        // Slab calculation
        if(units <= 50)
        {
            bill = units * 5;
        }
        else if(units <= 100)
        {
            bill = (50 * 5) + ((units - 50) * 10);
        }
        else
        {
            bill = (50 * 5) + (50 * 10) + ((units - 100) * 15);
        }

        // Fixed meter charge
        bill = bill + 50;

        // Late fee
        double penalty = weeksLate * 0.02;

        if(penalty > 0.10)
        {
            penalty = 0.10;
        }

        bill = bill + (bill * penalty);

        System.out.println("Total Bill Amount: " + bill);
    }
}