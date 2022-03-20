package javaDers26;

import java.util.Scanner;

public class Pratik04 {
    public static void main(String[] args) {
        Scanner inport = new Scanner(System.in);

        System.out.println("Birinci sayiyi giriniz ");
        int s1 =inport.nextInt();

        System.out.println("Ikinci sayiyi giriniz ");
        int s2 = inport.nextInt();

        if (s1 > s2) {
            System.out.println("Birinci sayi ikinciden boyukdur");
        } else if (s1==s2) {
            System.out.println("sayilar beraberdir ");
        } else {
            System.out.println("Ikinci sayi boyukdur");
        }

    }
    }
