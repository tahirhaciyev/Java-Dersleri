package javaDers42_Metodlar;

public class Pratik02 {
    /* iki sayini toplayan metod ve uc sayini toplayan metod yazin
         */

    public static void main(String[] args) {
        toplama(50,90);
        toplama(50,60,70);

    }

    public static void toplama(double sayi1, double sayi2) {
        double toplam = sayi1+sayi2;
        System.out.println("Iki sayinin toplami =" + toplam);
    }

    public static void toplama (double sayi1, double sayi2, double sayi3) {
        double toplam = sayi1+sayi2+sayi3;
        System.out.println("Uc sayinin toplami =" + toplam);
    }


}
