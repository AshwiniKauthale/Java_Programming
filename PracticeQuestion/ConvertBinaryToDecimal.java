import java.util.*;

class ConvertBinaryToDecimal
{
    public static int BinaryToDecimal(int No)
    {
        int num = 0;
        int i = 0;
        int iDigit = 0;
        // int iCount = 0;
        int temp = No;

        if(No == 0)
        {
            return 0;
        }

        // while(No < 0)
        // {
        //     No = No / 10;
        //     iCount++;
        // }

        No = temp;

        while(No != 0)
        {

            iDigit = No % 10;
            num = num + (iDigit * (int)Math.pow(2,i));
            No = No / 10;
            i++;
        }
        return num;
    }
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iRet = 0;
        int Value = 0;

        System.out.println("Enter Binary Number");
        Value = sobj.nextInt();

        iRet = BinaryToDecimal(Value);

        System.out.println("Decimal Number is : "+iRet);

        sobj = null;
    }
}