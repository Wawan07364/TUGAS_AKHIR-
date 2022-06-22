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
public class PengirimEntity {
   
    
    public int id_pengirim;
    public String nama_pengirim;
    public String alamat_pengirim;
    public String notelp_pengirim;
   
   
    
public PengirimEntity (int id_pengirim, String nama_pengirim, String alamat_pengirim,String notelp_pengirim ) {
       
        this.id_pengirim             = id_pengirim;
        this.nama_pengirim           = nama_pengirim;
        this.alamat_pengirim         =  alamat_pengirim;
        this.notelp_pengirim         = notelp_pengirim;
      
    }
    public PengirimEntity() {}

    public int getId_pengirim() {
        return id_pengirim;
    }

    public void setId_pengirim(int id_pengirim) {
        this.id_pengirim = id_pengirim;
    }

    public String getNama_pengirim() {
        return nama_pengirim;
    }

    public void setNama_pengirim(String nama_pengirim) {
        this.nama_pengirim = nama_pengirim;
    }

    public String getAlamat_pengirim() {
        return alamat_pengirim;
    }

    public void setAlamat_pengirim(String alamat_pengirim) {
        this.alamat_pengirim = alamat_pengirim;
    }

    public String getNotelp_pengirim() {
        return notelp_pengirim;
    }

    public void setNotelp_pengirim(String notelp_pengirim) {
        this.notelp_pengirim = notelp_pengirim;
    }

}
