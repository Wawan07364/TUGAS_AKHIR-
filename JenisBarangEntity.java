/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author Wawan Saputra
 */
public class JenisBarangEntity {
    private int id_jenisbarang;
    public String jenis_barang;
    
    
    
       public JenisBarangEntity(int id_jenisbarang, String jenis_barang){
        
         this. jenis_barang = jenis_barang;
      
    
    }
     public JenisBarangEntity() {}

    public int getId_jenisbarang() {
        return id_jenisbarang;
    }

    public void setId_jenisbarang(int id_jenisbarang) {
        this.id_jenisbarang = id_jenisbarang;
    }

    public String getJenis_barang() {
        return jenis_barang;
    }

    public void setJenis_barang(String jenis_barang) {
        this.jenis_barang = jenis_barang;
    }

   

}
