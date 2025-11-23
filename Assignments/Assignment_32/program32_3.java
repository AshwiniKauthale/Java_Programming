import java.util.*;

class Pattern
{
    public void Display(int iRow,int iCol)
    {
        int i = 0, j = 0;
        if(iRow != iCol)
        {
            System.out.println("Invalid input");
            System.out.println("Row number and column numder should be same");

            return;
        }
        for(i = 1; i <= iRow; i++)
        {
            for(j = 1; j <= iCol; j++)
            {
                if(j == iCol - i + 1 || i == 1 || j == 1 || i == iRow || j == iCol )
                {
                    System.out.print("*\t");
                }
                else
                {
                    System.out.print(" \t");
                }
                
            }
            System.out.println();
        }
        System.out.println();
    }
}

class program32_3
{
    public static void main(String A[])
    {
        int iValue1  = 0, iValue2 = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number of rows :");
        iValue1 = sobj.nextInt();
        System.out.println("Enter the number of columns :");
        iValue2 = sobj.nextInt();

        Pattern pobj = new Pattern();
        pobj.Display(iValue1,iValue2);
    }
}