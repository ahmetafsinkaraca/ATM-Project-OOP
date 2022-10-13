/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oopatm;

public class Hesap {
    
    private String kullanıcı_adı ;
    private String parola ;
    private double bakiye ;
    
    public Hesap(String kullanıcı_adı, String parola, double bakiye){
        
        this.kullanıcı_adı = kullanıcı_adı;
        this.parola = parola;
        this.bakiye = bakiye ;
        
    }

    public void setKullanıcı_adı(String kullanıcı_adı) {
        this.kullanıcı_adı = kullanıcı_adı;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
    }

    public String getKullanıcı_adı() {
        return kullanıcı_adı;
    }

    public String getParola() {
        return parola;
    }

    public double getBakiye() {
        return bakiye;
    }
    
    public void paracekme(double tutar){
        if( (bakiye - tutar)< 0 )
            System.out.println("yeterli bakiye yok");
        else
        {
            bakiye -= tutar;
            System.out.println("bakiyeniz " + bakiye);
        }
    }
    public void parayatırma(double tutar){
        bakiye += tutar;
        System.out.println("bakiyeniz " + bakiye);
    }

}
