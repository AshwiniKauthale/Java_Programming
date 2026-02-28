import java.util.*;

class program75_2
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Age = 0;
        int Monthly_Income = 0;
        int Credit_Score = 0;
        String Existing_lone = null;

        System.out.println("Age :");
        Age = sobj.nextInt();

        System.out.println("Monthly Income : ");
        Monthly_Income = sobj.nextInt();

        System.out.println("Credit score :");
        Credit_Score = sobj.nextInt();

        System.out.println("Existing unpaid loan :");
        Existing_lone = sobj.next();

        if(Age < 0 || Monthly_Income < 0 || Credit_Score < 0)
        {
            System.out.println("Invalid Input");
            return;
        }

        if((Existing_lone.equalsIgnoreCase("Yes") == false) && (Existing_lone.equalsIgnoreCase("No") == false))
        {
            System.out.println("Invalid Input");
            return;
        }

        if(Age < 21 || Age > 60)
        {
            System.out.println("Loan Rejected :Age is not eligible");
            return;
        }
        else if(Monthly_Income < 25000)
        {
            System.out.println("Loan Rejected :Income is low");
            return;
        }
        else if(Credit_Score < 700)
        {
            System.out.println("Loan Rejected :Credit score is less");
            return;
        }
        else if(Existing_lone.equals("Yes"))
        {
            System.out.println("Loan Rejected : Must have an existing unpaid loan");
            return;
        }
        else
        {
        System.out.println("Loan Approved");
        }

        sobj.close();
    }
}

/*
    A bank wants to quickly decide whether a customer is eligible for a personal loan.
    The system checks the applicant’s details and either approves the loan or rejects with the exact reason.

    Eligibility Conditions:
    Age 21 to 60 inclusive
    Monthly income ₹25,000
    Credit score 700
    Must NOT have an existing unpaid loan

    Input:
    Age
    Monthly income
    Credit score
    Existing unpaid loan (Yes/No)

    Validations:
    Age/income/score must be non-negative
    Yes/No must be valid
    
    Expected Output:
    Loan Approved
    OR
    Loan Rejected: <Specific Reason>

*/