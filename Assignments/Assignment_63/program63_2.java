import java.io.*;
import java.util.*;
import java.util.concurrent.TimeUnit;

class program63_2
{
    public static void main(String A[])
    {
        int iRet = 0;
        byte Buffer[] = new byte[1024];
        Scanner sobj = new Scanner(System.in);
        String Sourcefile = null;
        String Destfile = null;

        System.out.println("Enter the name of Source File :");
        Sourcefile = sobj.nextLine();

        System.out.println("Enter the name of Destination File :");
        Destfile = sobj.nextLine();

        File fobj1 = new File(Sourcefile);

        if(fobj1.exists())
        {
            File fobj2 = new File(Destfile);
            long startTime = System.nanoTime();
            try
            {
                FileInputStream fiobj = new FileInputStream(fobj1);
                FileOutputStream foobj = new FileOutputStream(fobj2);

                BufferedInputStream biobj = new BufferedInputStream(fiobj);
                BufferedOutputStream boobj = new BufferedOutputStream(foobj);

                while((iRet = biobj.read(Buffer,0,Buffer.length)) != -1)
                {
                    boobj.write(Buffer,0,iRet);
                }

                boobj.flush();
            }
            catch(FileNotFoundException aobj)
            {
                System.out.println(aobj);
            }
            catch(IOException eobj)
            {
                System.out.println(eobj);
            }
            long endTime = System.nanoTime();

            long durationInNano = endTime - startTime;

            long Millis = TimeUnit.NANOSECONDS.toMillis(durationInNano);
            double Seconds = (double) durationInNano / 1_000_000_000.0;

            System.out.println("Time taken to copy the file:");
            System.out.println("Milliseconds: " + Millis + " ms");
            System.out.println("Seconds: " + Seconds + " s");
            
        }
        else
        {
            System.out.println("There is no source file.\n");
        }
    }
}