import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DemoJdbc {
    public static void main(String[] args) throws Exception {


//        Class.forName("org.postgresql.Drive");

        String url = "jdbc:postgresql://localhost:5432/Demo";
        String uname = "postgres";
        String pass = "######";

        Connection con = DriverManager.getConnection(url, uname, pass);

        System.out.println("Connected to database successfully");
        String sql = "select sname from student where sid = 1";
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        rs.next();
        String name = rs.getString("sname");
        System.out.println("Student name is: " + name);
        con.close();
        System.out.println("Connection closed");
    }
}
