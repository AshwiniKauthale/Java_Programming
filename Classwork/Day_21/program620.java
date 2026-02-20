import java.util.*;
class program620

{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Number");
        int No = sobj.nextInt();

        int iDigit = 0;
        int iCount = 0;

        while(No != 0)
        {
            iDigit = No % 2;
            if(iDigit == 1)
            {
                iCount++;
            }
            System.out.print(iDigit);
            No = No / 2;
        }
        
        System.out.println("\nNumber of 1's are : "+iCount);
    }
}