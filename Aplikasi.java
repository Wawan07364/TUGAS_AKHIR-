/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;


import Controller.BarangModelInterfaceImpl;
import Controller.JenisBarangcontroller;
import Controller.TransaksiController;
import Controller.PengirimController;
import Entity.TransaksiEntity;
import Entity.AdminEntity;
import Entity.BarangEntyti;
import Entity.PetugasEntity;
import Model.AdminModelInterfaceImpl;
import Model.PetugasModel;

import java.util.Scanner;

/**
 *
 * @author Wawan Saputra
 */

public class Aplikasi {
    
    public static Scanner input = new Scanner(System.in);
   
    public static BarangModelInterfaceImpl barangcontroller = new BarangModelInterfaceImpl() {};
    public static JenisBarangcontroller jeniscontroller = new JenisBarangcontroller();
    public static  TransaksiController transaksicontroller = new TransaksiController();
    public static PengirimController pengirimmodel = new PengirimController(); 
    public static AdminEntity adminEntity= new AdminEntity();
    public static PetugasEntity PetugasEntity= new PetugasEntity();
    public static PetugasModel Petugasmodel= new PetugasModel();
    public static AdminModelInterfaceImpl adminmodel= new AdminModelInterfaceImpl();
    private static boolean cekAdmin;
    private static boolean cekPetugas;
    public static TransaksiEntity transaksi = new TransaksiEntity();
     public static BarangEntyti barang = new BarangEntyti();
    public static void main (String[] args){
        int pilih ;
        do{
            System.out.println("=======================");
            System.out.println("    SELAMAT DATANG     ");
            System.out.println("=======================");
            System.out.println("      1. LOGIN         ");
            System.out.println("      2. KELUAR        ");
            System.out.println("=======================");
            System.out.print("Pilihan : ");
            pilih = input.nextInt();
            switch(pilih){
                case 1:
                    login();
                    break;
                case 2:
                    System.out.println("KELUAR");
                    break;
            }
        }while (pilih != 2);
    }
    
      public static void login(){
        int pilih;
       dataAdmin();
       dataPetugas();
       
        do{
            System.out.println("=========================");
            System.out.println("========LOGIN AS=========");
            System.out.println("|      1. ADMIN          |");
            System.out.println("|      2. PETUGAS         |");
            System.out.println("=========================");
            System.out.print("Pilihan : ");
            pilih = input.nextInt();
            switch(pilih){
                case 1:
                    loginAdmin();
                    break;
                case 2:
                    loginpetugas();
                   break;
            }
        }while (pilih < 3);
    }
      
       public static void loginAdmin(){
        System.out.print("Username : ");
        adminEntity.setNama(input.next());
        System.out.print("Password : ");
        adminEntity.setPass(input.next());
        cekAdmin = adminmodel.cekAdmin(adminEntity.getNama(), adminEntity.getPass());
        while(cekAdmin){
            menuAdmin();
        }
       }
    public static void loginpetugas(){
        System.out.print("Username : ");
        PetugasEntity.setNama_petugas(input.next());
        System.out.print("Password : ");
        PetugasEntity.setPass_petugas(input.next());
        cekPetugas = Petugasmodel.cekAdmin(PetugasEntity.getNama_petugas(), PetugasEntity.getPass_petugas());
         while(cekPetugas){
            menupetugas();
        }
       }
    
    static void dataAdmin(){
    String nama [] = {"admin"};
    String pass [] = {"admin"};
    adminmodel.insert(nama, pass);
     }
  
    static void dataPetugas(){
    String nama_petugas [] = {"wawan"};
    String pass_petugas [] = {"wan"};
    Petugasmodel.insert(nama_petugas, pass_petugas);
  
    }
     
    public static void menuAdmin(){
        int pilih;
        do{
            System.out.println("============================");
            System.out.println("         MENU ADMIN         ");
            System.out.println("============================");
            System.out.println("1.   INSERT BARANG          ");
            System.out.println("2.   INSERT JENIS           ");
            System.out.println("3.   INSERT PENGIRIM        ");
            System.out.println("4.   INSERT TRANSAKSI       ");
            System.out.println("5.   VIEW DATA BARANG       ");
            System.out.println("6.   UPDATE BARANG          ");
            System.out.println("7.   VIEW JENIS BARANG      ");
            System.out.println("8.   VIEW TRANSAKSI         ");
            System.out.println("9.   VIEW PENGIRIM          ");
            System.out.println("10.==========KELUAR=========");
            pilih = input.nextInt();
            switch(pilih){
                case 1:
                    tambahdatabarang();
                    
                    break;
                case 2:
                    tambahdatajenisbarang();
                    
                    break;
                case 3:
                    tambahdatapengirim();
                    break;
                case 4:
                    tambahdatatransaksi();
                    break;
                case 5:
                    ViewDataBarang();
                    break;
                case 6:
                    updatebarang();
                    break;
                case 7:
                    VIEWDATAJENIS();
                    break;
                case 8:
                    VIEWDATATRANSAKSI();
                    break;
                case 9:
                   VIEWDATAPENGIRIM();
                   break;
                   
            }
        }while (pilih != 10);
    }
    
    
    public static void tambahdatabarang(){
        System.out.print(" ID BARANG     : ");
        int id_barang= input.nextInt();
        System.out.print(" nama barang    : ");
        String nama_barang = input.next();
        System.out.print(" berat barang   : ");
        String berat_barang = input.next();
        System.out.print(" jumlah barang  : ");
        int jumlah_barang = input.nextInt();
        System.out.print(" ID JENIS       : ");
        int id_jenisbarang = input.nextInt();
        
        barangcontroller.insertbarang(id_barang, nama_barang, berat_barang, jumlah_barang, id_jenisbarang);
       
    } 
       
