/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oopatm;

/**
 *
 * @author ahmet
 */
public class OOPATM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
            ATM atm = new ATM();
            
            Hesap hesap = new Hesap("Mehmet", "123", 1500);
    
             atm.calıs(hesap);
    }
}
