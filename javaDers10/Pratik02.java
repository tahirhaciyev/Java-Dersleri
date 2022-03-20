package javaDers10;

public class Pratik02 {
    public static void main(String[] args) {
        int sayi= 25;

        boolean sonuc1  = sayi> 0 && sayi <50 ; // (0,50) true
        boolean sonuc2 = sayi>= 50 && sayi < 100 ;  // (50,100)  false

        boolean sonuc3  = sayi> 0 && sayi <50 && sayi %2 == 0; // (0,50) ve cut  false
        boolean sonuc4  = sayi>= 50 && sayi < 100 && sayi %2 == 0 ; // (50,100) cut false


        boolean sonuc5  = sayi> 0 && sayi < 50 && sayi %2 == 1 ; //  (0,50) tek true
        boolean sonuc6  = sayi>= 50 && sayi < 100 && sayi %2 == 1; // (50,100) tek false


        System.out.println(sonuc1);
        System.out.println(sonuc2);
        System.out.println(sonuc3);
        System.out.println(sonuc4);
        System.out.println(sonuc5);
        System.out.println(sonuc6);
    }
}
