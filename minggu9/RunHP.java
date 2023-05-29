/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.minggu9;

import java.util.Scanner;

/**
 *
 * @author Aspire
 */
public class RunHP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int pilih;
        Scanner inp = new Scanner(System.in);
        
        HPPoco run = new HPPoco(); 
        
        System.out.print("Masukan pilihan:");
        pilih = inp.nextInt();
        
        switch (pilih){
            case 1 -> run.powerOn();
            case 2 -> run.powerOff();
                
            default -> System.out.print("Pilihan tidak tersedia");
        }
    }
}
    
   
    
