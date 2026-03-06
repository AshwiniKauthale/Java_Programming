import java.util.*;

class program80_3
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iRow = 0;
        int iCol = 0;

        int i = 0, j = 0, no = 0;

        System.out.println("Enter Rows");
        iRow = sobj.nextInt();

        System.out.println("Enter Columns");
        iCol = sobj.nextInt();

        if(iRow <= 0 || iCol <= 0)
        {
            System.out.println("Invalid Input");
            return;
        }

        int Arr[][] = new int[iRow][iCol];

        System.out.println("Enter the data for Matrix (0/-1)");
        for(i = 0; i < iRow; i++)
        {
            System.out.println("Enter the data for : "+i+" row");
            for(j = 0; j < iCol; j++)
            {
                no = sobj.nextInt();

                if(no == 0 || no == -1)
                {
                    Arr[i][j] = no;
                }
                else
                {
                    System.out.println("Invalid Input");
                    return;
                }
            }
        }

        if(Arr[0][0] == -1 || Arr[iRow - 1][iCol -1] == -1)
        {
            System.out.println("No Path Found");
            return;
        }

        for(i = 0; i < iRow; i++)
        { for(j = 0; j < iCol; j++)
        {
            if((i + 1) < iRow && (j + 1) < iCol)
            {
                if(Arr[i][j + 1] != 0 && Arr[i + 1][j] != 0)
                {
                    System.out.println("No Path Found");
                    return;
                }
            }
            
            else if((j + 1) < iCol)
            {
                if(Arr[i][j + 1] == 0)
                {
                    j++;
                }
            }
            
            else if((i + 1) < iRow)
            {
                if(Arr[i + 1][j] == 0)
                {
                    i++;
                }
            }

            if(i == iRow -1 && j == iCol - 1)
            { System.out.println("Path Available");
        }
    } 
}

        sobj.close();
    }
}

/*
    Design a Java application to simulate a warehouse robot moving inside a grid.

    The warehouse is represented as a matrix:

        0 → Free space
        -1 → Obstacle

    Robot starts at position (0,0) and must reach (R-1,C-1).

    Robot can only move:

        Right
        Down

    Requirements:

        Determine if a valid path exists.
        If exists, print "Path Available".
        Otherwise print "No Path Found".

    Input Format:

        First line: Integer R
        Second line: Integer C
        Next R lines: C integers (0 or -1)

    Validations:

        R > 0
        C > 0
        Matrix values must be 0 or -1

    Sample Input:
    3
    3
    0 0 0
    -1 0 -1
    0 0 0

    Sample Output:

    Path Available
*/