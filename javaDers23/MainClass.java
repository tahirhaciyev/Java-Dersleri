package javaDers23;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        /*
        int ortalama =input.nextInt();
        if (ortalama >45) {
            System.out.println("Dersi kecdiniz ");
        }

        if (ortalama <45) {
            System.out.println("Dersden qaldiniz ");
        }
           */

        System.out.println("Islem seciniz :");
       String secim = input.next();

        System.out.println("Birinci sayiyi daxil edin :");
        int sayi1 = input.nextInt();

        System.out.println("Ikinci sayiyi daxil edin :");
        int sayi2 = input.nextInt();

        if (secim.equals("+")) {
            System.out.println("toplama =" + (sayi1+sayi2));
        }
        if (secim.equals("-")) {
            System.out.println("cixma =" + (sayi1 - sayi2));
        }
        if (secim.equals("*")) {
            System.out.println("vurma =" + (sayi1*sayi2));
        }
        if (secim.equals("/")) {
            System.out.println("bolme =" + (sayi1/sayi2));
        }



    }
}
