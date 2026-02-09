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
//  Function Name : ToggleBit
//  Description   : Used to Toggle the given bit
//  Input :         long
//  Output :        long
//  Author :        Ashwini Vishnu Kauthale
//  Date :          04/02/2025
//
////////////////////////////////////////////////////////////////////

    public long ToggleBit(long iNo)
    {
        int Mask = 1;
        long Result = 0;

        Mask = ((Mask << (32 - 1)) | (Mask << (32 - 2)) | (Mask << (32 - 3)) | (Mask << (32 - 4)) | (Mask << (1 - 1)) | (Mask << (2 - 1)) | (Mask << (3 - 1)) | (Mask << (4 - 1)));

        Result = iNo ^ Mask;

        return Result;
    }
}

//////////////////////////////////////////////////////////////////
//
// Entry Point Function for Java Application
//
//////////////////////////////////////////////////////////////////

class program66_5
{

    public static void main(String A[])
    {
        long Value = 0;
        long iRet = 0;

        BitMask bobj = new BitMask();

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number");
        Value = sobj.nextLong();

        iRet = bobj.ToggleBit(Value);

        System.out.println("Modified number is: " + iRet);
    }
}
