import java.io.*;
import java.util.*;

class program60_3
{
    public static void main(String A[])
    {
        int MinSize = 0;
        String FileName = null;

        File fobj = null;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the name of Directory : ");
        String DirName = sobj.nextLine();

        fobj = new File(DirName);

        if((fobj.exists()) && (fobj.isDirectory()))
        {
            File[] Arr = fobj.listFiles();

            MinSize = (int)Arr[0].length();

            for(int i = 0; i < Arr.length; i++)
            {
                if(Arr[i].length() <= MinSize)
                {
                    MinSize = (int)Arr[i].length();
                    FileName = Arr[i].getName();
                }
            }
            System.out.println("File name : "+ FileName + "   File Size : "+ MinSize);
            fobj = null;
        }
        else
        {
            System.out.println("Directory is not found");
        }

        sobj.close();
    }
}
