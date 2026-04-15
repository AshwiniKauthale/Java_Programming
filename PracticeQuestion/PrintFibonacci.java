import java.util.*;

class PrintFibonacci
{
    public static void Fibonacci(int No)
    {
        int first = 0;
        int Second = 1;
        int temp = 0;
        int i = 0;

        for(i = 0; i < No; i++)
        {
            System.out.print(first + " ");
            temp = Second;
            Second = first + Second;
            first = temp;
        }
    }

    public static void main(String A[])
    {
        int Value = 0;
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter the Nth number : ");
        Value = sobj.nextInt();

        Fibonacci(Value);

        sobj = null;
    }
}