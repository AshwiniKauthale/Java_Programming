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
//  Description   : Used to check Bit is off or on at given position
//  Input :         long,int,int
//  Output :        boolean
//  Author :        Ashwini Vishnu Kauthale
//  Date :          04/02/2025
//
////////////////////////////////////////////////////////////////////

    public boolean ChkBit(long iNo, int iPos1, int iPos2)
    {
        boolean bFlag = false;
        int Mask = 1;
        long Result = 0;

        Mask = ((Mask << (iPos1 - 1)) | (Mask << (iPos2 - 1)));

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

class program67_4
{
    public static void main(String A[])
    {
        long Value = 0;
        int iPos1 = 0, iPos2 = 0;
        boolean bRet = false;

        BitMask bobj = new BitMask();

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number");
        Value = sobj.nextLong();

        System.out.println("Enter first position");
        iPos1 = sobj.nextInt();

        System.out.println("Enter second position");
        iPos2 = sobj.nextInt();

        bRet = bobj.ChkBit(Value, iPos1, iPos2);

        if (bRet == true)
        {
            System.out.println("Bit is ON");
        }
        else
        {
            System.out.println("Bit is Off");
        }
    }

}
