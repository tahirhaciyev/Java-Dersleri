package javaDers21;

import java.util.Scanner;

public class Pratik02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 2 sayini scannerden alaraq 4 islem yapan program yazmaq

        System.out.println("Birinci sayiyi giriniz :");
        int  sayi1 =input.nextInt();

        System.out.println("Ikinci sayiyi giriniz :");
        int sayi2= input.nextInt();


        int toplama =sayi1 + sayi2;
        int cikma = sayi1 - sayi2;
        int vurma = sayi1 * sayi2;
        int bolme = sayi1 / sayi2;

        System.out.println("toplama ="+ toplama);
        System.out.println("cikma ="+ cikma);
        System.out.println("vurma ="+ vurma);
        System.out.println("bolme ="+ bolme);



    }
}
