import javax.swing.*;
import java.sql.*;

public class PatientGUI {
    JFrame frame;
    JTextField tfName, tfAge, tfGender, tfDisease, tfDate;
    JButton btnAdd, btnView;
    JTextArea ta;

    public PatientGUI() {
        frame = new JFrame("Patient Panel");
        frame.setSize(400, 500);
        frame.setLayout(null);

        JLabel l1 = new JLabel("Name"); tfName = new JTextField();
        JLabel l2 = new JLabel("Age"); tfAge = new JTextField();
        JLabel l3 = new JLabel("Gender"); tfGender = new JTextField();
        JLabel l4 = new JLabel("Disease"); tfDisease = new JTextField();
        JLabel l5 = new JLabel("Admit Date"); tfDate = new JTextField();

        btnAdd = new JButton("Add Patient");
        btnView = new JButton("View All");
        ta = new JTextArea();

        l1.setBounds(30,30,100,20); tfName.setBounds(150,30,150,20);
        l2.setBounds(30,60,100,20); tfAge.setBounds(150,60,150,20);
        l3.setBounds(30,90,100,20); tfGender.setBounds(150,90,150,20);
        l4.setBounds(30,120,100,20); tfDisease.setBounds(150,120,150,20);
        l5.setBounds(30,150,100,20); tfDate.setBounds(150,150,150,20);
        btnAdd.setBounds(30,190,120,30); btnView.setBounds(180,190,120,30);
        ta.setBounds(30,240,300,200);

        frame.add(l1); frame.add(tfName);
        frame.add(l2); frame.add(tfAge);
        frame.add(l3); frame.add(tfGender);
        frame.add(l4); frame.add(tfDisease);
        frame.add(l5); frame.add(tfDate);
        frame.add(btnAdd); frame.add(btnView); frame.add(ta);

        btnAdd.addActionListener(e -> addPatient());
        btnView.addActionListener(e -> viewPatients());

        frame.setVisible(true);
        frame.setDefaultCloseOperation(3);
    }

    void addPatient() {
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital","root","0000")) {
            String query = "INSERT INTO patient (name, age, gender, disease, admit_date) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, tfName.getText());
            ps.setInt(2, Integer.parseInt(tfAge.getText()));
            ps.setString(3, tfGender.getText());
            ps.setString(4, tfDisease.getText());
            ps.setString(5, tfDate.getText());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(frame, "Patient Added!");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    void viewPatients() {
        ta.setText("");
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital","root","0000")) {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM patient");
            while (rs.next()) {
                ta.append("ID: " + rs.getInt(1) + ", Name: " + rs.getString(2) +
                        ", Disease: " + rs.getString(5) + "\n");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new PatientGUI();
    }
}
