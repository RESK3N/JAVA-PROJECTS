import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.lang.*;
public class filehand {

    public static void main(String[] args)  {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter roll number:");
        int roll= sc.nextInt();
        System.out.println("Enter subject code:");
        String sub=sc.next();
        System.out.println("Enter marks:");
        float marks= sc.nextFloat();

        try {
            FileWriter fw = new FileWriter("f.txt");
            fw.write("Roll: "+roll+"\nSubject Code: "+sub+"\nMarks: "+marks);
            fw.close();
            System.out.println("File acess succesful");
        }
        catch (IOException e){
            System.out.println("Error in file writing");
            e.printStackTrace();
        }


    }
}
