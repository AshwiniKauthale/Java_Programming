import java.util.*;

class program77_2
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int distance, bookingHoursBefore, age;
        String classType;
        double fare = 0;

        System.out.println("Enter distance (km):");
        distance = sobj.nextInt();

        System.out.println("Enter class (Sleeper / 3AC / 2AC):");
        classType = sobj.next();

        System.out.println("Enter booking hours before journey:");
        bookingHoursBefore = sobj.nextInt();

        System.out.println("Enter age:");
        age = sobj.nextInt();

        // Distance slab calculation
        if(distance <= 100)
        {
            fare = distance * 1;
        }
        else if(distance <= 300)
        {
            fare = (100 * 1) + ((distance - 100) * 1.5);
        }
        else
        {
            fare = (100 * 1) + (200 * 1.5) + ((distance - 300) * 2);
        }

        // Class charges
        if(classType.equals("Sleeper"))
        {
            fare = fare + 100;
        }
        else if(classType.equals("3AC"))
        {
            fare = fare + 300;
        }
        else if(classType.equals("2AC"))
        {
            fare = fare + 500;
        }

        // Tatkal charge
        if(bookingHoursBefore <= 24)
        {
            fare = fare + (fare * 0.30);
            System.out.println("Tatkal charge applied (30%)");
        }

        // Senior citizen discount
        if(age >= 60)
        {
            fare = fare - (fare * 0.40);
            System.out.println("Senior citizen discount applied (40%)");
        }

        System.out.println("Final Fare: " + fare);
    }
}