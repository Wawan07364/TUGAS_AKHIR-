/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Helper;
import java.sql.*;

public class DbUtil {
    public static Connection getConnection(){
        Connection conn = null;
        String driver = "com.mysql.cj.jdbc.Driver"; //memanggil driver dari mysql
        String url = "jdbc:mysql://localhost:3306/konveksi";    //memanggil database yang akan digunakan
        String user = "root";
        String pass = "";
        //membuat sebuah statment untuk mengurung eksekusi yang menampilkan error dan dapat membuat program
        //tetap berjalan tanpa dihentikan secara langsung
        try{
            Class.forName(driver);                              //memanggil driver dan
            conn = DriverManager.getConnection(url,user,pass);  //mengkoneksikan dengan database
            System.out.println("Berhasil Koneksi database");
        }catch(Exception e){    //Exception digunakan sebagai penanganan dari sebuah statment try catch
            System.out.println("Gagal Koneksi database");
            e.printStackTrace();    //membantu memahami dimana kesalahan yang sebenarnya terjadi
        }
        return conn;
    }
}
