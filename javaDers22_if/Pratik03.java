package javaDers22_if;

import java.util.Random;

public class Pratik03 {
    public static void main(String[] args) {
        Random rastgeleSayi =new Random();

        int sayi = rastgeleSayi.nextInt(100); // 0,1,2,3,4 her hansi birini rastgele cixarir

        if (sayi < 15) {
            System.out.println("sayi 15 den kicikdir");
        }
        if (sayi > 16 && sayi < 50) {
            System.out.println("Sayi 16 - 50 araligindadir");
        }
        if (sayi > 50 && sayi < 100) {
            System.out.println("sayi 50-100 araligindadir");
        }

    }
}
