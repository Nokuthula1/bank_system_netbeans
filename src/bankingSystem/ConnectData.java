/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankingSystem;

import ExceptionHandling.DataStorageException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class ConnectData {
     Connection conn = null;
   
    public static Connection initConnection(){
       
       try{
          Class.forName("org.sqlite.JDBC");
          Connection conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\User\\Documents\\NetBeansProjects\\com.enviro.assessment.grad001.nokuthulakhoza\\bank_system.db");
          return conn;
       }catch(Exception e){
           JOptionPane.showMessageDialog(null, e);
       }
       return null;
    }
}
