import java.sql.*;
import java.util.*;
import java.lang.*;

public class database {
    private static final String url="jdbc:mysql://localhost:3306/product";
    private static final String username="root";
    private static final String pass="0000";
    public static void main(String[] args) throws Exception {

        Connection conn = null;
        try {
            Scanner sc= new Scanner(System.in);
             conn= DriverManager.getConnection(url, username, pass);
            Statement all = conn.createStatement();


        int ch=0;
        while (ch!=6){
            System.out.println("Enter your choice :\n1.To display all Products\n2.To insert a new Product\n3.To search for a Product" +
                    "\n4.To delete a Product\n5.To update an existing Product\n6.To exit");
            ch= sc.nextInt();
            switch(ch){
                case 1: String sql="Select * from products";
                    ResultSet rs = all.executeQuery(sql);
                    System.out.println("==================================");
                    System.out.println("||  ID  ||    NAME   ||  PRICE ||");
                    System.out.println("==================================");
                    while(rs.next()){
                        int id= rs.getInt("id");
                        String name=rs.getString("name");
                        float price=rs.getFloat("Price");
                        System.out.println("||\t"+id+"\t||\t"+name+"\t ||\t"+price+" ||");
                        System.out.println("----------------------------------");

                    }rs.close();
                    break;
                case 2:
                    System.out.println("Enter Product Name to insert :");
                    String prname=sc.next();
                    System.out.println("Enter Product Price :");
                    float prprice=sc.nextFloat();
                    PreparedStatement insert = conn.prepareStatement("insert into products (name,price) values(?,?)");
                    insert.setString(1,prname);
                    insert.setFloat(2,prprice);
                    int rows = insert.executeUpdate();
                    System.out.println("Successfully inserted \n"+rows+" row(s) affected.");
                    break;


                case 3:
                    System.out.print("\nEnter Product name to search : ");
                    String s=sc.next();
                    PreparedStatement search = conn.prepareStatement("select * from products where name = ?");
                    search.setString(1,s);
                    ResultSet found =search.executeQuery();
                    while(found.next()){
                        int id = found.getInt("id");
                        String name = found.getString("name");
                        float price = found.getFloat("Price");
                        if(name!=null){
                        System.out.println("==================================");
                        System.out.println("||  ID  ||    NAME   ||  PRICE ||");
                        System.out.println("==================================");

                        System.out.println("||\t"+id+"\t||\t"+name+"\t ||\t"+price+" ||");
                        System.out.println("----------------------------------");
                        }else {System.out.println("No items found");}
                    }
                    found.close();
                    search.close();
                    break;
                case 4:
                    System.out.println("Enter ID to delete product (0 to skip):");
                    int del= sc.nextInt();
                    if(del!=0){
                        PreparedStatement delete = conn.prepareStatement("delete from products where id = ?");
                        delete.setInt(1,del);
                        rows= delete.executeUpdate();
                        if(rows!=0) System.out.println("ID : "+del+" Deleted Successfully\n"+rows+" Row(s) affected. ");
                        else if (rows==0) System.out.println("Not Found ! Deletion failed");
                    }
                break;
                case 5:System.out.println("Enter ID to Update product (0 to skip):");
                int up=sc.nextInt();
                if(up!=0){
                    System.out.println("Enter new Product Name :");
                    prname=sc.next();
                    System.out.println("Enter new Product Price :");
                    prprice=sc.nextFloat();
                    PreparedStatement ups = conn.prepareStatement("update products set name=?,price=? where id=?");
                    ups.setString(1,prname);
                    ups.setFloat(2,prprice);
                    ups.setInt(3,up);
                    int updates = ups.executeUpdate();
                    System.out.println("Successfully inserted \n"+updates+" row(s) affected.");
                }
                break;
            }
        }
        }catch(Exception e){
            e.printStackTrace();
        }
        conn.close();

    }
}
