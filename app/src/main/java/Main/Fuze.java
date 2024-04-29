package Main;


public class  Fuze {
    public static int kilogram;
    public static int menzil;

    public Fuze(int kilogram,int menzil) {
        this.kilogram=kilogram;
        this.menzil = menzil;

                                              //Burada füzenin cinsine göre özelliklerini oluşturduk.
    }

    public static int getKilogram() {
        return kilogram;
    }

    public static void setKilogram(int kilogram) {
        Fuze.kilogram = kilogram;
    }


}
