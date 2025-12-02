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
//  Function Name : ChkSpecial
//  Description   : check special character
//  Input :         Character
//  Output :        boolean
//  Author :        Ashwini Vishnu Kauthale
//  Date :          30/11/2025
//
////////////////////////////////////////////////////////////////////

    public boolean ChkSpecial(char ch)
    {
        if((ch == '!')||(ch == '@')||(ch == '#')||(ch == '$')||(ch == '%')||(ch == '^')||(ch == '&')||(ch == '*'))
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

class program34_4
{
    public static void main(String A[])
    {
        char cValue = '\0';
        boolean bRet = false;
        Scanner scanobj = new Scanner(System.in);

        System.out.println("Enter character : ");
        cValue = scanobj.next().charAt(0);

        Strings strobj = new Strings();

        bRet = strobj.ChkSpecial(cValue);
        if(bRet == true)
        {
            System.out.println("It is a special character");
        }
        else
        {
            System.out.println("It is not a special character");
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
//             Q               FALSE
//             %               TRUE
//
////////////////////////////////////////////////////////////////////