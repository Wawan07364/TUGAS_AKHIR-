/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;


import Entity.JenisBarangEntity;
import Helper.DbUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Wawan Saputra
 */
public class JenisBarangModelImpl  {
    
    private String sql;
    public Connection conn = DbUtil.getConnection();
    ArrayList<JenisBarangEntity> arrjenis = new ArrayList<>();
    public void add(JenisBarangEntity jenis) {
        
         try{
            sql= "INSERT INTO jenis (id_jenisbarang,jenis_barang) values (?,?)";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setInt   (1, jenis.getId_jenisbarang());
            stat.setString(2, jenis.getJenis_barang ());
            stat.executeUpdate();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public ArrayList<JenisBarangEntity> getAll() {
          ArrayList<JenisBarangEntity> arrjenis = new ArrayList<>();
        try {
            String sql = "SELECT * FROM jenis ";
            Statement stat = conn.createStatement ();
            ResultSet rs=stat.executeQuery(sql);
            while(rs.next()){
            JenisBarangEntity jenis = new JenisBarangEntity();
                jenis.setId_jenisbarang(rs.getInt("id_jenisbarang"));
                jenis.setJenis_barang(rs.getString("jenis_barang"));
             
            arrjenis.add(jenis);    
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return arrjenis;
    }

}
