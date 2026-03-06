
import java.util.*;

class program78_3
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int GoalCondition = 0;
        int DailySteps = 0;
        int Counter = 0;
        int MaxCount = 0;

        System.out.println("Enter Goal Condition");
        GoalCondition = sobj.nextInt();

        if(GoalCondition < 0)
        {
            System.out.println("Invalid Input");
            return;
        }

        int i = 0;

        System.out.println("Enter Daily Steps");
        for(i = 0; i < 7; i++)
        {
            DailySteps = sobj.nextInt();

            if(DailySteps < 0)
            {
                System.out.println("Invalid Input");
                return;
            }

            if(DailySteps > MaxCount)
            {
                MaxCount = DailySteps;
            }

            if(GoalCondition < DailySteps)
            {
                Counter++;
            }
        }

        System.out.println("Goal Achieved Days : "+Counter);
        System.out.println("Maximum Steps in Week : "+MaxCount);
        
        sobj.close();
    }
}

/*
    A fitness app records steps for 7 days. It wants to show how many days user achieved the goal and what the highest step count was.

    Input:

        7 integers (steps)

    Validations:
        Steps must be >= 0

    Expected Output:
    Goal Achieved Days: <count>
    Maximum Steps in Week: <value>

*/