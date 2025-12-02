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
//  Function Name : CopyX
//  Description :   copy character string in another string by removing white spaces
//  Input :         String
//  Output :        
//  Author :        Ashwini Vishnu Kauthale
//  Date :          30/11/2025
//
////////////////////////////////////////////////////////////////////

    public void CopyX(String str)
    {
        int iCnt = 0;

        char Arr[] = str.toCharArray();

        String dest ="";
        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if(Arr[iCnt] != ' ')
            {
                dest = dest + Arr[iCnt];
            } 
        }

        System.out.println("Updated string is "+dest);

    }
}

///////////////////////////////////////////////////////////////////
//
//  Entry Point Function for Java Application
//
///////////////////////////////////////////////////////////////////

class program38_2
{
    public static void main(String A[])
    {
        Scanner scanobj = new Scanner(System.in);

        System.out.println("Enter String :");
        String sobj1 = scanobj.nextLine();


        Strings strobj = new Strings();

        strobj.CopyX(sobj1);

        strobj = null;
        sobj1 = null;
        scanobj = null;

        System.gc();
    }
}


////////////////////////////////////////////////////////////////////
//
//           Input             Output
//
//        MAR  VELL  OUS        SUOLLEVRAM
//
////////////////////////////////////////////////////////////////////