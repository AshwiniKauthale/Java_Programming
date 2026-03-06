
import java.util.*;

class program78_5
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int TotallMinutes  = 0;
        int Amount  = 0;

        System.out.println("Call Duration in Minutes");
        TotallMinutes = sobj.nextInt();

        if(TotallMinutes < 0)
        {
            System.out.println("Invalid Input");
            return;
        }

        if(TotallMinutes <= 5)
        {
            Amount = 0;
        }
        else if(TotallMinutes <= 15)
        {
            Amount = (TotallMinutes - 5) * 1;
        }
        else
        {
            Amount = 10 + (TotallMinutes - 15) * 2;
        }

        System.out.println("Call Duration : "+TotallMinutes+" minutes");
        System.out.println("Total Call Charge : "+Amount);

        sobj.close();
    }
}

/*
    A telecom company bills calls based on duration slabs. The system needs to calculate final charge for a given call duration.

    Rules:

        First 5 minutes free
        Next 10 minutes (6–15) -> ₹1 per minute
        Beyond 15 -> ₹2 per minute

    Input:

        Call duration in minutes (integer)

    Validations:

        Minutes must be >= 0

    Expected Output:

    Call Duration: <minutes> minutes
    Total Call Charge: ₹<amount>

*/