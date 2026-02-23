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
    //  Function Name : Frequency()
    //  Description   : It is used to display the ferquency of given element
    //  Input :         Integer
    //  Output :        Integer
    //  Author :        Ashwini Vishnu Kauthale
    //  Date :          23/02/2025
    //
    ////////////////////////////////////////////////////////////////////

    public int Frequency(int iNo)
    {
        int iFreq = 0;
        int i = 0,j = 0;

        for(i = 0; i < iRow; i++)
        {
            for(j = 0; j<iCol; j++)
            {
                if(Arr[i][j] == iNo)
                {
                    iFreq++;
                }
            }
        }
        return iFreq;
    }
}

//////////////////////////////////////////////////////////////////
//
// Entry Point Function for Java Application
//
//////////////////////////////////////////////////////////////////

class program72_2
{
    public static void main(String A[])
    {
        int iRet = 0;
        int iValue1 = 0, iValue2 = 0, iNo = 0;
        Scanner ssobj = new Scanner(System.in);

        System.out.println("Enter number of rows : ");
        iValue1 = ssobj.nextInt();

        System.out.println("Enter number of Columns : ");
        iValue2 = ssobj.nextInt();

        System.out.println("Enter element that you want to find : ");
        iNo = ssobj.nextInt();

        Matrix mobj = new Matrix(iValue1,iValue2);

        mobj.Accept();

        mobj.Display();

        iRet = mobj.Frequency(iNo);

        System.out.println("Frequency is : "+ iRet);

        mobj = null;
    }
}