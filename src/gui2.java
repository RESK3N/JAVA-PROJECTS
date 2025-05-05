import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class gui2  {
    public static void main(String[] args) {
        calc c = new calc();
    }

}
class calc extends JFrame implements ActionListener {
    JTextField t1,t2;
    JButton button;
    JLabel l1,l2,l3;
    calc()
    {
        setLayout(new FlowLayout());
        setVisible(true);
        setSize(300,300);

        t1= new JTextField(20);
        t2= new JTextField(20);
        button = new JButton("OK");
        l1= new JLabel("Number 1");
        l2 = new JLabel("Number 2");
        l3 = new JLabel("Result :");
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(button);
        button.addActionListener(this);
        add(l3);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent ae){
        int num1 = Integer.parseInt(t1.getText());
        int num2 = Integer.parseInt(t2.getText());
        int sum = num1 + num2;
        l3.setText(""+sum);
    }

}