/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Entity.JenisBarangEntity;
import java.util.ArrayList;

/**
 *
 * @author Wawan Saputra
 */
public class JenisBarangcontroller {
    public void insertjenis(int id_jenis,String jenis_barang) {
      JenisBarangEntity jenis = new JenisBarangEntity(id_jenis,jenis_barang);
      allObjectModel.jenismodel.add(jenis);
    }
    public ArrayList<JenisBarangEntity> getAll() {
        return allObjectModel.jenismodel.getAll();
    }
}
