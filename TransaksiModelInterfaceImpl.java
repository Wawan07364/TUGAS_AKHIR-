/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Entity.BarangEntyti;
import Entity.PengirimEntity;
import Entity.TransaksiEntity;
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
public class TransaksiModelInterfaceImpl extends BarangEntyti {
    public String sql;
    public static ResultSet rs;
    public Connection conn = DbUtil.getConnection();
    public int result;
    public void add(TransaksiEntity transaksi) {
        
          try {
            sql = String.format("INSERT INTO transaksi(id_transaksi, id_barang, id_pengirim, tgl_transaksi, astimasi,penerima, notelp_penerima, alamat_penerima, total_koli) VALUES " +
                                 "('%s','%s','%s',NOW(),'%s','%s','%s','%s','%s');",
                    transaksi.getId_transaksi(),
                    transaksi.getId_barang(),
                    transaksi.getId_pengirim(),
                    transaksi.getAstimasi(),
                    transaksi.getPenerima(),
                    transaksi.getNotelp_penerima(),
                    transaksi.getAlamat_penerima(),
                    transaksi.getTotal_koli());
                   
            PreparedStatement statement = conn.prepareStatement(sql);
             result = statement.executeUpdate();
            if(result > 0){
                System.out.println("Berhasil Menambah Data Transaksi");
            }else{
                System.out.println("Gagal Menambah Data Transaksi");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        }
    
    
     public ArrayList<TransaksiEntity> getAll() {
       ArrayList<TransaksiEntity> arrtransaksi = new ArrayList<>();
        try {
            sql = "SELECT  transaksi.id_transaksi,transaksi.id_barang,transaksi.id_pengirim,transaksi.tgl_transaksi,"
                    + "transaksi.astimasi,transaksi.penerima,transaksi.notelp_penerima,"
                    + " transaksi.alamat_penerima,transaksi.total_koli, "
                    + "barang.nama_barang, barang.berat_barang, pengirim.nama_pengirim from transaksi "
                    + "JOIN barang on transaksi.id_barang= barang.id_barang "
                    + "JOIN pengirim on transaksi.id_pengirim=pengirim.id_pengirim";
            Statement stat = conn.createStatement ();
            ResultSet rs=stat.executeQuery(sql);
            while(rs.next()){
           
            TransaksiEntity transaksi = new TransaksiEntity();
                transaksi.setId_transaksi(rs.getInt("id_transaksi"));
                transaksi.setId_barang(rs.getInt("id_barang"));
                transaksi.setId_pengirim(rs.getInt("id_pengirim"));
                transaksi.setTgl_transaksi(rs.getDate("Tgl_transaksi"));
                transaksi.setAstimasi(rs.getString("astimasi"));
                transaksi.setPenerima(rs.getString("penerima"));
                transaksi.setAlamat_penerima(rs.getString("alamat_penerima"));
                transaksi.setNotelp_penerima(rs.getString("notelp_penerima"));
                transaksi.setTotal_koli(rs.getInt("total_koli"));
                BarangEntyti barang = new BarangEntyti  ();
                barang.setNama_barang(rs.getString("nama_barang"));
                barang.setBerat_barang(rs.getString("berat_barang"));
                transaksi.setBarang(barang);
                PengirimEntity pengirim = new  PengirimEntity();
                transaksi.setPengirim(pengirim);
                pengirim.setNama_pengirim(rs.getString("nama_pengirim"));
               
               
            arrtransaksi.add(transaksi);    
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return arrtransaksi;
    }
}
  /*"SELECT transaksi.id_transaksi,transaksi.tgl_transaksi,transaksi.total_transaksi,transaksi.astimasi,transaksi.penerima,transaksi.alamat_penerima,"
                    + " transaksi.notelp_penerima,barang.nama_barang from transaksi join barang on transaksi.id_barang= barang.id_barang ";*/
  /* public void getAll(){
        try
        {select transaksi.id_transaksi, transaksi.tgl_transaksi, transaksi.total_transaksi, transaksi.astimasi, transaksi.penerima, transaksi.notelp_penerima, alamat_penerima, barang.id_barang, barang.nama_barang, barang.berat_barang, barang.jumlah_barang from transaksi join barang on transaksi.id_barang= barang.id_barang;
           Statement stat = conn.createStatement ();
           sql = "select * from transaksi";
           rs=stat.executeQuery(sql);
           System.out.println(rs.getInt("id_transaksi"));
           System.out.println(rs.getDate("tgl_transaksi"));
           System.out.println(rs.getFloat("total_transaksi"));
           System.out.println(rs.getString("astimasi"));
           System.out.println(rs.getString("penerima"));
           System.out.println(rs.getString("notelp_penerima"));
           System.out.println(rs.getString("alamat_penerima"));
           System.out.println(rs.getFloat("total"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }/*
  
  
   /*try{
            sql=" INSERT INTO transaksi(id_transaksi, tgl_transaksi, total_transaksi, tgl_tiba, penerima, notelp_penerima, alamat_penerima )values(?,now(),?,?,?,?,?)";
            PreparedStatement stat = conn .prepareStatement(sql);
            stat.setInt   (1, transaksi.getId_transaksi());
            stat.setDate  (2, (Date) transaksi.getTgl_transaksi());
            stat.setFloat (3, transaksi.getTotal_transaksi());
            // stat.setDate  (4, (Date) transaksi.getTgl_tiba());
            stat.setString  (4,transaksi.getAstimasi());
            stat.setString(5, transaksi.getPenerima());
            //stat.setFloat (5, transaksi.getTotal_transaksi());
            stat.setString(6, transaksi.getNotelp_penerima());
            stat.setString(7, transaksi.getAlamat_penerima());
            stat.executeQuery();
        }catch (SQLException e){
            e.printStackTrace();
            
        }
    }*/
        

/*public void update(int id_transaksi) {
       try {
            String sql = "SELECT * FROM transaksi WHERE id_transaksi = ?";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setInt(1, id_transaksi);
            stat.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void delete(String id_transaksi) {
        try {
            String sql = "DELETE SET tansaksi =? WHERE id_transaksi =?";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, id_transaksi);
            stat.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }*/
    
    
/*  try {
            sql = String.format(" INSERT INTO transaksi1(id_transaksi, id_barang, id_pengirim, tgl_transaksi, astimasi,"
                                 + " penerima, notelp_penerima, alamat_penerima, total_transaksi) VALUES " +
                                 "('%d','%s','%s',NOW(),'%s','%s','%s','%s','%s')",
                   
                    transaksi.getId_barang(),
                    transaksi.getId_pengirim(),
                    transaksi.getAstimasi(),
                    transaksi.getPenerima(),
                    transaksi.getNotelp_penerima(),
                    transaksi.getAlamat_penerima(),
                    transaksi.getTotal_transaksi());
                   
            PreparedStatement statement = conn.prepareStatement(sql);
             result = statement.executeUpdate();
            if(result > 0){
                System.out.println("Berhasil Menambah Data Transaksi");
            }else{
                System.out.println("Gagal Menambah Data Transaksi");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        }*/
    
/*try{
            sql=" INSERT INTO transaksi(id_transaksi, tgl_transaksi, total_transaksi, tgl_tiba, penerima, notelp_penerima, alamat_penerima )values(?,now(),?,?,?,?,?)";
            PreparedStatement stat = conn .prepareStatement(sql);
            stat.setInt   (1, transaksi.getId_transaksi());
            stat.setDate  (2, (Date) transaksi.getTgl_transaksi());
            stat.setFloat (3, transaksi.getTotal_transaksi());
            // stat.setDate  (4, (Date) transaksi.getTgl_tiba());
            stat.setString  (4,transaksi.getAstimasi());
            stat.setString(5, transaksi.getPenerima());
            //stat.setFloat (5, transaksi.getTotal_transaksi());
            stat.setString(6, transaksi.getNotelp_penerima());
            stat.setString(7, transaksi.getAlamat_penerima());
            stat.executeQuery();
        }catch (SQLException e){
            e.printStackTrace();
            
        }
   }
*/