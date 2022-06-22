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
public class PetugasEntity {
    private String nama_petugas ;
    private String pass_petugas;

   
    public PetugasEntity(){}
    
    public PetugasEntity(String nama_petugas,String pass_petugas){
    
    this.nama_petugas = nama_petugas;
    this.pass_petugas = pass_petugas ;
    
    }

    public String getNama_petugas() {
        return nama_petugas;
    }

    public void setNama_petugas(String nama_petugas) {
        this.nama_petugas = nama_petugas;
    }

    public String getPass_petugas() {
        return pass_petugas;
    }

    public void setPass_petugas(String pass_petugas) {
        this.pass_petugas = pass_petugas;
    }
    
}
