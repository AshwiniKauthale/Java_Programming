import java.util.*;

class program74_2
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Please enter your currect balance : ");
        int Current_Balance = sobj.nextInt();

        System.out.println("Please enter the Amount that you want to withdrwal : ");
        int Withdraw_Ammount = sobj.nextInt();

        if(Current_Balance < 0 || Withdraw_Ammount <= 0)
        {
            System.out.println("Invalid Input");
            return;
        }

        if(Withdraw_Ammount % 100 != 0)
        {
            System.out.println("Tranaction Failed : Withdrawl amount must be a multiple of 100");
        }
        else if(Withdraw_Ammount > 25000)
        {
            System.out.println("Tranaction Failed : Maximum withdrawl per transaction is 25,000");
        }
        else if(Current_Balance - Withdraw_Ammount < 1000)
        {
            System.out.println("Tranaction Failed : After withdrawl balance must remains at least 1000");
        }
        else
        {
            System.out.println("Transaction Succesful");
            System.out.println("Remaning Balance : "+(Current_Balance - Withdraw_Ammount));
        }

        sobj = null;
    }
}

/*
    A bank ATM must follow strict safety rules to avoid fraud and ensure customers maintain a minimum balance.

    A customer inserts the card, checks their balance, and requests a withdrawal.

    The ATM must either approve the request and update the balance or reject it and show the correct reason.

    Rules:

    Withdrawal amount must be a multiple of ₹100

    Maximum withdrawal per transaction is ₹25,000

    After withdrawal, balance must remain at least ₹1,000

    Input:

    Line 1: current balance (integer)

    Line 2: requested withdrawal amount (integer)

    Validations:

    If balance < 0 or withdrawAmount ≤ 0 → invalid input

    Expected Output:

    If successful:

    Transaction Successful!
    Remaining Balance: ₹<newBalance>

    If failed:

    Transaction Failed: <Reason>
*/