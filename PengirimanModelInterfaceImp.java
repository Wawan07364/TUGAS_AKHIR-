/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Wawan Saputra
 */
import Entity.PengirimEntity;
import Helper.DbUtil;
import java.util.ArrayList;
import java.sql.*;

public class PengirimanModelInterfaceImp {
   
    
    public String sql;
    public Connection conn = DbUtil.getConnection();
     
    public void add(PengirimEntity Pengirim) {
        try{
            sql= "INSERT INTO pengirim(id_pengirim, nama_pengirim, alamat_pengirim, notelp_pengirim) values(?,?,?,?)";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setInt    (1, Pengirim.getId_pengirim());
            stat.setString (2, Pengirim.getNama_pengirim());
            stat.setString (3, Pengirim.getAlamat_pengirim());
            stat.setString (4, Pengirim.getNotelp_pengirim());
            stat.executeUpdate();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
  
     
     public void view(int id_pengirim) {
          try {
            String sql = " select * from pengirim  where id_pengiriman = ?";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setInt(1, id_pengirim);
            stat.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
 public ArrayList<PengirimEntity> getAll() {
        ArrayList<PengirimEntity> arrPengiriman = new ArrayList<>();
        try {
            sql = "SELECT * FROM pengirim ";
            Statement stat = conn.createStatement ();
            ResultSet rs = stat.executeQuery(sql);
            while(rs.next()){
            PengirimEntity kirim = new PengirimEntity();
                kirim.setId_pengirim(rs.getInt("Id_Pengirim"));
                kirim .setNama_pengirim(rs.getString("nama_Pengirim"));
                kirim .setAlamat_pengirim(rs.getString("Alamat_pengirim"));
                kirim .setNotelp_pengirim(rs.getString("notelp_pengirim"));
                
            arrPengiriman.add(kirim);    
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return arrPengiriman;
    }

 }