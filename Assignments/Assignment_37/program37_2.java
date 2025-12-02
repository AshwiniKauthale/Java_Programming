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
//  Function Name : CountkChar
//  Description :   count given number character is present 
//  Input :         String
//  Output :        int
//  Author :        Ashwini Vishnu Kauthale
//  Date :          29/11/2025
//
////////////////////////////////////////////////////////////////////

    public int CountChar(String str, char ch)
    {
        int iCnt = 0,iCount = 0;

        char Arr[] = str.toCharArray();

        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if(Arr[iCnt] == ch)
            {
                iCount++;
            }
        }
        return iCount;

    }
}

///////////////////////////////////////////////////////////////////
//
//  Entry Point Function for Java Application
//
///////////////////////////////////////////////////////////////////

class program37_2
{
    public static void main(String A[])
    {
        int iRet = 0;
        Scanner scanobj = new Scanner(System.in);

        System.out.println("Enter String :");
        String sobj = scanobj.nextLine();

        System.out.println("Enter character whih you want to check");
        char cValue = scanobj.next().charAt(0);

        Strings strobj = new Strings();

        iRet = strobj.CountChar(sobj,cValue);
        System.out.println("Count is : "+ iRet);

        strobj = null;
        sobj = null;
        scanobj = null;

        System.gc();
    }
}


////////////////////////////////////////////////////////////////////
//
//   return frequency of that character
//           Input      check       Output
//
//        MARvellous      l         2
//
////////////////////////////////////////////////////////////////////