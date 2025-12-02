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
//  Function Name : Display
//  Description   : based on input display toggle if it is character otherwise display as it is
//  Input :         Character
//  Output :
//  Author :        Ashwini Vishnu Kauthale
//  Date :          30/11/2025
//
////////////////////////////////////////////////////////////////////

    public void Display(char ch)
    {
        if((ch >= 'a' && ch <= 'z') )
        {
            System.out.println((char)(ch - 32));
        }
        else if((ch >= 'A' && ch <= 'Z') )
        {
            System.out.println((char)(ch + 32));
        }
        else
        {
            System.out.println(ch);
        }
        
    }
}

///////////////////////////////////////////////////////////////////
//
//  Entry Point Function for Java Application
//
///////////////////////////////////////////////////////////////////

class program34_2
{
    public static void main(String A[])
    {
        char cValue = '\0';

        Scanner scanobj = new Scanner(System.in);

        System.out.println("Enter character : ");
        cValue = scanobj.next().charAt(0);

        Strings strobj = new Strings();

        strobj.Display(cValue);

        strobj = null;
        scanobj = null;

        System.gc();
    }
}



////////////////////////////////////////////////////////////////////
//
//           Input            Output
//
//             a               A
//             d               D
//             F               f
//             4               4
//
////////////////////////////////////////////////////////////////////