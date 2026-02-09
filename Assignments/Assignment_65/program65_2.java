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
//  Function Name : OffBit
//  Description   : Used to Off th given bit
//  Input :         long
//  Output :        long
//  Author :        Ashwini Vishnu Kauthale
//  Date :          04/02/2025
//
////////////////////////////////////////////////////////////////////

    public long OffBit(long iNo)
    {
        int iMask = 1;

        iMask = ((iMask << (7 - 1)) | (iMask << (10 - 1)));

        iMask = ~iMask;
        return (iNo & iMask);
    }
}

//////////////////////////////////////////////////////////////////
//
// Entry Point Function for Java Application
//
//////////////////////////////////////////////////////////////////

class program65_2
{

    public static void main(String A[])
    {
        long Value = 0;
        long iRet = 0;

        BitMask bobj = new BitMask();
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number");
        Value = sobj.nextLong();

        iRet = bobj.OffBit(Value);

        System.out.println("Modified number is : " + iRet);
    }
}
