import java.io.*;
import java.util.*;

class program58_1
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        File fobj = null;

        System.out.println("Enter the name of Directory : ");
        String DirName = sobj.nextLine();

        fobj = new File(DirName);

        if((fobj.exists()) && (fobj.isDirectory()))
        {
            
            File[] Arr = fobj.listFiles();

            for(int i = 0; i < Arr.length; i++)
            {
                if(Arr[i].isFile())
                {
                    System.out.println("File name : "+Arr[i].getName());
                }
            }
        }
        else
        {
            System.out.println("There is no such directory.");
        }

        sobj.close();
    }
}