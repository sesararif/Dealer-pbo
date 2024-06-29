/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dealer;

/**
 *
 * @author avicomp
 */
public class MobilBekas extends Mobil implements Kendaraan{
    private int tahun;
    private double harga;
    
    public MobilBekas(String merek, String model, int tahun, double harga) {
        super(merek, model);
        this.tahun = tahun;
        this.harga = harga;
    }
    
    public int getTahun() {
        return tahun;
    }
    
    public double getHarga() {
        return harga;
    }
    
    //ini adalah Notation yang menunjujjkan implementasi
    // dari metode info() yang dideklarasikan di interface
    @Override
    public void info() {
        System.out.println("Mobil Bekas: " + getMerek() + " " + getModel() + " ("
+ tahun + ")");
    }
}
