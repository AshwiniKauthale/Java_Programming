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
//  Function Name : CountWhoteSpaces
//  Description :   count number of white spaces from string
//  Input :         String
//  Output :        int
//  Author :        Ashwini Vishnu Kauthale
//  Date :          29/11/2025
//
////////////////////////////////////////////////////////////////////

    public int CountWhiteSpaces(String str)
    {
        int iCnt = 0,iCount = 0;

        char Arr[] = str.toCharArray();

        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if(Arr[iCnt] == ' ')
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

class program36_5
{
    public static void main(String A[])
    {
        int iRet = 0;
        Scanner scanobj = new Scanner(System.in);

        System.out.println("Enter String :");
        String sobj = scanobj.nextLine();

        Strings strobj = new Strings();

        iRet = strobj.CountWhiteSpaces(sobj);

        System.out.println("White spaces are :"+ iRet);

        strobj = null;
        sobj = null;
        scanobj = null;

        System.gc();
    }
}


////////////////////////////////////////////////////////////////////
//
//
//
//           Input                Output
//
//       Marv e6729llo us56 4        3
//
////////////////////////////////////////////////////////////////////