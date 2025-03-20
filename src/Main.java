// String, StringBuffer, StringBuilder, Scanner, BufferedReader
import java.io.*;
import java.lang.*;
import java.util.Scanner;
class Main
{
    // Various operations over string
    public static void main(String []args) throws IOException
    {
        String str1 = new String ("Java");
        String str2;int len,loop, temp;
        BufferedReader obj1 = new BufferedReader (new InputStreamReader (System.in));
        System.out.println ("Enter Second String using BufferedReader: ");
        str2 = obj1.readLine();

        System.out.println("First String (Assigned Value) : "+ str1);
        System.out.println("Second String : "+ str2);
        len = str1.length();
        System.out.println("First String Length: "+ len);
        len = str2.length();
        System.out.println("Second String Length: "+ len);
        len = str1.length();
        for(loop=0;loop<len;loop++)
        {
            temp=loop+1;
            System.out.println ("First String Character at :"+temp+" position is :"+ str1.charAt(loop));
        }
        len = str2.length();
        System.out.println();
        for(loop=0;loop<len;loop++)
        {
            temp=loop+1;
            System.out.println ("Second String Character at :"+temp+" position is :"+ str2.charAt(loop));
        }

        StringBuilder str3 = new StringBuilder("Adamas");

        System.out.println ("Third StringBuilder (Before Append) Value Assigned : "+ str3);

        len = str3.length();
        System.out.println();
        for(loop=0;loop<len;loop++)
        {
            temp=loop+1;
            System.out.println ("Third String Character at :"+temp+" position is :"+ str3.charAt(loop));
        }


        str3.append ("University");
        System.out.println ("Third StringBuilder (After Append) Value Assigned: "+ str3);

        len = str3.length();
        System.out.println();
        for(loop=0;loop<len;loop++)
        {
            temp=loop+1;
            System.out.println ("Third String Character at :"+temp+" position is :"+ str3.charAt(loop));
        }

        StringBuffer str4 = new StringBuffer();
        Scanner obj2 = new Scanner(System.in);
        System.out.println ("Enter Fourth StringBuffer :");
        str4.append(obj2.nextLine());
        System.out.println ("Fourth StringBuffer (Before Append): "+str4);

        len = str4.length();
        System.out.println();
        for(loop=0;loop<len;loop++)
        {
            temp=loop+1;
            System.out.println ("Fourth String Character at :"+temp+" position is :"+ str4.charAt(loop));
        }

        str4.append(" Roy");
        System.out.println ("Fourth StringBuffer (After Append): "+str4);
        len = str4.length();
        System.out.println();
        for(loop=0;loop<len;loop++)
        {
            temp=loop+1;
            System.out.println ("Fourth String Character at :"+temp+" position is :"+ str4.charAt(loop));
        }
    }
}