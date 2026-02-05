import java.io.*;
import java.util.*;

class program62_2
{
    public static void main(String A[]) throws Exception
    {
        int bHeader = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the name of file :");
        String Fname1 = sobj.nextLine();

        System.out.println("Enter the number of bytes that you want to copy\n");
        int No = sobj.nextInt();
        sobj.nextLine();

        System.out.println("Enter the name of output file :\n");
        String OutputFile = sobj.nextLine();

        File fobj1 = new File(Fname1);

        try
        {
            if(fobj1.exists())
            {
                File fobj2 = new File(OutputFile);

                fobj2.createNewFile();
                
                FileInputStream fiobj = new FileInputStream(fobj1);
                FileOutputStream foobj = new FileOutputStream(fobj2);
                int count = 0;

                while((bHeader = fiobj.read()) != -1 && count < No)
                {
                    foobj.write(bHeader);
                    count++;
                }
                
                foobj.close();
                fiobj.close();
            }
            else
            {
                System.out.println("There is no such files");
            }
        }
        catch(IOException aobj)
        {
            System.out.println(aobj);
        }
        
    }
}
