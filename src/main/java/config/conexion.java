package config;

import java.sql.Connection;
import java.sql.DriverManager;

public class conexion{
    Connection con;
    
    public conexion(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/inegi2020","root","Facilitadiego2508");
        }catch (Exception e){
            System.err.println("No se pudo establecer conexion con la Base de datos " + e );
        }
    }
    public Connection getConnection(){
        return con;
    }
}
