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
//  Function Name : ToggleBitRange
//  Description   : Used to toggle bits from the given range
//  Input :         long,long
//  Output :        nothing
//  Author :        Ashwini Vishnu Kauthale
//  Date :          05/02/2025
//
////////////////////////////////////////////////////////////////////

    public long ToggleBitRange(long iNo,int iStart,int iEnd)
    {
        long iMask = 0;
        long iResult = 0;

        iMask = ((1L << (iEnd + 1)) - 1) ^ ((1L << iStart) - 1);

        iResult = iNo ^ iMask;

        return iResult;
    }
}

//////////////////////////////////////////////////////////////////
//
// Entry Point Function for Java Application
//
//////////////////////////////////////////////////////////////////

class program67_5
{
    public static void main(String A[])
    {
        long Value1 = 0,iRet = 0;
        int Start = 0,End = 0;

        BitMask bobj = new BitMask();

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter first Number");
        Value1 = sobj.nextLong();

        System.out.println("Enter start position");
        Start = sobj.nextInt();

        System.out.println("Enter End Position");
        End = sobj.nextInt();

        iRet = bobj.ToggleBitRange(Value1,Start,End);

        System.out.println("Toggled value is  :"+ iRet);

        bobj = null;
        sobj  = null;
    }

}
