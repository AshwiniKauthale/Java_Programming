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
//  Description   : Used to check Bit is On or Off
//  Input :         long
//  Output :        boolean
//  Author :        Ashwini Vishnu Kauthale
//  Date :          04/02/2025
//
////////////////////////////////////////////////////////////////////

    public boolean ChkBit(long iNo)
    {
        boolean bFlag = false;
        int Mask = 1;
        long Result = 0;

        Mask = ((Mask << (9 - 1)) | (Mask << (12 - 1)));

        Result = iNo | Mask;

        if (Result != 0) {
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

class program67_3
{

    public static void main(String A[])
    {
        long Value = 0;
        boolean bRet = false;

        BitMask bobj = new BitMask();

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number");
        Value = sobj.nextLong();

        bRet = bobj.ChkBit(Value);

        if (bRet == true) {
            System.out.println("Bit is ON");
        } else {
            System.out.println("Bit is Off");
        }
    }

}
