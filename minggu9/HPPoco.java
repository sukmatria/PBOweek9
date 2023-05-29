/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.minggu9;

/**
 *
 * @author Aspire
 */
public class HPPoco implements Phone {
    private int volume;
    public HPPoco(){
        this.volume = 45;
        
    }
    
    @Override
    public void powerOn(){
        System.out.println("Handphone ON");
    }
    @Override
    public void powerOff(){
        System.out.println("Handphone OFF");
    }
    @Override
    public void volumeUp(){
        this.volume += 1;
        System.out.println("Volume sekarang:" + this.getVolume());
    }
    @Override
    public void volumeDown(){
        this.volume -= 2;
        System.out.println("Volume sekarang:" + this.getVolume());
    }
    public int getVolume(){
        return this.volume;
        
    }
    
    
}


  

