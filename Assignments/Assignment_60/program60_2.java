import java.io.*;
import java.util.*;

class program60_2
{
    public static void main(String A[])
    {
        int MaxSize = 0;
        String FileName = null;

        File fobj = null;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the name of Directory : ");
        String DirName = sobj.nextLine();

        fobj = new File(DirName);

        if((fobj.exists()) && (fobj.isDirectory()))
        {
            File[] Arr = fobj.listFiles();

            MaxSize = (int)Arr[0].length(); 

            for(int i = 0; i < Arr.length; i++)
            {
                if(Arr[i].length() >= MaxSize)
                {
                    MaxSize = (int)Arr[i].length();
                    FileName = Arr[i].getName();
                }
            }
            System.out.println("File name : "+ FileName + "   File Size : "+ MaxSize);
            fobj = null;
        }
        else
        {
            System.out.println("Directory is not found");
        }

        sobj.close();
    }
}
