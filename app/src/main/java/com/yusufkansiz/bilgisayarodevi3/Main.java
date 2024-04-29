package com.yusufkansiz.bilgisayarodevi3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Sarjor sarjor = new Sarjor(10,10);
        Silah silah = new Silah(10,10,10);


        System.out.println("Menzil giriniz:");
        Scanner girdi = new Scanner(System.in);
        int a = girdi.nextInt();                   // Burada menzil girdisi alıp silahı ateşliyoruz ve dolduruyoruz
        System.out.println("Hedef vuruldu");
        silah.menzil = a;
        silah.atıs(silah.menzil);
        System.out.println("Şarjör dolduruldu");
        sarjor.doldur();
        Otomatik otomatik = new Otomatik(5);
        System.out.println("Otomatik silahtaki mermi sayınız:"+100);
        System.out.println("Otomatik silah ateşlendi");
        System.out.println(otomatik.mermiSik());
    }
}
