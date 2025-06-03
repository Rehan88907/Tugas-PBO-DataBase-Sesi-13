/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perpustakaan;

/**
 *
 * @author HP
 */
import java.sql.*;
public class TampilkanBuku {
    public static void main(String[] args){
        Connection conn = DatabaseConnection.getConnection();
        if (conn != null){
            try{
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM buku");
                while(rs.next()){
                    System.out.println("ID: " + rs.getInt("id"));
                    System.out.println("Judul: " + rs.getString("judul"));
                    System.out.println("Pengarang: " + rs.getString("pengarang"));
                    System.out.println("Tahun: " + rs.getInt("tahun"));
                    System.out.println("Penerbit: " + rs.getString("penerbit"));
                    System.out.println("------");
                }
                conn.close();
            }catch (SQLException e){
                System.out.println("Gagal menampilkan data: " + e.getMessage());
            }
        }
    }
}
