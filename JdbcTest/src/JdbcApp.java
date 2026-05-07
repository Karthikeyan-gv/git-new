import java.sql.*;

public class JdbcApp {
    public static void main(String[] args) throws Exception {

        String url = "jdbc:mysql://localhost:3306/logindetails";
        String usser = "root";
        String pass = "karthik";

        try {
            Connection con = DriverManager.getConnection(url, usser, pass);
            PreparedStatement ps = con.prepareStatement("insert into login(user,pass) values(?,?)");
            ps.setString(1,"davidbilla");
            ps.setString(1,"billa123");
            int rows = ps.executeUpdate();
            System.out.println(rows + " rows inserted");
        } catch (Exception e) {
            System.out.println("query executed failed!");
            e.printStackTrace();
        }
    }
}