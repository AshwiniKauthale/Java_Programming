import java.io.*;
import java.util.*;

class program62_4
{
    public static void main(String A[])throws Exception
    {
        int bHeader = 0;
        byte Buffer[] = new byte[1024];
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the name of file :");
        String Fname1 = sobj.nextLine();

        System.out.println("Enter the name of Backup file");
        String OutputFile = sobj.nextLine();

        File fobj = new File(Fname1);

        if(fobj.exists())
        {
            File fobj1 = new File(OutputFile);

            fobj1.createNewFile();

            FileInputStream fiobj = new FileInputStream(fobj);
            FileOutputStream foobj = new FileOutputStream(fobj1);

            while((bHeader = fiobj.read(Buffer)) != -1)
            {
                foobj.write(Buffer);
            }

        }
        else
        {
            System.out.println("There is no such files");
        }
    }
}