import java.io.*;
import java.util.*;

class program60_4
{
    public static void main(String A[])
    {
        File fobj = null;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Directory name");
        String DirName = sobj.nextLine();

        System.out.println("Enter the Extension");
        String Extension = sobj.nextLine();

        fobj = new File(DirName);

        if((fobj.exists()) && (fobj.isDirectory()))
        {
            File[] Arr = fobj.listFiles();
            
        }
        else
        {
            System.out.println("There is no such Directory");
        }

        sobj.close();
    }
}