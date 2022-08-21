/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db_train;
import java.sql.*;
/**
 *
 * @author faniy
 */
public class DBTrain {
    private Connection conn = null;
    
    public Connection setconn()
    {
        try{
            String url = "jdbc:mysql://localhost:3306/train ticket";
            String user = "root";
            String pass = "";
            String db ="train ticket";
            
                Class.forName("com.mysql.cj.jdbc.Driver");
                conn = DriverManager.getConnection(url,user,pass);
            
        } catch(Exception e) {
            System.out.println("Error "+e.getMessage());
        }
        return conn;   
    }
}
