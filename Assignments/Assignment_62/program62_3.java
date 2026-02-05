import java.io.*;
import java.util.*;

class program62_3
{
    public static void main(String A[])throws Exception
    {
        Scanner sobj = new Scanner(System.in);
        String sourceFile, destFile;
        int nBytes;

        System.out.println("Enter the name of the source file:");
        sourceFile = sobj.nextLine();

        System.out.println("Enter the number of bytes that you want to copy:");
        nBytes = sobj.nextInt();
        sobj.nextLine();

        System.out.println("Enter the name of the destination file:");
        destFile = sobj.nextLine();
        
            RandomAccessFile raf = new RandomAccessFile(sourceFile, "r");
            FileOutputStream fos = new FileOutputStream(destFile);
        
            long fileLength = raf.length();
            
            if (fileLength == 0) {
                System.out.println("Source file is empty.");
                return;
            }

            long startPosition = Math.max(0, fileLength - nBytes);
            int bytesToActuallyRead = (int) Math.min(nBytes, fileLength);
            
            raf.seek(startPosition);

            byte[] buffer = new byte[bytesToActuallyRead];
            int bytesRead = raf.read(buffer, 0, bytesToActuallyRead);
            
            if (bytesRead > 0) {
                fos.write(buffer, 0, bytesRead);
                System.out.println("Successfully copied " + bytesRead + " bytes to " + destFile);
            }
            else
            {
                System.out.println("No bytes were read.");
            }
    }
}