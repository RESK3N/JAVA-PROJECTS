class A implements Runnable{

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
class B implements Runnable{

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
        Runnable obj1=new A();
        Runnable obj2= new B();
        Thread t1=new Thread(obj1);
        Thread t2=new Thread(obj2);

        t1.start();
        t2.start();
    }

}
