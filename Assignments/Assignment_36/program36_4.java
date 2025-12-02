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
//  Function Name : DisplayDidit
//  Description :   seperate digit from string
//  Input :         String
//  Output :
//  Author :        Ashwini Vishnu Kauthale
//  Date :          29/11/2025
//
////////////////////////////////////////////////////////////////////

    public void DisplayDigit(String str)
    {
        int iCnt = 0;

        char Arr[] = str.toCharArray();

        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if(Arr[iCnt] >= '0' && Arr[iCnt] <= '9')
            {
                System.out.print(Arr[iCnt]);
            }
        }
    }
}

///////////////////////////////////////////////////////////////////
//
//  Entry Point Function for Java Application
//
///////////////////////////////////////////////////////////////////

class program36_4
{
    public static void main(String A[])
    {
        Scanner scanobj = new Scanner(System.in);

        System.out.println("Enter String :");
        String sobj = scanobj.nextLine();

        Strings strobj = new Strings();

        strobj.DisplayDigit(sobj);

        strobj = null;
        sobj = null;
        scanobj = null;

        System.gc();

    }
}


////////////////////////////////////////////////////////////////////
//
//
//        Accept string from user and Display only Digits
//
//           Input                Output
//
//       Marve6729llous564       6729564
//
////////////////////////////////////////////////////////////////////