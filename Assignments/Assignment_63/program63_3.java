import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

class program63_3
{
    public static void main(String A[])
    {
        int iRet = 0;
        File fobj1 = null;
        File fobj2 = null;
        byte Buffer[] = new byte[1024];
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the name of Source Directory : ");
        String SourceDir = sobj.nextLine();

        System.out.println("Enter the name of Destination Directory : ");
        String DestDir = sobj.nextLine();

        fobj1 = new File(SourceDir);
        fobj2 = new File(DestDir);

        Path dirPath = Paths.get(DestDir);

        if((fobj1.exists()) && (fobj1.isDirectory()) && (fobj2.exists()) && (fobj2.isDirectory()))
        {
            try
            {
                File[] Arr = fobj1.listFiles();
                

                for(int i = 0; i < Arr.length; i++)
                {
                    String fileName = (Arr[i].getName());
                    Path filePath = dirPath.resolve(fileName);
                    
                    Files.createFile(filePath);
                    File[] Brr = fobj2.listFiles();

                    FileInputStream fiobj = new FileInputStream(Arr[i]);
                    FileOutputStream foobj = new FileOutputStream(Brr[i]);

                    BufferedInputStream biobj = new BufferedInputStream(fiobj);
                    BufferedOutputStream boobj = new BufferedOutputStream(foobj);

                    
                    while((iRet = biobj.read(Buffer,0,Buffer.length)) != -1)
                    {
                        boobj.write(Buffer,0,iRet);
                    }
                    boobj.flush();
                    boobj.close();
                    biobj.close();
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
            System.out.println("Directory is not found");
        }

        sobj.close();
    }
}
