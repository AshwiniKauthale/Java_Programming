import java.util.*;

class program75_3
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Requested_Quantity = 0;
        int Current_Stock = 0;

        int Remaning_Stock = 0;

        System.out.println("Current stock");
        Current_Stock = sobj.nextInt();

        System.out.println("Requested quantity");
        Requested_Quantity = sobj.nextInt();

        if(Current_Stock < 0 || Requested_Quantity <= 0)
        {
            System.out.println("Invalid Input");
            return;
        }

        if(Requested_Quantity > Current_Stock)
        {
            System.out.println("Order Failed : Insufficiant Stock");
            return;
        }

        Remaning_Stock = Current_Stock - Requested_Quantity;

        Current_Stock = Remaning_Stock;

        System.out.println("Order Processed Successfully.");
        System.out.println("Remainig Stock: "+ Remaning_Stock);

        if(Remaning_Stock < 5)
        {
            System.out.println("Low Stock Alert!");
        }

        sobj.close();
    }
}

/*
    A warehouse has a product in stock. Every time a customer places an order, the system must check if enough stock exists.
    If possible, fulfill it and update remaining stock. If stock becomes very low, show alert.

    Rules:
    If requested quantity > available stock : order fails
    Else deduct quantity
    If remaining stock < 5 : print low stock alert

    Input:
    Current stock (integer)
    Requested quantity (integer)

    Validations:
    Stock cannot be negative
    Requested quantity must be > 0

    Expected Output:
    If successful:
    Order Processed Successfully.
    Remaining Stock: <value>
    If remaining < 5 also print: Low Stock Alert!
    
    If failed: Order Failed: Insufficient Stock.
*/