import java.io.*;
import java.util.*;

class program62_5
{
    public static void main(String A[])
    {
        int iRet = 0;
        byte Buffer[] = new byte[1024];
        Scanner sobj = new Scanner(System.in);
        String Sourcefile = null;
        String Destfile = null;

        System.out.println("Enter the name of Source File :\n");
        Sourcefile = sobj.nextLine();

        System.out.println("Enter the name of Destination File :\n");
        Destfile = sobj.nextLine();

        File fobj1 = new File(Sourcefile);

        if(fobj1.exists())
        {
            File fobj2 = new File(Destfile);

            try
            {
                fobj1.createNewFile();

                FileInputStream fiobj = new FileInputStream(fobj1);
                FileOutputStream foobj = new FileOutputStream(fobj2);

                while((iRet = fiobj.read(Buffer)) != -1)
                {
                    foobj.write(Buffer,0,iRet);
                }
            }
            catch(FileNotFoundException aobj)
            {
                System.out.println(aobj);
            }
            catch(IOException eobj)
            {
                System.out.println(eobj);
            }
        }
        else
        {
            System.out.println("There is no source file.\n");
        }
    }
}