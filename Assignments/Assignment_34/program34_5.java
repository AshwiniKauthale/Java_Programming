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
//  Description   : display ASCII value in decimal, Octal, Hexadecimal
//  Input :         Character
//  Output :        boolean
//  Author :        Ashwini Vishnu Kauthale
//  Date :          30/11/2025
//
////////////////////////////////////////////////////////////////////

    public void Display(char ch)
    {
        System.out.printf("Decimal : %d \n",(int)ch);
        System.out.printf("Octal : %o \n", (int)ch);
        System.out.printf("Hexadecimal : 0X%X \n",(int) ch);
    }
}

///////////////////////////////////////////////////////////////////
//
//  Entry Point Function for Java Application
//
///////////////////////////////////////////////////////////////////

class program34_5
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
//             QA              Decimal : 65          Octal  :  0101   Hexxadecimal  : 0X41
//
////////////////////////////////////////////////////////////////////