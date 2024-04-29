package com.yusufkansiz.bilgisayarodevi3;



public class Silah extends Sarjor{
    public static int menzil;

    public Silah(int menzil,int mermikapasitesi,int mermisayisi) { //silahın özellikleri
        super(mermikapasitesi,mermisayisi);
        this.menzil = menzil;



    }
    public static void atıs(int menzil){


        Sarjor.Mermiat();



    }










































































 /*   public Silah(int etkinmenzil) {
        this.etkinmenzil = etkinmenzil;
    }
    public static void Menzil(int etkinmenzil){
        System.out.println( "Menzil:"+etkinmenzil);
    }

    int etkinmenzil;
    public static void sarjor2(){
    Sarjor silah = new Sarjor(3,2);
    }
    public static int doldur(){
        int a =Sarjor.mermikapasitesi;

        return mermisayisi=a;
    }
    public static void main(String args[]){
        System.out.println("Menzil giriniz:");
        Scanner girdi = new Scanner(System.in);
        int menzil = girdi.nextInt();
        Menzil(menzil);
        Silah.sarjor2();
        doldur();



    }
*/
}