    public static void  updatebarang(){
      int pilih;
        do{
            System.out.println("1. update nama barang");
            System.out.println("2. update berat barang ");
            System.out.print("Pilih : ");
            pilih = input.nextInt();
            switch(pilih){
                case 1:
                   ViewDataBarang();
                    System.out.print("id barang : ");
                    int id_barang = input.nextInt();
                    System.out.print("nama barang : ");
                    String nama_barang = input.next();
                    barangcontroller.update(pilih, nama_barang, id_barang);
                    break;
                case 2:
                   ViewDataBarang();
                   System.out.print("id barang : ");
                    id_barang = input.nextInt();
                    System.out.print("berat_barang : ");
                    String berat_barang = input.next();
                    barangcontroller.update(pilih, berat_barang, id_barang);
                    break;
            }
        }while (pilih != 0);
      }
   
   
     public static void  ViewDataBarang(){
        int size = barangcontroller.getAll().size();
        for(int i = 0; i < size; i++){
            System.out.println((i+1)+ "\n ID BARANG    :"
            + barangcontroller.getAll().get(i).id_barang + "\n NAMA BARANG  :"
            + barangcontroller.getAll().get(i).nama_barang+ "\n BERAT BARANG :"
            + barangcontroller.getAll().get(i).berat_barang+"\n JUMLAH BARANG:"
            + barangcontroller.getAll().get(i).jumlah_barang+"\n JENIS BARANG :"
            + barangcontroller.getAll().get(i).getJenis().getJenis_barang()+""
                    
           
          
            
            );
        }
    }
     
    public static void tambahdatajenisbarang(){
        System.out.print("Id jenis barang        : ");
        int id_jenisbarang=input.nextInt();
        System.out.print(" jenis barang          : ");
        String  jenis_barang=input.next();
        jeniscontroller.insertjenis(id_jenisbarang,jenis_barang);
    } 
    
    public static void   VIEWDATAJENIS(){
    
        int size = jeniscontroller.getAll().size();
        for(int i = 0; i < size; i++){
            System.out.println((i+1)+ "\n ID JENIS : " 
            +jeniscontroller.getAll().get(i).getId_jenisbarang() + "\n JENIS BARANG :"
            + jeniscontroller.getAll().get(i).jenis_barang+ " "
            );
        }
    }
            
            
      
      public static void tambahdatapengirim(){
        System.out.print(" ID PENGIRIM             : ");
        int id_pengirim=input.nextInt();
        System.out.print(" NAMA PENGIRIM           : ");
        String  nama_pengirim=input.next();
        System.out.print(" ALAMAT PENGIRIM         : ");
        String alamat_pengirim=input.next();
        System.out.print(" NOTELP PENGIRIM         : ");
        String notelp_pengirim = input.next();
       
        pengirimmodel.insert (id_pengirim,nama_pengirim,alamat_pengirim,notelp_pengirim);
    } 
     
     
      public static void  VIEWDATAPENGIRIM(){
        int size = pengirimmodel.getAll().size();
        for(int i = 0; i < size; i++){
            System.out.println((i+1)+ "\n ID PENGIRIM  :" 
            +pengirimmodel.getAll().get(i).getId_pengirim()+ "\n NAMA PENGIRIM :"
            + pengirimmodel.getAll().get(i).getNama_pengirim()+ "\n ALAMAT PENGIRIM :"
            + pengirimmodel.getAll().get(i).getAlamat_pengirim()+ "\n NOTELP PENGIRIM : "
            + pengirimmodel.getAll().get(i).getNotelp_pengirim()+ " "
            
            );
        }
    }
    
    public static void tambahdatatransaksi(){
    
        System.out.print(" ID BARANG                : ");
        int id_barang=input.nextInt();
        System.out.print(" ID PENGIRIM              : ");
        int id_pengirim=input.nextInt();
        System.out.print("astimasi tiba             : ");
        String astimasi= input.next();
        System.out.print("penerima                  : ");
        String penerima = input.next();
        System.out.print("notelp penerima           : ");
        String notelp_penerima= input.next();
        System.out.print("alamat penerima           : ");
        String alamat_penerima=input.next();
        System.out.print("KOLI                      : ");
        int total_koli= input.nextInt();
      
        transaksicontroller.insertdata(id_barang, id_pengirim, astimasi, penerima, notelp_penerima, alamat_penerima, total_koli);
    }
     
