import java.util.Scanner;
public class marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks in English");
        float s1=sc.nextInt();
        System.out.println("Enter the marks in Mathematics");
        float s2=sc.nextInt();
        System.out.println("Enter the marks in Chemistry");
        float s3=sc.nextInt();
        System.out.println("Enter the marks in Physics");
        float s4=sc.nextInt();
        System.out.println("Enter the marks in Biology");
        float s5=sc.nextInt();
        float sum=s1+s2+s3+s4+s5;
        float percentage=sum/5;
        System.out.println("The sum of the marks is "+sum);
        System.out.println("Percentage aquired ="+percentage+"%");

    }
}
