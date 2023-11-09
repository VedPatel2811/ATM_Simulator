/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banking.managment.system;

import java.sql.*;
/**
 *
 * @author Ved Patel
 */
public class Conn {
    
    Connection c;
    Statement s;
    public Conn(){
        
      
        try {
            //Class.forName(com.mysql.cj.jdbc.Driver);
            c = DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem","root","Maha1147");
            s = c.createStatement();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
