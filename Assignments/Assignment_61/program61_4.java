import java.io.*;
import java.util.*;

class program61_4
{
    public static void main(String A[])throws Exception
    {
        int iRet = 0;
        Scanner sobj = new Scanner(System.in);

        byte Buffer[] = new byte[1024];

        System.out.println("Enter the name of first file :");
        String Fname1 = sobj.nextLine();

        System.out.println("Enter the name of second file :");
        String Fname2 = sobj.nextLine();

        System.out.println("Enter the name of Output File :");
        String Output = sobj.nextLine();

        File fobj1 = new File(Fname1);
        File fobj2 = new File(Fname2);

        if(fobj1.exists() && fobj2.exists())
        {
            File fout = new File(Output);

            fout.createNewFile();

            FileInputStream fiobj1 = new FileInputStream(fobj1);
            FileInputStream fiobj2 = new FileInputStream(fobj2);

            FileOutputStream foobj = new FileOutputStream(fout,true);

            while((iRet = fiobj1.read(Buffer)) != -1)
            {
                foobj.write(Buffer,0,iRet);
            }


            while((iRet = fiobj2.read(Buffer)) != -1)
            {
                foobj.write(Buffer,0,iRet);
            }

            foobj.close();
            fiobj1.close();
            fiobj2.close();
            fobj1 = null;
            fobj2 = null;
            fout = null;
        }
        else
        {
            System.out.println("There is no such files");
        }
    }
}