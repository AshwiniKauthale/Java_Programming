import java.io.*;
import java.util.*;

class program58_2
{
    public static void main(String A[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the name of folder : ");
        String FolderName = sobj.nextLine();

        System.out.println("Enter the name of packed file : ");
        String PackName = sobj.nextLine();

        File fobj = new File(FolderName);

        if((fobj.exists()) && (fobj.isDirectory()))
        {
            File PackObj = new File(PackName);

            PackObj.createNewFile();

            FileOutputStream foobj = new FileOutputStream(PackObj);

            FileInputStream fiobj = null;

            File fArr[] = fobj.listFiles();

            for(int i = 0; i < fArr.length; i++)
            {
                fiobj = new FileInputStream(fArr[i]);

                File[] Arr = fobj.listFiles();

                String str = Arr[i].getName()+ "\n";
                foobj.write(str.getBytes());

                fiobj.close();
            }
            System.out.println("File name copied succesfully");
            foobj.close();
        }
        else
        {
            System.out.println("There is no such folder");
        }

        sobj.close();
    }
}