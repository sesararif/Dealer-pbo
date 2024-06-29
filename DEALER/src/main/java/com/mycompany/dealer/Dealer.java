/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.dealer;

/**
 *
 * @author avicomp
 */
public class Dealer {
    private String nama;
    private MobilBaru mobilBaru;
    private MobilBekas mobilBekas;
    
    public Dealer(String nama, MobilBaru mobilBaru, MobilBekas mobilBekas) {
        this.nama = nama;
        this.mobilBaru = mobilBaru;
        this.mobilBekas = mobilBekas;
    }
    
    public String getNama() {
        return nama;
    }
    
    public void info() {
        System.out.println("Dealer: " + nama);
        mobilBaru.info();
        mobilBekas.info();
    }
}
    
    