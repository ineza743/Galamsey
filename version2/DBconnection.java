package version2;


/**
 * Mysql connection
 * connecting to Galamseys database
 */


/**
 * @modified
 * @version 1.0.1
 */
import java.sql.*;

public class DBconnection {
    //JBC name and the data base url
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/Galamseys";

    //user name and password
    static final String USER = "root";
    static final String PASS = "admin";


    public static void main(String[] args) {
        Connection conn = null;

        try{
            //registering the jbc driver
            Class.forName("com.mysql.jdbc.Driver");

            //openning a connection
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL,USER,PASS);

            /**
             * Demo on how data can be inserted manually into galamsey table
             */
            //executing the querry
            String sql= "Insert into Galamsey (GalamseyId, GalamseyName, vegetationColor, Year_of_event,latitude,longitude)" + "values (?,?,?,?,?,?)";
            PreparedStatement p = conn.prepareStatement(sql);
            p.setInt(1,126);
            p.setString(2,"Galamsey1");
            p.setString(3,"Green");
            p.setInt(4, 2013);
            p.setString(5,"45E");
            p.setString(6,"65N");



            System.out.println("Data has been added!!");
            p.execute();
            conn.close();


            conn.close();
        }catch(SQLException se){
            //catch errors in jdbc
            se.printStackTrace();
        }catch(Exception e){
            //catch errors in Class.forName
            e.printStackTrace();
        }

    }
}
