/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfinal.project.hotel.management;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Dinith
 */
public class DBConnect {
     String path="jdbc:mysql://localhost/hotelDB";
    private Connection con;
    public Connection connect() {
        try{
            con=DriverManager.getConnection(path, "root", "");
            }
        catch(SQLException e){
            e.getMessage();
            }
    return con;
    }
}
