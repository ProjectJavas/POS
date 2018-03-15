/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DLL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Panhavuth
 */
public class DataCon {
    public static Connection datacon;
    public static PreparedStatement ps;
    public static ResultSet rs;
    public static String UserName=null;
    public static String UserID=null;
    public static void connection(String ip,String database,String user,String pass)throws Exception{
        Class.forName("com.mysql.jdbc.Driver").newInstance();
        datacon= DriverManager.getConnection("jdbc:mysql://localhost:3306/pos","root","1");
         
        
//        //=================sql server
//        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
//        datacon= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databasename=pos1;user=sa;password=1");
   
    
   
    }
}



