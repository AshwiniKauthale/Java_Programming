import java.io.*;
import java.util.*;

class program60_5
{
    public static void main(String A[])
    {
        File fobj = null;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the path");
        String path = sobj.nextLine();

        fobj = new File(path);

        if(fobj.exists())
        {
            if (fobj.isFile())
            {
                System.out.println("The path leads to a file.");
            }
            else if (fobj.isDirectory())
            {
                System.out.println("The path leads to a directory.");
            }
        }
        else
        {
            System.out.println("There is no such Path");
        }

        sobj.close();
    }
}