/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oopatm;

import java.util.Scanner;

/**
 *
 * @author ahmet
 */
public class ATM {
    
    public void calıs(Hesap hesap){
        
        Login login = new Login();
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Bankamıza Hoşgeldiniz");
        System.out.println("**********************");
        
        System.out.println("Kullanıcı Girişi");
        System.out.println("***********************");
        
        int giris_hakkı = 3;
        
        while (true){
            
            if(login.Login(hesap)){
                System.out.println("Giriş Başarılı");
                 break;
            }
            else{
                System.out.println("Giriş başrısız");
                giris_hakkı -= 1;
                System.out.println("hakkınız: " + giris_hakkı);
            }
            if(giris_hakkı == 0){
                System.out.println("giriş hakkı kalmadı");
                return;
            }
        }
        System.out.println("************************");
        String select = "1. Bakiye öğrenme\n"
                      + "2. pata yatırma\n"
                      + "3. Para çekme\n"
                      + "çıkış için q basın";
        System.out.println(select);
        System.out.println("************************");
        
        while (true) {
            
            System.out.println("lütfen işlem seçin");
            String selected = scan.nextLine();
            
            if (select.equals("q")) {
                System.out.println("işlem sona ermiştir");
                break;     
            }
            else if(selected.equals("1")){
                System.out.println("Bakiyeniz" + hesap.getBakiye());
            }
            else if(selected.equals("2")){
                System.out.println("miktar giriniz");
                double tutar = scan.nextInt();
                scan.nextLine();
                hesap.parayatırma(tutar);
            }
            else if(selected.equals("3")){
                System.out.println("miktar giriniz");
                double tutar = scan.nextInt();
                scan.nextLine();
                hesap.paracekme(tutar);
            }
            else 
                System.out.println("işlem seçmediniz");
            
        }
        
    }
    
}
