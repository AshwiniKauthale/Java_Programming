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

class Strings
{
////////////////////////////////////////////////////////////////////
//
//  Function Name : DisplaySchedule
//  Description   : based on input display exam schedule
//  Input :         Character
//  Output :
//  Author :        Ashwini Vishnu Kauthale
//  Date :          30/11/2025
//
////////////////////////////////////////////////////////////////////

    public void DisplaySchedule(char ch)
    {
        if((ch == 'a' || ch == 'A') )
        {
            System.out.println("Your exam at 7 AM");
        }
        else if((ch == 'b' || ch == 'B') )
        {
            System.out.println("Your exam at 8.30 AM");
        }
        else if((ch == 'c' || ch == 'C') )
        {
            System.out.println("Your exam at 9.20 AM");
        }
        else if((ch == 'd' || ch == 'D') )
        {
            System.out.println("Your exam at 10.30 AM");
        }
        else
        {
            System.out.println("Enter correct input");
        }
        
    }
}

///////////////////////////////////////////////////////////////////
//
//  Entry Point Function for Java Application
//
///////////////////////////////////////////////////////////////////

class program33_5
{
    public static void main(String A[])
    {
        char cValue = '\0';

        Scanner scanobj = new Scanner(System.in);

        System.out.println("Enter character : ");
        cValue = scanobj.next().charAt(0);

        Strings strobj = new Strings();

        strobj.DisplaySchedule(cValue);

        strobj = null;
        scanobj = null;

        System.gc();
    }
}



////////////////////////////////////////////////////////////////////
//
//           Input            Output
//
//             a               Your exam at 7 AM
//             d               Your exam at 10.30 AM
// 
////////////////////////////////////////////////////////////////////