import java.util.*;
class Employee{
    int id;
    String name;
    int age;
    int salary;
    public void setDetails(int id,String name,int age,int salary){
        this.id=id;
        this.name=name;
        this.age=age;
        this.salary=salary;

    }
    void display(){
        System.out.println(id+"\t"+name+"\t"+age+"\t"+salary);
    }
}
public class emp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee Name");
        String name = sc.nextLine();
        System.out.println("Enter Employee ID");
        int id = sc.nextInt();
        System.out.println("Enter Employee Age");
        int age = sc.nextInt();
        System.out.println("Enter Employee Salary");
        int salary = sc.nextInt();
        Employee e1= new Employee();
        e1.setDetails(id,name,age,salary);
        e1.display();
    }
}
