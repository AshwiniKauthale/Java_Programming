/*
    iRow : 4
    iCol : 4

    *
    * *
    * * *
    * * * *
*/

import java.util.Scanner;

class Pattern
{
    // Filter for square Matrix
    public void Display(int iRow,int iCol)
    {
        int i = 0, j = 0;
        if(iRow != iCol)
        {
            System.out.println("Invalid input");
            System.out.println("Row number and column numder should be same");

            return;
        }

        for(i = 1; i<= iRow; i++)
        
        {
            for(j = 1; j <= iCol; j++)
            {
                if(i >= j)
                {
                    System.out.print("*\t");
                }
            }

            System.out.println();
        }
    }
}

class program194
{
    public static void main(String A[])
    {
        int iValue1 = 0, iValue2 = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number of Rows :");
        iValue1 = sobj.nextInt();

        System.out.println("Enter number of Columns :");
        iValue2 = sobj.nextInt();

        Pattern pobj = new Pattern();
        pobj.Display(iValue1,iValue2);

    }
}