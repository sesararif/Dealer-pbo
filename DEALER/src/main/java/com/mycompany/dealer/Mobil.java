/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dealer;

/**
 *
 * @author avicomp
 */
public class Mobil {
    private String merek;
    private String model;
    
    public Mobil(String merek, String model) {
        this.merek = merek;
        this.model = model;
    }
    
    public String getMerek() {
        return merek;
    }
    
    public String getModel() {
        return model;
    }
    
    public void readMerk() {
        System.out.println("Merek mobil ini adalah: " + getMerek());
    }
}
