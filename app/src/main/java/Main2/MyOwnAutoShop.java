package Main2;

import java.util.Scanner;

public class MyOwnAutoShop {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);


        System.out.println(" 1-Car 2-Kamyon 3-Sedan 4-Ford 5-Cıkış ");


        int cikis = 0;
        while (cikis == 0) {
            System.out.println("Bilgilerini öğrenmek istediğiniz araba türünü  seçiniz:");
            Scanner girdi = new Scanner(System.in);
            int a = girdi.nextInt();
            if (a == 1) {

                Car araba = new Car(300, 250000, "Gri");
                System.out.println("Satış Fiyatı: " + araba.getSalePrice());
                araba.bilgileri_goster();
            } else if (a == 2) {
                System.out.println("Ağırlık Giriniz: (Ağırlık > 2000, %10 indirim. Aksi takdirde %20 indirim)");
                Scanner girdi2 = new Scanner(System.in);
                int agirlik = girdi2.nextInt();

                Truck kamyon = new Truck(130, 180000, "Siyah", agirlik);
                System.out.println("Kamyon Arabanın Satış Fiyatı: " + kamyon.getSalePrice());
                kamyon.ozellikler();
            } else if (a == 3) {
                Sedan sedan = new Sedan(250, 200000, "beyaz", 6);
                System.out.println("Sedan Arabanın Satış Fiyatı: " + sedan.getSalePrice());
                sedan.ozellikler();
            } else if (a == 4) {
                Ford ford = new Ford(150, 195000, "Mavi", 6, 50);
                System.out.println("Ford Arabanın Satış Fiyatı: " + ford.getSalePrice());
                ford.ozellikler();
            } else if (a == 5) {

                cikis = 5;
            } else {
                System.out.println("Lütfen menüden istediğiniz sayıyı giriniz!");
            }

        }

    }
    }