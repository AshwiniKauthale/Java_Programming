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
//  Function Name : ChkVowel
//  Description   : check Vowel is present or not
//  Input :         Character
//  Output :        boolean
//  Author :        Ashwini Vishnu Kauthale
//  Date :          30/11/2025
//
////////////////////////////////////////////////////////////////////

    public boolean ChkVowel(String str)
    {
        int iCnt = 0,iCountSmall = 0;

        char Arr[] = str.toCharArray();
        
        for(iCnt = 0; iCnt < Arr.length;iCnt++)
        {
            if((Arr[iCnt] == 'a')||(Arr[iCnt] == 'e')||(Arr[iCnt] == 'i')||(Arr[iCnt] == 'o')||(Arr[iCnt] == 'u')||(Arr[iCnt] == 'A')||(Arr[iCnt] == 'E')||(Arr[iCnt] == 'I')||(Arr[iCnt] == 'O')||(Arr[iCnt] == 'U'))
            {
                return true;
            }
        }
        return false;
    }

}

///////////////////////////////////////////////////////////////////
//
//  Entry Point Function for Java Application
//
///////////////////////////////////////////////////////////////////

class program35_4
{
    public static void main(String A[])
    {
        boolean bRet = false;
        Scanner scanobj = new Scanner(System.in);

        System.out.println("Enter String :");
        String sobj = scanobj.nextLine();

        Strings strobj = new Strings();

        bRet = strobj.ChkVowel(sobj);
        if(bRet == true)
        {
            System.out.println("It contain vowel");
        }
        else
        {
            System.out.println("It not contain vowel");
        }

        strobj = null;
        sobj = null;
        scanobj = null;

        System.gc();
    }
}



////////////////////////////////////////////////////////////////////
//
//           Input            Output
//
//         marvellous         true
//           xyz             false
//
////////////////////////////////////////////////////////////////////