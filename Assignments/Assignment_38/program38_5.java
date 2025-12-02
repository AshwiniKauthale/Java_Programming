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
//  Function Name : CopyToggleX
//  Description :   copy character string in another string by in toggle case
//  Input :         String
//  Output :        
//  Author :        Ashwini Vishnu Kauthale
//  Date :          30/11/2025
//
////////////////////////////////////////////////////////////////////

    public void CopyToggleX(String str)
    {
        int iCnt = 0;

        char Arr[] = str.toCharArray();

        String dest ="";
        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if(Arr[iCnt] >= 'A' && Arr[iCnt] <= 'Z')
            {
                dest = dest + (char)(Arr[iCnt] + 32); 
            }
            else if(Arr[iCnt] >= 'a' && Arr[iCnt] <= 'z')
            {
                dest = dest + (char)(Arr[iCnt] - 32); 
            }
            
        }

        System.out.println("Updated string is : "+dest);

    }
}

///////////////////////////////////////////////////////////////////
//
//  Entry Point Function for Java Application
//
///////////////////////////////////////////////////////////////////

class program38_5
{
    public static void main(String A[])
    {
        Scanner scanobj = new Scanner(System.in);

        System.out.println("Enter String :");
        String sobj1 = scanobj.nextLine();


        Strings strobj = new Strings();

        strobj.CopyToggleX(sobj1);

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
//        MARVEllous           marveLLOUS
//
////////////////////////////////////////////////////////////////////