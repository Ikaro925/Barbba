package Model;

import org.apache.commons.dbcp2.BasicDataSource;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBCconexion {
    private static final String USERNAME = "root";
    private static final String PASSWORD = "1234";
    private static final String URL = "jdbc:MySql://localhost:3306/barberia?ServerTimeZone=AmericaBogota";
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";

    private Connection con;


        public DBCconexion (){

            try {

            Class.forName(DRIVER);
            con = DriverManager.getConnection(URL, USERNAME, PASSWORD);


            }catch (Exception e){

            System.err.println("Error" + e);


            }


    }

        public Connection getDBCconexion() {
            return con;

            }

        //Prueba de conexion
        public static void main (String[] args){
            DBCconexion con = new DBCconexion();


        }




}
