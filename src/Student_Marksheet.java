// Java program for Student marksheet generation
import java.util.Scanner;

class student
{
    int roll;
    float sub1, sub2, sub3, total,avg;

    student()
    {   roll=0; sub1=0; sub2=0; sub3=0; total = 0; avg=0;
        Scanner sc = new Scanner (System.in);
        System.out.println ("\n Enter roll: ");
        roll=sc.nextInt();
        System.out.println ("\n Enter student name: ");
        //String s= stringScanner.next();
        sc.nextLine();
        String s=  sc.nextLine();
        System.out.println ("\n Enter sub1 marks : ");
        sub1=sc.nextFloat();
        System.out.println ("\n Enter sub2 marks: ");
        sub2=sc.nextFloat();
        System.out.println ("\n Enter sub3 marks: ");
        sub3=sc.nextFloat();


        System.out.println ("\nName: "+s);
        System.out.println ("Roll : " + roll);
        System.out.println ("Sub1 marks : " + sub1);
        System.out.println ("Sub2 marks : " + sub2);
        System.out.println ("Sub3 marks : " + sub3);
        total = sub1+sub2+sub3;
        avg = (sub1+sub2+sub3)/3;
        System.out.println ("Total :" + total);
        System.out.println ("Average :" + avg);
    }

    /*student(int r, int s1, int s2, int s3)
    { roll =r; sub1 = s1; sub2 = s2; sub3 = s3;  }*/
}
class Student_Marksheet{
    public static void main(String[] args) {
        student [] s = new student[2];
        s[0] = new student();
    }
}
