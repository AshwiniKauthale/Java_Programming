import java.io.*;
import java.util.*;

class program59_4
{
    public static void main(String A[])
    {
        int FCount = 0;
        int DCount = 0;

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
                if(Arr[i].isDirectory())
                {
                    DCount++;
                }
                else
                {
                    FCount++;
                }
            }
            System.out.println("Files are : "+FCount + "\nDirectory are : "+DCount);
            fobj = null;
        }
        else
        {
            System.out.println("Directory is not found");
        }

        sobj.close();
    }
}
