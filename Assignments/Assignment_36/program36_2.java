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
//  Function Name : toUpperX
//  Description :   converting string into Uppercase
//  Input :         String
//  Output :        String
//  Author :        Ashwini Vishnu Kauthale
//  Date :          29/11/2025
//
////////////////////////////////////////////////////////////////////

    public String toUpperX(String str)
    {
        int iCnt = 0;

        char Arr[] = str.toCharArray();

        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if(Arr[iCnt] >= 'a' && Arr[iCnt] <= 'z')
            {
                Arr[iCnt] = (char)(Arr[iCnt] - 32);
            }
        }
        return new String(Arr);
    }
}

///////////////////////////////////////////////////////////////////
//
//  Entry Point Function for Java Application
//
///////////////////////////////////////////////////////////////////

class program36_2
{
    public static void main(String A[])
    {
        String sRet = null;
        Scanner scanobj = new Scanner(System.in);

        System.out.println("Enter String :");
        String sobj = scanobj.nextLine();

        Strings strobj = new Strings();

        sRet = strobj.toUpperX(sobj);

        System.out.println("Updated string : "+sRet);

        strobj = null;
        sobj = null;
        scanobj = null;

        System.gc();
    }
}


////////////////////////////////////////////////////////////////////
//
//
//        Accept string from user and convert it into uppercase
//
//           Input                          Output
//
//       Marvellous is multi os        MARVELLOUS IS MULTI OS
//
////////////////////////////////////////////////////////////////////