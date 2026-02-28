import java.util.*;

class program76_3
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Amount = 0;
        int Parcel_weight = 0;

        System.out.println("Parcel weight in kg");
        Parcel_weight = sobj.nextInt();

        if(Parcel_weight < 0)
        {
            System.out.println("Invalid Input");
            return;
        }

        if(Parcel_weight <= 1)
        {
            Amount = 50;
        }
        else if(Parcel_weight <= 5)
        {
            Amount = 50 + ((Parcel_weight - 1) * 20);
        }
        else
        {
            Amount = 150 + ((Parcel_weight - 5) * 30);
        }

        System.out.println("Parcel Weight: " + Parcel_weight + " kg");
        System.out.println("Courier Charge: " + Amount);

        sobj.close();
    }
}

/*
    A courier counter calculates delivery charge by weight. Charges increase when parcel is heavier.

    Charges:
    Up to 1 kg : ₹50
    1–5 kg : ₹50 + ₹20/kg above 1 kg
    Above 5 kg : ₹150 + ₹30/kg above 5 kg

    Input:
    Parcel weight in kg (integer)

    Validations:
    Weight must be > 0

    Expected Output:
    Parcel Weight: <weight> kg
    Courier Charge: ₹<amount>

*/