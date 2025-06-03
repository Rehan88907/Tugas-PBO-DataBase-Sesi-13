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
import java.sql.PreparedStatement;
import java.util.Scanner;
import java.sql.*;

public class TambahBuku {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Judul Buku: ");
        String judul = scanner.nextLine();

        System.out.print("Pengarang: ");
        String pengarang = scanner.nextLine();

        System.out.print("Tahun Terbit: ");
        int tahun = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Penerbit: ");
        String penerbit = scanner.nextLine();

        try {
            Connection conn = DatabaseConnection.getConnection();
            String sql = "INSERT INTO buku (judul, pengarang, tahun, penerbit) VALUES (?, ?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, judul);
            ps.setString(2, pengarang);
            ps.setInt(3, tahun);
            ps.setString(4, penerbit);
            ps.executeUpdate();

            System.out.println("Data buku berhasil ditambahkan!");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
