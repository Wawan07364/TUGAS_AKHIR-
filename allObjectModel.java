/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

/**
 *
 * @author Wawan Saputra
 */


import Model.BarangModelInterfaceImpl;

import Model.JenisBarangModelImpl;


import Model.TransaksiModelInterfaceImpl;

import Model.PengirimanModelInterfaceImp;

public class allObjectModel {
    
    
    public static BarangModelInterfaceImpl barangmodel = new BarangModelInterfaceImpl() {};
    public static JenisBarangModelImpl jenismodel = new JenisBarangModelImpl();
 
    public static TransaksiModelInterfaceImpl transaksimodel = new TransaksiModelInterfaceImpl();
    public static PengirimanModelInterfaceImp pengirimmodel = new PengirimanModelInterfaceImp();
    
}
