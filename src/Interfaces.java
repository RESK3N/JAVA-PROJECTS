interface computer{
    void action();
}
class Desktop implements computer{
    public void action(){
        System.out.println("Desktop is running ");
    }
}
class Laptop implements computer{
    public void action(){
        System.out.println("Laptop is running ");
    }
}
class Monitor {

    Monitor(computer c){
        c.action();
    }
}
public class Interfaces {
    public static void main(String[] args) {
        computer desk = new Desktop();
        computer lap = new Laptop();
        Monitor monitor = new Monitor(desk);

    }
}
