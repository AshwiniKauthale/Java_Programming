import java.util.*;

class program76_5
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Battery_Percentage = 0;
        String status = null;

        System.out.println("Battery Percentage");
        Battery_Percentage = sobj.nextInt();

        if(Battery_Percentage < 0 || Battery_Percentage > 100)
        {
            System.out.println("Invalid Input");
            return;
        }

        if(Battery_Percentage <= 5)
        {
            status = "Critical";
        }
        else if(Battery_Percentage <= 15)
        {
            status = "Low";
        }
        else
        {
            status = "Normal";
        }

        System.out.println("Battery Percentage: "+ Battery_Percentage);
        System.out.println("Status :"+status);
        
        sobj.close();
    }
}

/*
    A phone OS shows different battery warnings. The user wants a program that prints the correct battery status.

    Rules:
    Battery <= 5%  Critical
    Battery <= 15% : Low
    Otherwise : Normal

    Input:
    Battery percentage (integer)

    Validations:
    0 to 100 only

    Expected Output:
    Battery Percentage: <value>%
    Status: <Critical/Low/Normal>

*/