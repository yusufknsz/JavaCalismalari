package Main2;

public class Truck extends Car{
    public static int weight;
    public Truck(int speed, double regularPrice, String color,int weight) {
        super(speed, regularPrice, color);
        this.weight =weight;
    }


    public double getSalePrice(){


        if (weight > 2000){
            double indirim = regularPrice * 10 / 100;
            double salePrice = regularPrice - indirim;
            return salePrice;
        }
        else{
            double indirim = regularPrice * 20 / 100;
            double salePrice = regularPrice - indirim;
            return salePrice;

        }

    }
    public static void ozellikler(){
        System.out.println("Arabanın Hızı: " + Truck.speed + "\nArabanın Rengi: " + Truck.color +"\nArabanın Fiyatı: " + Truck.regularPrice + "\nArabanın Ağırlığı: " + Truck.weight);
    }

}
