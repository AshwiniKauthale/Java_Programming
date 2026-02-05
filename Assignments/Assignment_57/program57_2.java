import java.io.*;
import java.util.*;

class program57_2
{
    public static void main(String A[])
    {
        boolean bRet = false;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the name of file :");
        String FileName = sobj.nextLine();

        File fobj = new File(FileName);

        if(fobj.exists())
        {
            if(fobj.isFile())
            {
                System.out.println("It is a regular file");
            }
            else
            {
                System.out.println("It is not a regular file");
            }
        }
        else
        {
            System.out.println("There is no such file");
        }
    }
}