/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package oopatm;

import java.util.Scanner;


public class Login {
    
        public boolean Login(Hesap hesap){
        
        Scanner scan = new Scanner(System.in);
        
            System.out.println("hesap adı: ");
            String kullanıcı_adı = scan.nextLine();
            System.out.println("Parola: ");
            String parola = scan.nextLine();
            
          if (hesap.getKullanıcı_adı().equals(kullanıcı_adı) && hesap.getParola().equals(parola)){
                return true;
          }
          else
              return false;
        }
}
