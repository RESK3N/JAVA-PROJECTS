import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class abc extends JFrame implements ActionListener {
    TextField text1;
    TextField text2 ;
    JLabel l1;
    JLabel l2;
    JLabel jl ;
    JButton jb;


    abc(){
        setLayout(new FlowLayout());//cardLayout, flowlayout , gridlayout, nulllayout
        setVisible(true);
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        text1 = new TextField(10);
        text2 = new TextField(10);
        l1= new JLabel("Enter First Number");
        l2= new JLabel("Enter Second Number");

        jl= new JLabel("Sum is : ");
        jb = new JButton("Add");
        add(l1);
        add(text1);
        add(l2);
        add(text2);
        add(jb);
        add(jl);
        jb.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int n1=Integer.parseInt(text1.getText());
        int n2=Integer.parseInt(text2.getText());
        int sum = n1+n2;
        System.out.println(sum);
        jl.setText(sum+"");

    }
}

public class frame1 {
    public static void main(String[] args) {
        abc a= new abc();

    }
}
