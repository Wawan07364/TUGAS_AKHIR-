/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Entity.PengirimEntity;
import java.util.ArrayList;

/**
 *
 * @author Wawan Saputra
 */
public class PengirimController {
     public void insert(int id_pengirim,String nama_pengirim,String alamat_pengirim, String notelp_pengirim) {
      PengirimEntity pengirim = new PengirimEntity(id_pengirim,nama_pengirim,alamat_pengirim,notelp_pengirim);
      allObjectModel.pengirimmodel.add(pengirim);
    }

    public void view(int id_pengirim, String nama_pengirim) {
        allObjectModel.pengirimmodel.view(id_pengirim);
    }
    
    public ArrayList<PengirimEntity> getAll() {
        return allObjectModel.pengirimmodel.getAll();
    }
}
