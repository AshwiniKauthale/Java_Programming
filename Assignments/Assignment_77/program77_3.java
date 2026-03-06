import java.util.*;

class program77_3
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int mins, gb, sms;

        System.out.println("Enter call minutes:");
        mins = sobj.nextInt();

        System.out.println("Enter data in GB:");
        gb = sobj.nextInt();

        System.out.println("Enter SMS count:");
        sms = sobj.nextInt();

        int price[] = {199,299,399,499};
        int callLimit[] = {200,400,600,1000};
        int dataLimit[] = {2,4,6,10};
        int smsLimit[] = {100,200,300,500};

        double totalCost[] = new double[4];

        for(int i=0;i<4;i++)
        {
            totalCost[i] = price[i];

            if(mins > callLimit[i])
            {
                totalCost[i] += (mins - callLimit[i]) * 1;
            }

            if(gb > dataLimit[i])
            {
                totalCost[i] += (gb - dataLimit[i]) * 10;
            }

            if(sms > smsLimit[i])
            {
                totalCost[i] += (sms - smsLimit[i]) * 0.5;
            }
        }

        int minIndex = 0;

        for(int i=1;i<4;i++)
        {
            if(totalCost[i] < totalCost[minIndex])
            {
                minIndex = i;
            }
        }

        char plan = (char)('A' + minIndex);

        System.out.println("Recommended Plan: " + plan);
        System.out.println("Total Cost: " + totalCost[minIndex]);
    }
}