package com.yusufkansiz.bilgisayarodevi3;



public class Sarjor {

    static int mermikapasitesi;
    static int mermisayisi;


    public Sarjor(int mermikapasitesi,int mermisayisi) {
        this.mermikapasitesi = mermikapasitesi;
        this.mermisayisi =mermisayisi;
    }

    public static void doldur(){
        mermisayisi++;      //Mermi doldurduğumuz kısım

        System.out.println("mermi sayınız :"+ mermisayisi);
    }



    public static int Mermiat(){
        mermisayisi  = mermisayisi-1;            //Mermi attığımız kısım
            System.out.println("Kalan mermi:"+mermisayisi);
        return mermisayisi;



    }

    public static int getMermikapasitesi() {
        return mermikapasitesi;
    }

    public static void setMermikapasitesi(int mermikapasitesi) {
        Sarjor.mermikapasitesi = mermikapasitesi;
    }

    public static int getMermisayisi() {
        return mermisayisi;
    }

    public static void setMermisayisi(int mermisayisi) {
        Sarjor.mermisayisi = mermisayisi;
    }
}
