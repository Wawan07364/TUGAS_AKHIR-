/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Entity.BarangEntyti;
import Entity.JenisBarangEntity;
import java.util.ArrayList;
/**
 *
 * @author Wawan Saputra
 */
public class BarangModelInterfaceImpl {

    public void insertbarang(int id_barang, String nama_barang, String berat_barang, int jumlah_barang,int id_jenisbarang) {
      BarangEntyti barang = new BarangEntyti();
      barang.setId_barang(id_barang);
      barang.setNama_barang(nama_barang);
      barang.setBerat_barang(berat_barang);
      barang.setJumlah_barang(jumlah_barang);
      barang.setId_jenisbarang(id_jenisbarang);
      allObjectModel.barangmodel.add(barang);
    }
      public void insert(JenisBarangEntity jenis) {
       allObjectModel.barangmodel.add(new BarangEntyti(jenis));
    }

    
    public void view(int id_barang ,String nama_barang ) {
          allObjectModel.barangmodel.view(id_barang);
    }

   

    public ArrayList<BarangEntyti> getAll() {
        return allObjectModel.barangmodel.getAll();
    }

    public void update( int pilihan, String data, int id_barang ) {
       
        if (pilihan == 1){
            allObjectModel.barangmodel.updatenama(data, id_barang);
        }else if (pilihan == 2){
            allObjectModel.barangmodel.updateberat(data, id_barang);
        
    }    

}
}