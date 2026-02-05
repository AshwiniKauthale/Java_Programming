import java.io.*;
import java.util.*;

class program59_5
{
    public static void main(String A[])
    {
        File fobj = null;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the name of Directory : ");
        String DirName = sobj.nextLine();

        fobj = new File(DirName);

        if((fobj.exists()) && (fobj.isDirectory()))
        {
            File[] Arr = fobj.listFiles();

            for(int i = 0; i < Arr.length; i++)
            {
                System.out.println("File name : "+Arr[i].getName()+"  "+Arr[i].getAbsolutePath());
            }
            fobj = null;
        }
        else
        {
            System.out.println("Directory is not found");
        }

        sobj.close();
    }
}
