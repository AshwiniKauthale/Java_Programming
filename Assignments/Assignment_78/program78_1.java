import java.util.*;

class program78_1
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        float Amount = 0.0f;
        float Discount = 0.0f;
        int Days = 0;

        System.out.println("Number of days stayed");
        Days = sobj.nextInt();

        if(Days < 0)
        {
            System.out.println("Invalid Input : Days must be >= 0");
            return;
        }

        if(Days <= 7)
        {
            Amount = 30000 * Days;
        }
        else
        {
            Amount = (3000 * Days);
            Discount = (float)(Amount * 0.05f);
            Amount = Amount - Discount;
        }

        System.out.println("Total Stay Duration: "+ Days);
        System.out.println("Final Bill Amount : "+ Amount);

        sobj.close();
    }
}

/*
    A hotel charges ₹3000 per day. For long stays, hotel provides discount to retain customers.

    Rules:

        ₹3000/day
        If stay > 7 days → 5% discount on total bill

    Input:

        Number of days stayed

    Validations:
        
        Days must be >= 0
    
    Expected Output:
    Total Stay Duration: <days> days
    Final Bill Amount: ₹<amount>
*/