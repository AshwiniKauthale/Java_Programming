import java.io.*;
import java.util.*;

class program56_5
{
    public static void main(String A[])throws Exception
    {
        File fobj = null;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the name of Directory : ");
        String FileName = sobj.nextLine();

        fobj = new File(FileName);

        if((fobj.exists()) &&(fobj.isDirectory()))
        {
            File Arr[] = fobj.listFiles();

            for(int i = 0; i < Arr.length; i++)
            {
                System.out.println(Arr[i].getName());
            }
        }
        else
        {
            System.out.println("No such Directory");
        }
    }
}