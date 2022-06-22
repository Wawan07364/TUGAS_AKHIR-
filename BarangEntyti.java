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
public class BarangEntyti extends JenisBarangEntity {
    public int id_barang;
     public  JenisBarangEntity jenis;
    public String nama_barang;
    public String berat_barang;
    public int jumlah_barang;
    public int  id_jenisbarang;
    
    public BarangEntyti() {}
   
    public BarangEntyti( JenisBarangEntity jenis) {
         this.jenis= jenis;
    }

    public int getId_barang() {
        return id_barang;
    }

    public void setId_barang(int id_barang) {
        this.id_barang = id_barang;
    }

    public JenisBarangEntity getJenis() {
        return jenis;
    }

    public void setJenis(JenisBarangEntity jenis) {
        this.jenis = jenis;
    }

    public String getNama_barang() {
        return nama_barang;
    }

    public void setNama_barang(String nama_barang) {
        this.nama_barang = nama_barang;
    }

    public String getBerat_barang() {
        return berat_barang;
    }

    public void setBerat_barang(String berat_barang) {
        this.berat_barang = berat_barang;
    }

    public int getJumlah_barang() {
        return jumlah_barang;
    }

    public void setJumlah_barang(int jumlah_barang) {
        this.jumlah_barang = jumlah_barang;
    }

    @Override
    public int getId_jenisbarang() {
        return id_jenisbarang;
    }

    @Override
    public void setId_jenisbarang(int id_jenisbarang) {
        this.id_jenisbarang = id_jenisbarang;
    }

    @Override
    public String getJenis_barang() {
        return jenis_barang;
    }

    @Override
    public void setJenis_barang(String jenis_barang) {
        this.jenis_barang = jenis_barang;
    }

    
    
}
