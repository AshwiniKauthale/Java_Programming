import java.io.*;
import java.util.*;
import javax.imageio.stream.FileImageInputStream;

class program571
{
    public static void main(String A[]) throws Exception
    {
        Boolean bRet = false;
        String FileName = null;
        File fobj = null;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the name of file");
        FileName = sobj.nextLine();

        fobj = new File(FileName);

        if(fobj.exists())
        {
            FileImageInputStream fiobj = new FileImageInputStream(fobj);

            byte Arr[] = new byte[50];
            
            fiobj.read(Arr);

            System.out.println(Arr);
        }
        else
        {
            System.out.println("There is no such file");
        }

        sobj.close();
    }
}