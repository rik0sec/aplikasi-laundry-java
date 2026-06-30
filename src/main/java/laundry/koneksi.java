/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laundry;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author kalilinux
 */

public class koneksi {

    private Connection koneksi;

    public Connection connect() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/db_mylaundry";
            String user = "root";
            String pass = "";

            koneksi = DriverManager.getConnection(url, user, pass);

            System.out.println("Database Berhasil Koneksi");

        } catch (ClassNotFoundException e) {
            System.out.println("Driver Tidak Ditemukan");
        } catch (SQLException e) {
            System.out.println("Database Gagal Koneksi");
            System.out.println(e.getMessage());
        }

        return koneksi;
    }

    public static void main(String[] args) {
        new koneksi().connect();
    }
}
