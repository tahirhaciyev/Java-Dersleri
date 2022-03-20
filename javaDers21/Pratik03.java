package javaDers21;

import java.util.Scanner;

public class Pratik03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Kullanicidan aldigimiz gunde kac saat uyuyorsun bilgisi uzerine toplam uykuda kecen sureleri yazdirin

        System.out.println(" Gunde kac saat uyuyorsun? ");
        int saat = input.nextInt();

        int hefte = 7*saat/24;
        int ay = 30*saat/24;
        int il = 365*saat/24;
        int omur = 60*365*saat/24;

        System.out.println("Heftede "+ hefte+ " gununuz uykuda kecir");
        System.out.println("Ay "+ ay+ " gununuz uykuda kecir");
        System.out.println("Ilde "+ il+ " gununuz uykuda kecir");
        System.out.println(" 60 illik Omrunuzde "+ omur+ " gununuz uykuda kecir");






    }
}
