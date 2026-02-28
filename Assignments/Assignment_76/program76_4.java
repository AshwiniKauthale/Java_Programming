import java.util.*;

class program76_4
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iCnt = 0;
        float Budget = 0.0f;
        int Total_Items = 0;
        float Price = 0.0f;
        int Purchased_item = 0;

        System.out.println("Budget amount");
        Budget = sobj.nextFloat();

        System.out.println("Number of items N");
        Total_Items = sobj.nextInt();

        if(Budget < 0 || Total_Items < 0)
        {
            System.out.println("Invalid Input");
            return;
        }

        System.out.println("N item prices");

        for(iCnt = 1; iCnt <= Total_Items; iCnt++)
        {
            System.out.println("Price of "+ iCnt + "item");
            Price = sobj.nextFloat();

            if(Price <= 0)
            {
                System.out.println("Price must be grater than 0");
                return;
            }

            if(Price <= Budget)
            {
                Budget = Budget - Price;
                Purchased_item++;
            }
            else
            {
                System.out.println("Insufficiant Budget Stop purchase");
                break;
            }

        }

        System.out.println("Items Purchased: " + Purchased_item);
        System.out.println("Remaining Balance: "+Budget);

        sobj.close();
    }
}

/*
    A customer enters a store with a fixed budget. They pick items one by one in a given order.
    The cashier wants to know how many items can be purchased before money becomes insufficient.

    Input:
    Budget amount
    Number of items N
    N item prices

    Validations:
    Budget >= 0

    N >= 0
    Each price > 0

    Expected Output:
    Items Purchased: <count>
    Remaining Balance: ₹<amount>
*/