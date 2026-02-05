import java.io.FileInputStream;
import java.util.Scanner;

class program57_4
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter file name : ");
        String fname = sobj.nextLine();

        try
        {
            FileInputStream fiobj = new FileInputStream(fname);

            int data = 0;
            long checksum = 0;

            while((data = fiobj.read()) != -1)
            {
                checksum = checksum + data;
            }

            fiobj.close();

            System.out.println("Checksum of file is : " + checksum);
        }
        catch(Exception e)
        {
            System.out.println("Unable to open file");
        }

        sobj.close();
    }
}
