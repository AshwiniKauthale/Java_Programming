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

    public boolean ChkBit(long iNo) {
        boolean bFlag = false;
        long Mask = 1, Result = 0;

        Mask = ((Mask << (7 - 1)) | (Mask << (8 - 1)) | (Mask << (9 - 1)));

        Result = iNo & Mask;

        if (Result == Mask) {
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

class program64_4
{

    public static void main(String A[]) {
        long iValue = 0;
        boolean bRet = false;
        Scanner sobj = new Scanner(System.in);

        BitMask bobj = new BitMask();

        System.out.println("Enter number");
        iValue = sobj.nextLong();

        bRet = bobj.ChkBit(iValue);

        if (bRet == true) {
            System.out.println("7th & 8th & 9th Bit is ON");
        } else {
            System.out.println("7th & 8th & 9th Bit is OFF");
        }
    }
}
