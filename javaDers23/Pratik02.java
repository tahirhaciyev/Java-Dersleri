package javaDers23;

import java.util.Scanner;

public class Pratik02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // sayina gore endirim tetbiq edilen program yazaq

        System.out.println("Urun fiyati giriniz :");
        float fiyat = input.nextFloat();

        System.out.println("Urun miktari giriniz :");
        float miktar = input.nextFloat();

        float normalFiyat = miktar*fiyat;
        float indirimliFiyat =0.0f;

        if (miktar < 11) {
            indirimliFiyat = normalFiyat*90/100;
        }
        if (miktar >10 && miktar < 51) {
            indirimliFiyat = normalFiyat *80/100;
             }
        if (miktar > 50) {
            indirimliFiyat = normalFiyat * 75/100;
        }
        System.out.println("normal fiyat =" + normalFiyat);
        System.out.println("indirimliFiyat = " + indirimliFiyat);

    }
}