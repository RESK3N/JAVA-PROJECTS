// Java Generic Programming using class
class subject<s>
{
    s obj;
    subject(s obj) { this.obj = obj; } // constructor
    public s getObject() { return this.obj; }
}

class MCA {
    public static void main(String[] args)
    {
        // int
        subject<Integer> code1 = new subject<Integer>(1);
        System.out.println(code1.getObject());

        // string
        subject<String> code2 = new subject<String>("oop-sem-2");
        System.out.println(code2.getObject());

        // double
        subject<Double> code3 = new subject<Double>(2.2);
        System.out.println(code3.getObject());
    }
}

// Generic Programming using Generic Method

////class Student {
////    static <P> void show(P mca) {
////        System.out.println(mca.getClass().getName()
////                + " = " + mca);
////    }
////
////    // Driver method
////    public static void main(String[] args) {
////        show(1); // student roll
////        show("MCA SEM II SAJID MONDAL"); // student name
////        show(24.1); // student age
////    }
////}
//
//import java.util.Arrays;
//
//class MyStudents
//{
//    public static <P1,P2> void show(P1[] mca, P2 cse)
//    {
//        System.out.println(Arrays.toString(mca));
//        System.out.println(cse);
//    }
//
//    public static void main(String[] args)
//    {
//        String [] mcastudents = {"Arnab","Hrishik","Amrita","Sayantika"};
//        String csestudents = "Sem IV Section C";
//        show(mcastudents, csestudents);
//    }
//}