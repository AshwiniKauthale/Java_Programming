import java.io.*;
import java.util.*;
import javax.imageio.stream.FileImageInputStream;

class program573
{
    public static void main(String A[]) throws Exception
    {
        int iRet = 0;
        Boolean bRet = false;
        String FileName = null;
        File fobj = null;
        byte Arr[] = new byte[100];


        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the name of file");
        FileName = sobj.nextLine();

        fobj = new File(FileName);

        if(fobj.exists())
        {
            FileImageInputStream fiobj = new FileImageInputStream(fobj);

            
            iRet = fiobj.read(Arr);

            String str = new String(Arr);

            System.out.println("iRet = "+iRet);

            System.out.println(str);
        }
        else
        {
            System.out.println("There is no such file");
        }

        sobj.close();
    }
}