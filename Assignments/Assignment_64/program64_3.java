///////////////////////////////////////////////////////////////////
//
//  Required Packages
//
////////////////////////////////////////////////////////////////////

import java.util.*;

///////////////////////////////////////////////////////////////////
//
//  Class Name : Bitmask
//
////////////////////////////////////////////////////////////////////

class BitMask
{

////////////////////////////////////////////////////////////////////
//
//  Function Name : ChkBit
//  Description   : Used to check Bit is off or on
//  Input :         long
//  Output :        boolean
//  Author :        Ashwini Vishnu Kauthale
//  Date :          04/02/2025
//
////////////////////////////////////////////////////////////////////

    public boolean ChkBit(long iNo) 
    {
        int iMask = 1;
        long Result = 0;
        boolean bFlag = false;

        iMask = ((iMask << (7 - 1)) | (iMask << (15 - 1)) | (iMask << (21 - 1)) | (iMask << (28 - 1)));

        Result = iMask & iNo;
        if (Result == iMask) {
            bFlag = true;
        } else {
            bFlag = false;
        }

        return bFlag;
    }
}

//////////////////////////////////////////////////////////////////
//
// Entry Point Function for Java Application
//
//////////////////////////////////////////////////////////////////

class program64_3
{

    public static void main(String A[]) {
        long iValue = 0;
        boolean bRet = false;
        Scanner sobj = new Scanner(System.in);

        BitMask bobj = new BitMask();

        System.out.println("Enter number");
        iValue = sobj.nextLong();

        bRet = bobj.ChkBit(iValue);

        if (bRet == true)
        {
            System.out.println("7th & 15th & 21th & 28th bit is ON");
        }
        else
        {
            System.out.println("7th & 15th & 21th & 28th bit is OFF");
        }
    }
}