     public static void   VIEWDATATRANSAKSI(){
        int size = transaksicontroller.getAll()
                .size();
        for(int i = 0; i < size; i++){
            System.out.println((i+1)+ ".\n TANGGAL PENGIRIMAN: " 
            + transaksicontroller.getAll().get(i).getTgl_transaksi()+ "\n PENERIMA          : "
            + transaksicontroller.getAll().get(i).getPenerima()+ "\n NOTELP PENERIMA   : "
            + transaksicontroller.getAll().get(i).getNotelp_penerima()+ "\n ALAMAT PNERIMA    : "       
            + transaksicontroller.getAll().get(i).getAlamat_penerima()+ "\n ASTIMASI          : "
            + transaksicontroller.getAll().get(i).getAstimasi()+ "\n NAMA BARANG       : "
            + transaksicontroller.getAll().get(i).getBarang().getNama_barang()+ "\n BERAT BARANG      : "
            + transaksicontroller.getAll().get(i).getBarang().getBerat_barang()+ "\n TOTAL KOLI        : "        
            + transaksicontroller.getAll().get(i).getTotal_koli()+ "\n NAMA PENGIRIM     : "
            + transaksicontroller.getAll().get(i).getPengirim().getNama_pengirim()+ ""
            
                   
            );
        }
    }
     
  
    public static void menupetugas(){
        int pili;
        do{
            System.out.println("  MENU PETUGAS  ");
            System.out.println("1.VIEW DATA BARANG");
            System.out.println("2.VIEW DATA PINGIRIM");
            System.out.println("3.VIEW DATA TRANSAKSI");
            System.out.println("10. KELUAR");
            pili = input.nextInt();
            switch(pili){
                case 1:
                    Daftarbarang();
                    
                    break;
               case 2:
                    daftardatapengirim();
                   break;
                   case 3:
                   daftartransaksi();
                   break;
            }
        }while (pili != 10);
    }
    
    
   
     public static void  Daftarbarang(){
       int size = barangcontroller.getAll().size();
        for(int i = 0; i < size; i++){
            System.out.println((i+1)+ "\n ID BARANG    :"
            + barangcontroller.getAll().get(i).id_barang + "\n NAMA BARANG  :"
            + barangcontroller.getAll().get(i).nama_barang+ "\n BERAT BARANG :"
            + barangcontroller.getAll().get(i).berat_barang+"\n JUMLAH BARANG:"
            + barangcontroller.getAll().get(i).jumlah_barang+"\n JENIS BARANG :"
            + barangcontroller.getAll().get(i).getJenis().getJenis_barang()+""
                    
           
          
            
            );
        }
    }
     
     
  public static void  daftardatapengirim(){
        int size = pengirimmodel.getAll().size();
        for(int i = 0; i < size; i++){
            System.out.println((i+1)+ "\n ID PENGIRIM  :" 
            +pengirimmodel.getAll().get(i).getId_pengirim()+ "\n NAMA PENGIRIM :"
            + pengirimmodel.getAll().get(i).getNama_pengirim()+ "\n ALAMAT PENGIRIM :"
            + pengirimmodel.getAll().get(i).getAlamat_pengirim()+ "\n NOTELP PENGIRIM : "
            + pengirimmodel.getAll().get(i).getNotelp_pengirim()+ " "
            
            );
        }
    }
  
  
   public static void  daftartransaksi(){
        int size = transaksicontroller.getAll().size();
        for(int i = 0; i < size; i++){
            System.out.println((i+1)+ ".\n TANGGAL PENGIRIMAN: " 
            + transaksicontroller.getAll().get(i).getTgl_transaksi()+ "\n PENERIMA          : "
            + transaksicontroller.getAll().get(i).getPenerima()+ "\n NOTELP PENERIMA   : "
            + transaksicontroller.getAll().get(i).getNotelp_penerima()+ "\n ALAMAT PNERIMA    : "       
            + transaksicontroller.getAll().get(i).getAlamat_penerima()+ "\n ASTIMASI          : "
            + transaksicontroller.getAll().get(i).getAstimasi()+ "\n NAMA BARANG       : "
            + transaksicontroller.getAll().get(i).getBarang().getNama_barang()+ "\n BERAT BARANG      : "
            + transaksicontroller.getAll().get(i).getBarang().getBerat_barang()+ "\n TOTAL KOLI        : "        
            + transaksicontroller.getAll().get(i).getTotal_koli()+ "\n NAMA PENGIRIM     : "
            + transaksicontroller.getAll().get(i).getPengirim().getNama_pengirim()+ ""
            
                    


           
            );
        }
    }
     
}