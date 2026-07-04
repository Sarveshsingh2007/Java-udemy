import java.sql.Connection;
import java.sql.DriverManager;

public class DemoJdbc {
    public static void main(String[] args) throws Exception {


//        Class.forName("org.postgresql.Drive");

        String url = "jdbc:postgresql://localhost:5432/Demo";
        String uname = "postgres";
        String pass = "sarvesh123";

        Connection con = DriverManager.getConnection(url, uname, pass);

        System.out.println("Connected to database successfully");

    }
}
