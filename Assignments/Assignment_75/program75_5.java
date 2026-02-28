import java.util.*;

class program75_5
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Income = 0;
        float Tax = 0.0f;

        System.out.println("Annual income");
        Income = sobj.nextInt();

        if(Income < 0)
        {
            System.out.println("Invalid Input");
            return;
        }

        if(Income <= 250000)
        {
            Tax = 0.0f;
        }
        else if(Income >= 250001 && Income <= 500000)
        {
            Tax = (float)((Income - 250000) * 0.05f);
        }
        else if(Income >= 500001 && Income <= 1000000)
        {
            Tax = 12500 + (float)((Income - 500000) * 0.2f);
        }
        else
        {
            Tax = 12500 + 100000 + (float)((Income - 1000000) * 0.3f);
        }

        System.out.println("Annual Income: "+ Income);
        System.out.println("Total Tax Payable: "+Tax);

        sobj.close();
    }
}

/*
    A tax portal calculates income tax based on annual income using progressive slabs. Only the amount in a slab is taxed at that slab's rate.
    Slabs:

    Up to ₹2,50,000 : 0%
    ₹2,50,001 to ₹5,00,000 : 5%
    ₹5,00,001 to ₹10,00,000 : 20%
    Above ₹10,00,000 : 30%

    Input:
    Annual income (integer)

    Validations:
    Income cannot be negative

    Expected Output:
    Annual Income: ₹<income>
    Total Tax Payable: ₹<tax>
*/