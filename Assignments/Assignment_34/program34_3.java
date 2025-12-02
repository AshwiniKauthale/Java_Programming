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
//  Description   : based on input display input to Zmif it is character is Capital and dispkay character to a if it is small otherwise display as it is
//  Input :         Character
//  Output :
//  Author :        Ashwini Vishnu Kauthale
//  Date :          30/11/2025
//
////////////////////////////////////////////////////////////////////

    public void Display(char ch)
    {
        int iCnt = 0;
        if((ch >= 'a' && ch <= 'z') )
        {
            for(iCnt = ch; ch >= 'a'; ch--)
            {
                System.out.println(ch);
            }
        }
        else if((ch >= 'A' && ch <= 'Z') )
        {
            for(iCnt = ch; ch <= 'Z'; ch++)
            {
                System.out.println(ch);
            }
        }
        else
        {
            return;
        }
        
    }
}

///////////////////////////////////////////////////////////////////
//
//  Entry Point Function for Java Application
//
///////////////////////////////////////////////////////////////////

class program34_3
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
//             Q               Q R S T U V W X Y Z
//             f               f e d c b a
//
////////////////////////////////////////////////////////////////////