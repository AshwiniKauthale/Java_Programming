import java.util.*;

class program80_2
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int N= 0;

        System.out.println("Enter Size od Square Matrix");
        N = sobj.nextInt();

        if(N <= 0)
        {
            System.out.println("Invalid Input");
            return;
        }

        int Arr[][] = new int[N][N];
        int i = 0;
        int j = 0;
        int iSum = 0;
        int iSumPrev = 0;

        System.out.println("Enter Elements : ");

        for(i = 0; i < N; i++)
        {
            System.out.println("Enter the elements row : "+(i + 1));
            for(j = 0; j < N; j++)
            {
                Arr[i][j] = sobj.nextInt();
            }
        }

        // Check All row sums are equal
        for(i = 1; i < N; i++)
        {
            iSumPrev = 0;
            iSum = 0;
            for(j = 0; j < N; j++)
            {
                iSumPrev = iSumPrev + Arr[i - 1][j];
                iSum = iSum + Arr[i][j];
            }

            if(iSum != iSumPrev)
            {
                System.out.println("Matrix is NOT a Magic Square");
                return;
            }
        }

        // Check all column sums are equal
        for(j = 0; j < N; j++)
        {
            iSum = 0;
            for(i = 0; i < N; i++)
            {
                iSum = iSum + Arr[i][j];
            }

            if(iSum != iSumPrev)
            {
                System.out.println("Matrix is NOT a Magic Square");
                return;
            }
        }

        int BackwordDiagonal = 0;
        int ForwardDiagonal = 0;
        // Check Both Diagonal sums are equal

        for(i = 0; i < N; i++)
        {
            for(j = 0; j < N; j++)
            {
                if(i == j)
                {
                    BackwordDiagonal = BackwordDiagonal + Arr[i][j];
                }

                if(j == N - 1 -i)
                {
                    ForwardDiagonal = ForwardDiagonal + Arr[i][j];
                }
            }
        }

        if(BackwordDiagonal != ForwardDiagonal || ForwardDiagonal != iSum)
        {
            System.out.println("Matrix is NOT a Magic Square");
            return;
        }

        System.out.println("Matrix is a Magic Square");

        sobj.close();
    }
}

/*
    Design a Java program to determine whether a given square matrix is a Magic Square.

    A Magic Square is defined as:

        All row sums are equal.
        All column sums are equal.
        Both diagonal sums are equal.

    Input Format:

        First line: Integer N (size of square matrix)
        Next N lines: N integers each

    Validations:

        N > 0
        Matrix must be square

    Output Format:

    Matrix is a Magic Square
    OR
    Matrix is NOT a Magic Square
*/