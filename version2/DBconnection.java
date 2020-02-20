package version2;


/**
 * Mysql connection
 * connecting to Galamseys databbase
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
<<<<<<< HEAD

            String sql0= "Insert into Observatory (observatoryName, country, yearofObservation , area)" + "values (?,?,?,?)";
            PreparedStatement p0 = conn.prepareStatement(sql0);
            p0.setString(1,"observatory1");
            p0.setString(2,"Rwanda");
            p0.setInt(3, 2010);
            p0.setDouble(4,4.6);



            String sql= "Insert into Galamsey (GalamseyId, GalamseyName, vegetationColor, Year_of_event,latitude,longitude, observatoryId)" + "values (?,?,?,?,?,?,?)";
            PreparedStatement p = conn.prepareStatement(sql);
            p.setInt(1,129);
=======
            String sql= "Insert into Galamsey (GalamseyId, GalamseyName, vegetationColor, Year_of_event,latitude,longitude, observatoryId)" + "values (?,?,?,?,?,?,?)";
            PreparedStatement p = conn.prepareStatement(sql);
            p.setInt(1,127);
>>>>>>> 1e864c3fc04527a8fba12f19c11e5ff6c0ce2c3b
            p.setString(2,"Galamsey2");
            p.setString(3,"brown");
            p.setInt(4, 2012);
            p.setString(5,"45E");
            p.setString(6,"65N");
            p.setInt(7,1);



            System.out.println("Data has been added!!");
            p0.execute();
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

