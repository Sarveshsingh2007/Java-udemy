import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DemoJdbc {
    public static void main(String[] args) throws Exception {


//        Class.forName("org.postgresql.Drive");

        String url = "jdbc:postgresql://localhost:5432/Demo";
        String uname = "postgres";
        String pass = "#####";
        Connection con = DriverManager.getConnection(url, uname, pass);
        System.out.println("Connected to database successfully");


//        String sql = "select * from student"; // fecthing all values
//        String sql = "insert into student values (5, 'himanshu', 45)";      // inserting value
//        String sql = "update student set sname='shiva' where sid  = 5";       // updating value
//        String sql = "delete from student where sid = 5";    // deleting row
        int sid = 5;
        String sname = "shiva";
        int marks = 45;

        String sql = "insert into student values("+ sid + ", '" + sname +"', "+ marks +")";  // very difficult to write


        Statement st = con.createStatement();
//        ResultSet rs = st.executeQuery(sql);

        st.execute(sql);
//        System.out.println("Updated successfully");
//        System.out.println("Deleted row 5 successfully");


//        rs.next();
//        String name = rs.getString("sname");
//        System.out.println("Student name is: " + name);

//        while(rs.next()){
//            System.out.print(rs.getInt( 1) + " - ");
//            System.out.print(rs.getString(2) + " - ");
//            System.out.println(rs.getString(3));
//        }

        con.close();
        System.out.println("Connection closed");
    }
}
