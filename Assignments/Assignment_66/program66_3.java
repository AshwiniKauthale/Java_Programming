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

    public long OnBit(long iNo, int iPos) {
        if (iPos < 1 || iPos > 32) {
            System.out.println("Invalid Position");
            return 0;
        }

        int Mask = 1;
        long Result = 0;

        Mask = Mask << (iPos - 1);

        Result = iNo | Mask;

        return Result;
    }
}

//////////////////////////////////////////////////////////////////
//
// Entry Point Function for Java Application
//
//////////////////////////////////////////////////////////////////

class program66_3
{

    public static void main(String A[]) {
        long Value = 0;
        int iPos = 0;
        long iRet = 0;

        BitMask bobj = new BitMask();

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number");
        Value = sobj.nextLong();

        System.out.println("Enter Position");
        iPos = sobj.nextInt();

        iRet = bobj.OnBit(Value, iPos);

        System.out.println("Modified number is: " + iRet);
    }

}
