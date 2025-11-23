///////////////////////////////////////////////////////////////////
//
//  Required Packages
//
////////////////////////////////////////////////////////////////////

import java.util.*;

///////////////////////////////////////////////////////////////////
//
//  Class Name : Pattern
//
////////////////////////////////////////////////////////////////////

class Pattern
{
////////////////////////////////////////////////////////////////////
//
//  Function Name : Diaplay
//  Description :   It is used to display pattern
//  Input :         Integer,Integer
//  Output :        Displays  pattern on screen
//  Author :        Ashwini Vishnu Kauthale
//  Date :          20/11/2025
//
////////////////////////////////////////////////////////////////////

    public void Display(int iRow,int iCol)
    {
        int i = 0, j = 0;

        for(i = 1; i <= iRow; i++)
        {
            for(j = 1; j <= iCol; j++)
            {
                System.out.print(i + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }
}

///////////////////////////////////////////////////////////////////
//
//  Entry Point Function for Java Application
//
///////////////////////////////////////////////////////////////////

class program27_5
{
    public static void main(String A[])
    {
        int iValue1  = 0, iValue2 = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number of rows :");
        iValue1 = sobj.nextInt();
        System.out.println("Enter the number of columns :");
        iValue2 = sobj.nextInt();

        Pattern pobj = new Pattern();
        pobj.Display(iValue1,iValue2);
    }
}

////////////////////////////////////////////////////////////////////
//
//  iRow = 3
//  iCol = 4
//  Output : 
//           1 1 1 1
//           2 2 2 2
//           3 3 3 3
//           4 4 4 4 
////////////////////////////////////////////////////////////////////
