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
//  Function Name : ChkCapital
//  Description   : check it is capital or not
//  Input :         Character
//  Output :        boolean
//  Author :        Ashwini Vishnu Kauthale
//  Date :          29/11/2025
//
////////////////////////////////////////////////////////////////////

    public boolean ChkCapital(char ch)
    {
        if((ch >= 'A' && ch <= 'Z') )
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

class program33_2
{
    public static void main(String A[])
    {
        char cValue = '\0';
        boolean bRet = false;

        Scanner scanobj = new Scanner(System.in);

        System.out.println("Enter character : ");
        cValue = scanobj.next().charAt(0);

        Strings strobj = new Strings();

        bRet = strobj.ChkCapital(cValue);

        if(bRet == true)
        {
            System.out.println("It is Capital character");
        }
        else
        {
            System.out.println("It is not Capital character");
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
//             M                true
//             s               false
// 
////////////////////////////////////////////////////////////////////