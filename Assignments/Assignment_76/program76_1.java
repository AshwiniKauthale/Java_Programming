import java.util.*;

class program76_1
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Distance = 0;
        float Amount = 0.0f;
        String Peak_hour = null;

        System.out.println("Distance in km");
        Distance = sobj.nextInt();

        System.out.println("Peak hour");
        Peak_hour = sobj.next();

        if(Distance < 0)
        {
            System.out.println("Invalid Input");
            return;
        }

        if((Peak_hour.equalsIgnoreCase("Yes") == false) && (Peak_hour.equalsIgnoreCase("No") == false))
        {
            System.out.println("Invalid Input");
            return;
        }

        if(Distance <= 10)
        {
            Amount = 50 + (Distance * 12);
        }
        else
        {
            Amount = 50 + 120 + ((Distance - 10) * 15);
        }

        if(Peak_hour.equalsIgnoreCase("Yes"))
        {
            Amount = Amount + (float)(Amount * 1.2f);
        }

        System.out.println("Distance: "+Distance+"km");
        System.out.println("Peak Hours: "+Peak_hour);
        System.out.println("Total Fare: "+Amount);

        sobj.close();
    }
}

/*
    A ride-hailing app calculates trip fare based on distance and whether the trip happened during peak hours.
    Peak hours increase demand, so surcharge applies.

    Rules:
    Base fare ₹50
    First 10 km : ₹12 per km
    Beyond 10 km : ₹15 per km
    Peak hours -> 20% extra on total fare

    Input:
    Distance in km (integer)
    Peak hour (Yes/No)

    Validations:
    Distance cannot be negative

    Expected Output:
    Distance: <km> km
    Peak Hour: <Yes/No>
    Total Fare: ₹<amount>
*/