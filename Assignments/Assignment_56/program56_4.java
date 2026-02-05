import java.io.*;
import java.util.*;

class program56_4
{
    public static void main(String A[])throws Exception
    {
        File fobj = null;

        boolean bRet = false;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the name of file : ");
        String FileName = sobj.nextLine();

        fobj = new File(FileName);

        if(fobj.exists())
        {
            System.out.println("File is already present");
        }
        else
        {
            bRet = fobj.createNewFile();

            if(bRet == true)
            {
                System.out.println("File gets succesfylly created");
            }
            else
            {
                System.out.println("Unable to create file");
            }
        }
    }
}