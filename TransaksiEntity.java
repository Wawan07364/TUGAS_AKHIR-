/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;


import java.util.Date;
import Entity.BarangEntyti;
import Entity.PengirimEntity;
import java.util.Scanner;
/**
 *
 * @author Wawan Saputra
 */
public class TransaksiEntity extends BarangEntyti {
    public int id_transaksi;
    public int id_barang;
    public int id_pengirim;
   
    public Date tgl_transaksi;
    public String astimasi;
    public String penerima;
    public String notelp_penerima;
    public String alamat_penerima;
  
    public int total_koli;
    public  BarangEntyti barang;
    public PengirimEntity pengirim;
 

    //public TransaksiEntity(int id_transaksi,float total_transaksi,String penerima,String notelp_penerima,String alamat_penerima) {}
    public TransaksiEntity(){};

    public TransaksiEntity(BarangEntyti barang, PengirimEntity pengirim) {
                this.pengirim = pengirim;
                  this.barang = barang;

    }

    public int getId_transaksi() {
        return id_transaksi;
    }

    public void setId_transaksi(int id_transaksi) {
        this.id_transaksi = id_transaksi;
    }

    @Override
    public int getId_barang() {
        return id_barang;
    }

    @Override
    public void setId_barang(int id_barang) {
        this.id_barang = id_barang;
    }

    public int getId_pengirim() {
        return id_pengirim;
    }

    public void setId_pengirim(int id_pengirim) {
        this.id_pengirim = id_pengirim;
    }

    public Date getTgl_transaksi() {
        return tgl_transaksi;
    }

    public void setTgl_transaksi(Date tgl_transaksi) {
        this.tgl_transaksi = tgl_transaksi;
    }

    public String getAstimasi() {
        return astimasi;
    }

    public void setAstimasi(String astimasi) {
        this.astimasi = astimasi;
    }

    public String getPenerima() {
        return penerima;
    }

    public void setPenerima(String penerima) {
        this.penerima = penerima;
    }

    public String getNotelp_penerima() {
        return notelp_penerima;
    }

    public void setNotelp_penerima(String notelp_penerima) {
        this.notelp_penerima = notelp_penerima;
    }

    public String getAlamat_penerima() {
        return alamat_penerima;
    }

    public void setAlamat_penerima(String alamat_penerima) {
        this.alamat_penerima = alamat_penerima;
    }

    public int getTotal_koli() {
        return total_koli;
    }

    public void setTotal_koli(int total_koli) {
        this.total_koli = total_koli;
    }

  

    public BarangEntyti getBarang() {
        return barang;
    }

    public void setBarang(BarangEntyti barang) {
        this.barang = barang;
    }

    public PengirimEntity getPengirim() {
        return pengirim;
    }

    public void setPengirim(PengirimEntity pengirim) {
        this.pengirim = pengirim;
    }

   

    public JenisBarangEntity getJenis() {
        return jenis;
    }

    public void setJenis(JenisBarangEntity jenis) {
        this.jenis = jenis;
    }

    @Override
    public String getNama_barang() {
        return nama_barang;
    }

    @Override
    public void setNama_barang(String nama_barang) {
        this.nama_barang = nama_barang;
    }

    @Override
    public String getBerat_barang() {
        return berat_barang;
    }

    @Override
    public void setBerat_barang(String berat_barang) {
        this.berat_barang = berat_barang;
    }

    @Override
    public int getJumlah_barang() {
        return jumlah_barang;
    }

    @Override
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
       
