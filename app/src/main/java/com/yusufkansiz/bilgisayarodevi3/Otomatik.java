package com.yusufkansiz.bilgisayarodevi3;

public class Otomatik extends Silah{
    public static int atışyap;
    public Otomatik(int atışyap ) {
        super(menzil,mermikapasitesi,mermisayisi);
        this.atışyap = atışyap;


    }

    public static int mermiSik(){ //Sarjör sınıfını kullanıp mermi atışı yaptırıyoruz
        Sarjor sarjor2 =new Sarjor(100,100);
        mermisayisi  = mermisayisi-5;
       return sarjor2.Mermiat();

    }
}
