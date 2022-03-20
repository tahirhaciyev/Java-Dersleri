package javaDers26;

import java.util.Scanner;

public class Pratik05 {
    public static void main(String[] args) {
        Scanner inport = new Scanner(System.in);

        System.out.println("1. sayiyi giriniz");
        int s1 =inport.nextInt();

        System.out.println("2. sayiyi giriniz ");
        int s2 =inport.nextInt();

        System.out.println("3. sayiyi giriniz ");
        int s3 =inport.nextInt();

        if (s1 >= s2 && s1 >= s3) {
            System.out.println("1. sayi en boyukdur ="+ s1);
        } else  if (s2 >= s1 && s2 >= s3) {
            System.out.println(" 2. sayi en boyuk ="+ s2);
        } else  {
            System.out.println("3. sayi en boyukdur ="+ s3);
        }



    }
}
