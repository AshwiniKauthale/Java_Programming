import java.util.*;

class program75_4
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Amount = 0;

        String Helmet_worn = null;
        String License = null;
        String Overspeeding = null;

        System.out.println("Helmet Helmet_worn");
        Helmet_worn = sobj.next();

        System.out.println("License avaliable");
        License = sobj.next();

        System.out.println("Overspeeding");
        Overspeeding = sobj.next();

        if((Helmet_worn.equalsIgnoreCase("Yes") == false) && (Helmet_worn.equalsIgnoreCase("No") == false) ||
            (License.equalsIgnoreCase("Yes") == false) && (License.equalsIgnoreCase("No") == false) ||
            (Overspeeding.equalsIgnoreCase("Yes") == false) && (Overspeeding.equalsIgnoreCase("No") == false) )
        {
            System.out.println("Invalid Input");
            return;
        }

        if(Helmet_worn.equals("No"))
        {
            Amount = Amount + 500;
        }

        if(License.equals("No"))
        {
            Amount = Amount + 1000;
        }

        if(Overspeeding.equals("No"))
        {
            Amount = Amount + 1500;
        }

        System.out.println("Total Final Amount : "+Amount);
        sobj.close();
    }
}

/*
    A traffic police app records whether a rider violated rules. Each violation has a fixed fine.
    If multiple violations happen, fines should be added.

    Fines:
    No helmet : ₹500
    No license : ₹1000
    Overspeeding : ₹1500

    Input:
    Helmet worn (Yes/No)
    License available (Yes/No)
    Overspeeding (Yes/No)

    Validations:
    Inputs must be Yes/No only

    Expected Output:
    Total Fine Amount: ₹<amount>
*/