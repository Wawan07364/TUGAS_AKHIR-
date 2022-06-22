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

import Entity.PetugasEntity;
public class PetugasModel extends PetugasEntity {
    
    private static  PetugasEntity[] petugas = new PetugasEntity[100];
    public void insert(String[] nama_petugas, String[] pass_petugas){
        petugas[0] = new PetugasEntity(nama_petugas[0], pass_petugas[0]);
    }
    public PetugasEntity getPetugas(){
         return petugas [0];
    }
    public void view(){
        System.out.println("Nama : " + petugas[0].getNama_petugas()+ "\nPass " + petugas[0].getPass_petugas());
    }
    public boolean cekAdmin(String nama_petugas, String pass_petugas){
        if(petugas[0].getNama_petugas().equals(nama_petugas) && petugas[0].getPass_petugas().equals(pass_petugas)){
            System.out.println("login berhasil");
            return true;
        }else {
            System.out.println("login gagal");
            return false;
        }
    }

}
    
    

