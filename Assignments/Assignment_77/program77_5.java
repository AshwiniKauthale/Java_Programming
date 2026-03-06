import java.util.*;

class program77_5
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int rows, cols;

        System.out.println("Enter number of rows:");
        rows = sobj.nextInt();

        System.out.println("Enter number of columns:");
        cols = sobj.nextInt();

        boolean seats[][] = new boolean[rows][cols];

        int price[] = new int[rows];

        System.out.println("Enter price for each row:");
        for(int i = 0; i < rows; i++)
        {
            price[i] = sobj.nextInt();
        }

        // Already booked seats
        System.out.println("Enter number of already booked seats:");
        int booked = sobj.nextInt();

        System.out.println("Enter booked seats (row col):");
        for(int i = 0; i < booked; i++)
        {
            int r = sobj.nextInt();
            int c = sobj.nextInt();
            seats[r][c] = true;
        }

        // Requested seats
        System.out.println("Enter number of seats to book:");
        int request = sobj.nextInt();

        int reqRow[] = new int[request];
        int reqCol[] = new int[request];

        System.out.println("Enter requested seats (row col):");
        for(int i = 0; i < request; i++)
        {
            reqRow[i] = sobj.nextInt();
            reqCol[i] = sobj.nextInt();
        }

        // Check availability
        for(int i = 0; i < request; i++)
        {
            if(seats[reqRow[i]][reqCol[i]] == true)
            {
                System.out.println("Booking Failed - Seat already booked");
                return;
            }
        }

        // Calculate total cost
        int total = 0;

        for(int i = 0; i < request; i++)
        {
            total = total + price[reqRow[i]];
            seats[reqRow[i]][reqCol[i]] = true;
        }

        // Group discount
        if(request >= 6)
        {
            total = (int)(total * 0.9);
        }

        // Count remaining seats
        int remaining = 0;

        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < cols; j++)
            {
                if(seats[i][j] == false)
                {
                    remaining++;
                }
            }
        }

        System.out.println("Booking Successful");
        System.out.println("Total Cost: " + total);
        System.out.println("Remaining Seats: " + remaining);
    }
}