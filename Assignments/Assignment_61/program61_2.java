
import java.io.*;
import java.util.*;

class program61_2
{
    public static void main(String A[]) throws Exception
    {
        int iRet = 0;
        byte Buffer[] = new byte[1024];
        File fobjsrc = null;
        File fobjdest = null;
        String FileNameSrc = null;
        String FileNameDest = null;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the name of Source File :");
        FileNameSrc = sobj.nextLine();

        System.out.println("Enter the name of Destintion File");
        FileNameDest = sobj.nextLine();

        fobjsrc = new File(FileNameSrc);

        if (fobjsrc.exists()) {

            fobjdest = new File(FileNameDest);

            fobjdest.createNewFile();

            FileInputStream fiobj = new FileInputStream(fobjsrc);
            FileOutputStream foobj = new FileOutputStream(fobjdest);

            while ((iRet = fiobj.read(Buffer)) != -1) {

                foobj.write(Buffer,0,iRet);
            }

            System.out.println("File copy Succesfull");
            fiobj.close();
            foobj.close();
        } else {
            System.out.println("There is no source file");
        }

        sobj.close();
    }
}
