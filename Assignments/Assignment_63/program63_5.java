import java.io.*;
import java.util.*;

class program63_5
{
    public static void main(String A[])
    {
        int iRet = 0;
        File fobj1 = null;
        File fobj2 = null;
        byte Buffer[] = new byte[1024];
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the name of Combined.bin file : ");
        String SourceFile = sobj.nextLine();

        System.out.println("Enter the name of Output file : ");
        String newFile = sobj.nextLine();

        fobj1 = new File(SourceFile);

        if((fobj1.exists()) && (fobj1.isFile()))
        {
            try
            {
                fobj2 = new File(newFile);
                fobj2.createNewFile();
            
                FileInputStream fiobj = new FileInputStream(fobj1);
                FileOutputStream foobj = new FileOutputStream(fobj2);

                BufferedInputStream biobj = new BufferedInputStream(fiobj);
                BufferedOutputStream boobj = new BufferedOutputStream(foobj);

                
                while((iRet = biobj.read(Buffer,0,Buffer.length)) != -1)
                {
                    boobj.write(Buffer,0,iRet);
                    break;
                }
                boobj.flush();
                boobj.close();
                biobj.close();
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
            System.out.println("File is not found");
        }

        sobj.close();
    }
}
