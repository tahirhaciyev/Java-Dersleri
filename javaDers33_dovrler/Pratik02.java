package javaDers33_dovrler;

public class Pratik02 {
    public static void main(String[] args) {

        int toplam =0;
        int sayi=1336987458;
        int basamak =0;

        while (sayi> 0) {
            basamak = sayi % 10;
            toplam += basamak;
            sayi /=10 ;

        }

        System.out.println("toplam= " +toplam);



    }
}
