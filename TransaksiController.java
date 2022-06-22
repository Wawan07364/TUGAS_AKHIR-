/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import Entity.TransaksiEntity;
import Entity.BarangEntyti;
import Entity.PengirimEntity;
import java.util.ArrayList;

/**
 *
 * @author Wawan Saputra
 */
public class TransaksiController {

     public void insertdata( int id_barang, int id_pengirim, String astimasi, String penerima, String notelp_penerima, String alamat_penerima ,int total_koli) {
   
    TransaksiEntity transaksi = new TransaksiEntity();
    transaksi.setId_transaksi(0);
    transaksi.setId_barang(id_barang);
    transaksi.setId_pengirim(id_pengirim);
    transaksi.setTgl_transaksi(null);
    transaksi.setAstimasi(astimasi);
    transaksi.setPenerima(penerima);
    transaksi.setNotelp_penerima(notelp_penerima);
    transaksi.setAlamat_penerima(alamat_penerima);
    transaksi.setTotal_koli(total_koli);
         
     allObjectModel.transaksimodel.add(transaksi);
    }
    
     public void insert(BarangEntyti barang, PengirimEntity pengirim) {
       allObjectModel.transaksimodel.add(new TransaksiEntity(barang,pengirim));
    }
    
     
    public  ArrayList<TransaksiEntity> getAll() {
        return (ArrayList<TransaksiEntity>) allObjectModel.transaksimodel.getAll();
    }

    
}