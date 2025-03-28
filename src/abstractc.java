abstract class shape {
    int dim1, dim2;
    shape(int a, int b) {
        dim1 = a;
        dim2 = b;

    }
    abstract void printArea();
}
class Rectangle extends shape {
    public Rectangle(int a, int b) {
        super(a, b);
    }
    void printArea() {
        System.out.println("Area of rectangle : " + (dim1* dim2));
    }
}
class Triangle extends shape {
    Triangle ( int a , int b ) {
        super (a , b ) ;
    }
    void printArea() {
        System.out.println("Area of Triangle : " + (0.5*dim1* dim2));
    }
 }
 // Circle class
class Circle extends shape {
    Circle ( int radius ) {
        super ( radius , 0) ;
         }
     void printArea () {
         System . out . println ( " Area of Circle : " + ( Math . PI * dim1 * dim1 )) ;
        }
}
// Main class

public class abstractc {
    public static void main(String[] args) {
        shape rectangle = new Rectangle(10, 5);
        rectangle.printArea();
        shape triangle = new Triangle(10, 5);
        triangle.printArea();
        shape circle = new Circle(7);
        circle.printArea();
    }
}
