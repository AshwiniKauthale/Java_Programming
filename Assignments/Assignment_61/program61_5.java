import java.io.*;
import java.util.*;

class program61_5
{
    public static void main(String A[])throws Exception
    {
        int iRet = 0;
        Scanner sobj = new Scanner(System.in);

        byte Buffer[] = new byte[1024];

        System.out.println("Enter the name of first file :");
        String Fname1 = sobj.nextLine();

        System.out.println("Enter the name if First Output file :");
        String Output1 = sobj.nextLine();

        System.out.println("Enter the name of Second Output File :");
        String Output2 = sobj.nextLine();

        File fobj = new File(Fname1);

        if(fobj.exists())
        {
            File fout1 = new File(Output1);
            File fout2 = new File(Output2);

            fout1.createNewFile();
            fout2.createNewFile();

            FileInputStream fiobj = new FileInputStream(fobj);

            FileOutputStream foobj1 = new FileOutputStream(fout1,true);
            FileOutputStream foobj2 = new FileOutputStream(fout2,true);

            while((iRet = fiobj.read(Buffer)) != -1)
            {
                foobj1.write(Buffer,0,iRet/2);
                foobj2.write(Buffer,iRet/2,iRet);
            }

            foobj1.close();
            foobj1.close();
            fiobj.close();
            fobj = null;
            fout1 = null;
            fout2 = null;
        }
        else
        {
            System.out.println("There is no such files");
        }
    }
}