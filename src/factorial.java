import java.util.Scanner;
public class factorial {
    static int fact(int n){
        if(n==1){
            return 1;
        }else{
            return n*fact(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number for factorial : ");
        int n = input.nextInt();
        System.out.println("Factorial of "+n+" is : "+fact(n));
    }
}

