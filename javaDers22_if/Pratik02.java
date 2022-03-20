package javaDers22_if;

import java.util.Scanner;

public class Pratik02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Bir gunde kac bardak cay icyorsunuz? ");
        double bardak =input.nextDouble();

        System.out.println("Bir cay bardagina kac tane seker atiyorsunuz? ");
        double seker =input.nextDouble();

        double IllikSekerMiqdari = 365*seker*3/1000;
        double Omur = 60*365*seker*3/1000;

        System.out.println("Illik kac kq seker kullaniyorsunuz ="+ IllikSekerMiqdari);
        System.out.println("Omrunde kac kq seker kullaniyorsun =" + Omur);


    }
}
