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
//  Function Name : LastOccr
//  Description :   return last occurance of character
//  Input :         String
//  Output :        int
//  Author :        Ashwini Vishnu Kauthale
//  Date :          29/11/2025
//
////////////////////////////////////////////////////////////////////

    public int LastOccr(String str, char ch)
    {
        int iCnt = 0;

        char Arr[] = str.toCharArray();

        for(iCnt = Arr.length - 1; iCnt >= 0; iCnt--)
        {
            if(Arr[iCnt] == ch)
            {
                return iCnt;
            }
        }
        return -1;

    }
}

///////////////////////////////////////////////////////////////////
//
//  Entry Point Function for Java Application
//
///////////////////////////////////////////////////////////////////

class program37_4
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

        iRet = strobj.LastOccr(sobj,cValue);
        System.out.println("Last occurance is : "+ iRet);

        strobj = null;
        sobj = null;
        scanobj = null;

        System.gc();
    }
}


////////////////////////////////////////////////////////////////////
//
//   return last occurance of that character
//           Input      check       Output
//
//        MARvellous      l         6
//
////////////////////////////////////////////////////////////////////