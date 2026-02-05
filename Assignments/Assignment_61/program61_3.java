
import java.io.*;
import java.util.*;

class program61_3
{

    public static void main(String A[]) throws Exception {
        int iRet = 0;
        File fobj = null;
        String FileName = null;
        String str = null;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the name of the File :");
        FileName = sobj.nextLine();

        System.out.println("Enter the Data");
        str = sobj.nextLine();

        fobj = new File(FileName);

        if (fobj.exists())
        {
            FileOutputStream foobj = new FileOutputStream(fobj,true);

            foobj.write(str.getBytes());
            
            System.out.println("File copy Succesfull");
            foobj.close();
        }
        else
        {
            System.out.println("There is no source file");
        }

        sobj.close();
    }
}
