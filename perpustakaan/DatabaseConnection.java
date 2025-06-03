/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perpustakaan;

/**
 *
 * @author HP
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DatabaseConnection {
    public static Connection getConnection(){
        try{
            String url = "jdbc:mysql://localhost:3306/perpustakaan";
            String user = "root";
            String pass = "";
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(url,user,pass);
        }catch (ClassNotFoundException | SQLException e){
            System.out.println("Koneksi gagal: " + e.getMessage());
            return null;
        }
    }
}
