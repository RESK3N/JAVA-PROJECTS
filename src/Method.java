import java.util.Scanner;
public class Method {
   /* int sum(int a, int b) {
        System.out.println("Method 1 ran ");
        return a + b;
    }*/
    int sum(int...arr) {
        System.out.println("Method 2 ran ");
        int sum = 0;
        for (int a:arr){
            sum += a;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = sc.nextInt();
        System.out.println("Enter the second number");
        int b = sc.nextInt();
        System.out.println("Enter the third number");
        int x = sc.nextInt();
        Method obj = new Method();
        int c = obj.sum(a,b);
        System.out.println(c);
        int d = obj.sum(a,b,x);
        System.out.println(d);

    }
}
