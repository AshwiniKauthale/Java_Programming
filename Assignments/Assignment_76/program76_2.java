import java.util.*;

class program76_2
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Marks = 0;
        int Attendance = 0;
        int Income = 0;

        System.out.println("Marks Percent");
        Marks = sobj.nextInt();

        System.out.println("Attemdance Percent");
        Attendance = sobj.nextInt();

        System.out.println("Family Income");
        Income = sobj.nextInt();

        if(Marks < 0 && Marks >= 100 && Attendance < 0 && Attendance >= 100)
        {
            System.out.println("Invalid Input");
        }

        if(Income < 0)
        {
            System.out.println("Invalid Input");
            return;
        }

        if(Marks < 80)
        {
            System.out.println("Scholarship Rejected : Marks less than 80");
            return;
        }

        if(Attendance < 75)
        {
            System.out.println("Scholarship Rejected : Attemdance less than 75");
            return;
        }

        if(Income > 300000)
        {
            System.out.println("Scholarship Rejected : Income is grater than 30000");
            return;
        }

        System.out.println("\"Scholarship Approved");

        sobj.close();
    }
}

/*
    A scholarship committee uses a strict checklist. Only students who meet all academic and financial conditions qualify.
    Conditions:
    
    Marks >= 80%
    Attendance >= 75%
    Family income > 300000

    Input:
    Marks percent (integer)
    Attendance percent (integer)
    Family income (integer)

    Validations:
    Marks and attendance must be 0–100
    Income cannot be negative

    Expected Output:
    Scholarship Approved
    OR
    Scholarship Rejected: <Reason>

*/