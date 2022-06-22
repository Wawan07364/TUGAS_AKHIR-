
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
public class AdminEntity {
    private String nama ;
    private String pass;
    
    public AdminEntity(){}
    
    public AdminEntity(String nama, String pass) {
         this.nama = nama;
         this.pass = pass ;
}
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    
}