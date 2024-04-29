package Main2;

import java.util.Scanner;

public class Ford extends Car{

    private static int year;
    private static int manufacturerDiscount;

    public double getSalePrice(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("İmalatçı indirimini giriniz:");
        int imalatci = keyboard.nextInt();
        manufacturerDiscount = imalatci;
        double indirim = (regularPrice * manufacturerDiscount) / 100; //indirim yapıldığı kısım
        double salePrice = regularPrice - indirim;
        return salePrice;

    }
    public Ford(int speed, double regularPrice, String color, int year, int manufacturerDiscount){
        super(speed,regularPrice,color);
        this.year = year;
        this.manufacturerDiscount = manufacturerDiscount;


    }



    public static void ozellikler(){       //Özellikleri göstermek için metod
        System.out.println("Arabanın Hızı: " + Ford.speed + "\nArabanın Rengi: " + Ford.color +"\nArabanın Fiyatı: " + Ford.regularPrice + "\nYıl: " + Ford.year + "\nİmalatçı İndirimi: " + Ford.manufacturerDiscount);
    }
}