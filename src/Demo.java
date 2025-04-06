//class A{
//    void show(){
//        System.out.println("in A");
//    }
//}
//class B extends A{
//    @Override
//    void show(){
//        System.out.println("in B");
//    }
//}
//public class Demo {
//}

import java.io.*;
public class Demo{
    public static void main(String[] args)throws IOException {
        BufferedReader bf=null;
        try {
            InputStreamReader in = new InputStreamReader(System.in);
            bf = new BufferedReader(in);
            int num = Integer.parseInt(bf.readLine());
            System.out.println(num);
        }
        finally {
            bf.close();
            System.out.println("Resource closed");
        }

    }
}