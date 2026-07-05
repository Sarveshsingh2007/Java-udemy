import java.sql.*;

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

        int sid = 6;
        String sname = "chanchal";
        int marks = 54;
//
//        String sql = "insert into student values
//                      ("+ sid + ", '" + sname +"', "+ marks +")";  // very difficult to write
        // this can damage out database- sql injection
        // string concatenation - As queries become longer, they become harder to manage.

        String sql = "insert into student values(?, ?, ?)";


//        Statement st = con.createStatement();
//        ResultSet rs = st.executeQuery(sql);

        // PREPARED STATEMENT
        PreparedStatement st = con.prepareStatement(sql);
        st.setInt(1, sid);
        st.setString(2,sname);
        st.setInt(3, marks);
        st.execute();

//        st.execute(sql);
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
