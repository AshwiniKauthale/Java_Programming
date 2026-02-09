
//////////////////////////////////////////////////////////////////
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
        int iMask = 1;

        iMask = ((iMask << (7 - 1)) | (iMask << (10 - 1)));

        return (iNo ^ iMask);
    }
}

//////////////////////////////////////////////////////////////////
//
// Entry Point Function for Java Application
//
//////////////////////////////////////////////////////////////////

class program65_4
{

    public static void main(String A[])
    {
        long Value = 0;
        long iRet = 0;

        BitMask bobj = new BitMask();
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number");
        Value = sobj.nextLong();

        iRet = bobj.ToggleBit(Value);

        System.out.println("Modified number is : " + iRet);
    }
}
