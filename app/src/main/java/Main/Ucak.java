package Main;

import java.util.Scanner;

public class Ucak {
    public static int doluAgirlik;
    public static int bosAgirlik;

    public Ucak(int doluAgirlik,int bosAgirlik) {
        this.doluAgirlik = doluAgirlik;
        this.bosAgirlik = doluAgirlik;


    }
    public static void kaldır(){
        System.out.println("Hangi UAV'den kaldırmak istersiniz?(Silahlı UAV için 1 silahsız UAV için 0 giriniz)");
        Scanner girdi = new Scanner(System.in);
        int b = girdi.nextInt();
        if(b == 1){

                System.out.println("Kara mı hava mı?(hava 1 , kara 0)");
                Scanner girdi3 = new Scanner(System.in);
                int a = girdi3.nextInt();
                if(a == 1){
                    Fuze hava = new Fuze(300,500);
                    System.out.println("Kaç adet füze takmak istersiniz?");
                    Scanner girdi2 = new Scanner(System.in);
                    int c = girdi2.nextInt();
                    if(bosAgirlik+c*Fuze.getKilogram()<=3800){
                        System.out.println("Kalkış gerçekleşti");

                    }else{
                        System.out.println("Kalkış gerçekleşemedi ağırlık sınırı aşıldı");
                    }

                }
                if(a == 0){
                    Fuze kara = new Fuze(450,250);
                    System.out.println("Kaç adet füze takmak istersiniz?");
                    Scanner girdi2 = new Scanner(System.in);
                    int c = girdi2.nextInt();
                    if(bosAgirlik+c*Fuze.getKilogram()<=3800){
                        System.out.println("Kalkış gerçekleşti");

                    }else{
                        System.out.println("Kalkış gerçekleşemedi ağırlık sınırı aşıldı");
                    }

                }


            System.out.println("Kaç adet füze takmak istersiniz?");
            Scanner girdi2 = new Scanner(System.in);
            int c = girdi2.nextInt();
            if(bosAgirlik+c*Fuze.getKilogram()<=3800){
                System.out.println("Kalkış gerçekleşti");

            }else{
                System.out.println("Kalkış gerçekleşemedi ağırlık sınırı aşıldı");
            }

        }
        if(b==0){
            System.out.println("Kalkış gerçekleşti!! Silahsız UAV'niz şuan havada");
        }
    }
}
