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
        int i = 0, j = 0,iCnt = 0;
        char Cch = 'a';

        for(i = 1; i <= iRow; i++)
        {
            if ((i % 2) != 0)
            {
                Cch = 'a';
                for(j = 1; j <= iCol; j++)
                {
                    System.out.print(Cch +"\t");
                    Cch++;
                }
                System.out.println();
            }
            else
            {
                iCnt = 1;
                for(j = 1; j <= iCol; j++)
                {
                    System.out.print(iCnt + "\t");
                    iCnt++;
                }
                System.out.println();
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

class program29_3
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
//  iRow = 5
//  iCol = 5
//  Output : 
//           a b c d e
//           1 2 3 4 5
//           a b c d e
//           1 2 3 4  5
//           a b c d e 
////////////////////////////////////////////////////////////////////
