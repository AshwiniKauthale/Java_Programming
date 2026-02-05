import java.io.*;
import java.util.*;

class program57_3
{
    public static void main(String A[])
    {
        boolean bRet = false;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the name of Directory :");
        String FileName = sobj.nextLine();

        File fobj = new File(FileName);

        if(!fobj.exists())
        {
            if(fobj.mkdir())
            {
                System.out.println("Directory gets created succesfully");
            }
            else
            {
                System.out.println("Unable to cerate directory");
            }
        }
        else
        {
            System.out.println("Directory is aready present");
        }
    }
}