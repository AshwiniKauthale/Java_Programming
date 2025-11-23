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
        char ch = 'A';

        for(i = 1; i <= iRow; i++)
        {
            for(j = 1; j <= iCol; j++)
            {
                System.out.print(ch + "\t");
            }
            System.out.println();
            ch++;
        }
        System.out.println();
    }
}
///////////////////////////////////////////////////////////////////
//
//  Entry Point Function for Java Application
//
///////////////////////////////////////////////////////////////////

class program28_3
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
//           A A A A A
//           B B B B B
//           C C C C C
////////////////////////////////////////////////////////////////////
