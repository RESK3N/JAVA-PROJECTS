import java.io.FileReader;
import java.util.*;
public class file_rw {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        FileReader fr = new FileReader("f.txt");
        int i;
        while((i=fr.read())!=-1){
            System.out.print((char)i);
        }

    }
}
