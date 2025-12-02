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
//  Function Name : ChkDigit
//  Description   : check it is Digit or not
//  Input :         Character
//  Output :        boolean
//  Author :        Ashwini Vishnu Kauthale
//  Date :          29/11/2025
//
////////////////////////////////////////////////////////////////////

    public boolean ChkDigit(char ch)
    {
        if((ch >= '0' && ch <= '9') )
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

///////////////////////////////////////////////////////////////////
//
//  Entry Point Function for Java Application
//
///////////////////////////////////////////////////////////////////

class program33_3
{
    public static void main(String A[])
    {
        char cValue = '\0';
        boolean bRet = false;

        Scanner scanobj = new Scanner(System.in);

        System.out.println("Enter character : ");
        cValue = scanobj.next().charAt(0);

        Strings strobj = new Strings();

        bRet = strobj.ChkDigit(cValue);

        if(bRet == true)
        {
            System.out.println("It is a Digit");
        }
        else
        {
            System.out.println("It is not a Digit");
        }

        strobj = null;
        scanobj = null;

        System.gc();
    }
}



////////////////////////////////////////////////////////////////////
//
//           Input            Output
//
//             1                true
//             s               false
// 
////////////////////////////////////////////////////////////////////