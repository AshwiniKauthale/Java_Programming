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
//  Function Name : ChkSmall
//  Description   : check it is small or not
//  Input :         Character
//  Output :        boolean
//  Author :        Ashwini Vishnu Kauthale
//  Date :          29/11/2025
//
////////////////////////////////////////////////////////////////////

    public boolean ChkSmall(char ch)
    {
        if((ch >= 'a' && ch <= 'z') )
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

class program33_4
{
    public static void main(String A[])
    {
        char cValue = '\0';
        boolean bRet = false;

        Scanner scanobj = new Scanner(System.in);

        System.out.println("Enter character : ");
        cValue = scanobj.next().charAt(0);

        Strings strobj = new Strings();

        bRet = strobj.ChkSmall(cValue);

        if(bRet == true)
        {
            System.out.println("It is Small character");
        }
        else
        {
            System.out.println("It is not Small character");
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
//             m                true
//             S               false
// 
////////////////////////////////////////////////////////////////////