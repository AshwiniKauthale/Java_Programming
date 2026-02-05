import java.io.*;
import java.util.*;

class program56_3
{
    public static void main(String A[]) throws Exception
    {
        int iRet = 0;
        String FileName = null;
        File fobj = null;
        byte Buffer[] = new byte[100];


        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the name of file");
        FileName = sobj.nextLine();

        System.out.println("Enter the data that you want to write :");
        String Data = sobj.nextLine();

        fobj = new File(FileName);

        if(fobj.exists())
        {
            
            FileOutputStream foobj = new FileOutputStream(fobj,true);

            foobj.write(Data.getBytes());

        }
        else
        {
            System.out.println("There is no such file");
        }

        sobj.close();
    }
}