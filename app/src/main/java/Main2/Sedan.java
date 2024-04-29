package Main2;

import java.util.Scanner;

public class Sedan  extends Car{

    private static int lenght;

    public Sedan(int speed, double regularPrice, String color, int lenght){
        super(speed,regularPrice,color);
        this.lenght = lenght;
    }

    public double getSalePrice(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Arabanın uzunluğunu giriniz: (Uzunluk > 6 metre, %5 indirim. Aksi takdirde %10 indirim)");
        int uzunluk = keyboard.nextInt();
        this.lenght = uzunluk;

        if(lenght > 6){
            double indirim = (regularPrice * 5) / 100;
            double salePrice = regularPrice - indirim;
            return salePrice;
        }
        else{
            double indirim = (regularPrice * 10) / 100;
            double salePrice = regularPrice - indirim;
            return salePrice;

        }

    }

    public static void ozellikler(){
        System.out.println("Arabanın Hızı: " + Sedan.speed + "\nArabanın Rengi: " + Sedan.color + "\nArabanın Fiyatı: " + Sedan.regularPrice+  "\nArabanın Uzunluğu: " + Sedan.lenght);
    }
}
