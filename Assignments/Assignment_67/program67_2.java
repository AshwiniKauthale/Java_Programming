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
//  Input :         long,long
//  Output :        nothing
//  Author :        Ashwini Vishnu Kauthale
//  Date :          05/02/2025
//
////////////////////////////////////////////////////////////////////

    public void CommonBits(long iNo1, long iNo2 )
    {
        long iResult = 0;
        long iMask = 0;
        
        iResult = iNo1 & iNo2;

        System.out.print("Common ON bit positions are: ");
        
        for(int i = 1; i <= 34; i++)
        {
            iMask = 1L << (i - 1);
            
            if((iResult & iMask) != 0)
            {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}

//////////////////////////////////////////////////////////////////
//
// Entry Point Function for Java Application
//
//////////////////////////////////////////////////////////////////

class program67_2
{
    public static void main(String A[])
    {
        long Value1 = 0,Value2 = 0;
        boolean bRet = false;

        BitMask bobj = new BitMask();

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter first Number");
        Value1 = sobj.nextLong();

        System.out.println("Enter Second Number");
        Value2 = sobj.nextInt();


        bobj.CommonBits(Value1,Value2);

        bobj = null;
        sobj  = null;
    }

}
