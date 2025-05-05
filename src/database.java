import java.sql.*;
public class database {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/product";
        String username="root";
        String pass="0000";
        Statement stmt;
        Connection conn;
        try {
            conn = DriverManager.getConnection(url, username, pass);
            stmt = conn.createStatement();
        }catch(Exception e){
            e.printStackTrace();
        }
        int ch=0;
        while (ch<6){
            System.out.println("Enter your choice :\n1.To display all\n2.To insert a record\n3.To search for a record" +
                    "\n4.To delete a record\5.To update a record\6.To exit");
            switch(ch){
                case 1: String sql="Select * from products";
                

            }
        }


    }
}
