///////////////////////////////////////////////////////////////////
//
//  Required Packages
//
////////////////////////////////////////////////////////////////////

import  java.util.*;

///////////////////////////////////////////////////////////////////
//
//  Class Name : Matrix
//
////////////////////////////////////////////////////////////////////

class Matrix
{
    public int iRow;
    public int iCol;
    public int Arr[][];

////////////////////////////////////////////////////////////////////
//
//  Function Name : Matrix
//  Description   : Used to initialise the non static characteristics of class
//  Input :         Integer,Integer
//  Output :        Nothing
//  Author :        Ashwini Vishnu Kauthale
//  Date :          23/02/2025
//
////////////////////////////////////////////////////////////////////

    public Matrix(int A, int B)
    {
        this.iRow = A;
        this.iCol = B;
        Arr = new int[iRow][iCol];
    }

    ////////////////////////////////////////////////////////////////////
    //
    //  Function Name : Accept()
    //  Description   : Used to Accept the elements of Matrix
    //  Input :         Nothing
    //  Output :        Nothing
    //  Author :        Ashwini Vishnu Kauthale
    //  Date :          23/02/2025
    //
    ////////////////////////////////////////////////////////////////////

    public void Accept()
    {
        if(iRow != iCol)
        {
            System.out.println("Invalid Parameter");
            System.out.println("Number of Rows should be equal to number of Columns");
            return;
        }

        Scanner sobj = new Scanner(System.in);
        int i = 0 , j = 0;

        System.out.println("Enter the elements of matrix");

        for(i = 0; i < iRow; i++)
        {
            System.out.println("Enter the elements of row");

            for(j = 0; j < iCol; j++)
            {
                Arr[i][j] = sobj.nextInt();
            }
        }

        sobj.close();
    }

    ////////////////////////////////////////////////////////////////////
    //
    //  Function Name : Display()
    //  Description   : Display the Matrix
    //  Input :         Nothing
    //  Output :        Display Matrix
    //  Author :        Ashwini Vishnu Kauthale
    //  Date :          23/02/2025
    //
    ////////////////////////////////////////////////////////////////////

    public void Display()
    {
        int i = 0 , j = 0;

        for(i = 0; i < iRow; i++)
        {
            for(j = 0; j < iCol; j++)
            {
                System.out.print(Arr[i][j] + "\t");
            }

            System.out.println();
        }
    }


    ////////////////////////////////////////////////////////////////////
    //
    //  Function Name : ChkIdentity()
    //  Description   : It check it is identity matrix or not
    //  Input :         Nothing
    //  Output :        Boolean
    //  Author :        Ashwini Vishnu Kauthale
    //  Date :          23/02/2025
    //
    ////////////////////////////////////////////////////////////////////

    public boolean ChkIdentity()
    {
        boolean bFlag = false;
        int i = 0,j = 0;

        bFlag = true;
        for(i = 0; i < iRow; i++)
        {
            for(j = 0; j < iCol; j++)
            {
                if(i == j && Arr[i][j] != 1)
                {
                    bFlag = false;
                    break;
                }
            }
        }

        return bFlag;
    }
}

//////////////////////////////////////////////////////////////////
//
// Entry Point Function for Java Application
//
//////////////////////////////////////////////////////////////////

class program73_4
{
    public static void main(String A[])
    {
        boolean bRet = false;
        int iValue1 = 0, iValue2 = 0;
        Scanner ssobj = new Scanner(System.in);

        System.out.println("Enter number of rows : ");
        iValue1 = ssobj.nextInt();

        System.out.println("Enter number of Columns : ");
        iValue2 = ssobj.nextInt();

        Matrix mobj = new Matrix(iValue1,iValue2);

        mobj.Accept();

        mobj.Display();

        bRet = mobj.ChkIdentity();

        if(bRet == true)
        {
            System.out.println("It is a identity matrix");
        }
        else
        {
            System.out.println("Its not a identity matrix");
        }

        mobj = null;
    }
}