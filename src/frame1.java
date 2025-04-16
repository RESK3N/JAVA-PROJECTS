import javax.swing.*;
import java.awt.*;

class abc extends JFrame{
    abc(){
        setLayout(new FlowLayout());//cardLayout, flowlayout , gridlayout, nulllayout
        setVisible(true);
        setSize(400,400);
        JLabel l1 = new JLabel("Hello World !! ");
        add(l1);
    }
}

public class frame1 {
    public static void main(String[] args) {
        abc a= new abc();

    }
}
