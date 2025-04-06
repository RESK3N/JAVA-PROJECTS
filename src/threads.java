class A extends Thread{

    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("XXX");
            try{
                Thread.sleep(1);
            }catch (InterruptedException e){
                System.out.println("Exception"+e);
            }
        }
    }
}
class B extends Thread{


    public void run()
    {
        for (int i = 0; i < 100; i++) {
            System.out.println("abc");
            try{
                Thread.sleep(1);
            }catch (InterruptedException e){
                System.out.println("Exception"+e);
            }
        }
    }
}
public class threads {
    public static void main(String[] args) {
        A obj1=new A();
        B obj2= new B();
        obj1.start();
        obj2.start();
    }

}
