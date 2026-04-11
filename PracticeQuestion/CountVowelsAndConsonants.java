import java.util.*;

class CountVowelsAndConsonants
{
    public static void CountVowelsConsonants(String str)
    {
        int i = 0;
        int Vowels = 0;
        int Consonants = 0;
        char ch;

        for(i = 0; i < str.length(); i++)
        {
            ch = str.charAt(i);

            if(ch >= 'a' && ch <= 'z')
            {
                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                {
                    Vowels++;
                }
                else
                {
                    Consonants++;
                }
            }

            if(ch >= 'A' && ch <= 'Z')
            {
                if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
                {
                    Vowels++;
                }
                else
                {
                    Consonants++;
                }
            }
        }

        System.out.println("Vowels Count is : " + Vowels);
        System.out.println("Consonant Count is : "+ Consonants);
        
    }
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter String");
        String str = sobj.nextLine();

        CountVowelsConsonants(str);

        sobj = null;
    }
}