/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mysql;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author EDDY MANUEL
 */
public class Conexion {
    public static Connection conection = null;
    public Connection getConexion(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conection = DriverManager.getConnection("jdbc:mysql://localhost:3306/crud_java?useSSL=false","root","Oliveraton123.");
            return conection;
        } catch (ClassNotFoundException | SQLException ex) {
            return null;
            //Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
