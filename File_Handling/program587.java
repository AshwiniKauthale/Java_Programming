
class program587
{
    public static void main(String A[]) throws Exception
    {
        String str = "Hello";

        byte Arr[] =str.getBytes();

        byte Key = 0x11;

System.out.println("Original Data : "+str);
        for(int i = 0; i < Arr.length; i++)
        {
            Arr[i] = (byte)(Arr[i] ^ Key);
        }
        String Output = new String(Arr);

        System.out.println("Encrypted data :"+Output);
    }
}