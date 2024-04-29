package Main2;

public class Car {
    public static int speed;
    public static double regularPrice;
    public static String color;

    public double getSalePrice(){
        return regularPrice;
    }

    public Car(int speed, double regularPrice, String color){
        this.speed = speed;
        this.regularPrice = regularPrice;
        this.color = color;
    }


    public static void bilgileri_goster(){
        System.out.println("Arabanın Hızı: " + Car.speed + "\nArabanın Rengi: " + Car.color);
    }


}

