package javaDers21;

import java.util.Scanner;

public class Pratik04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Viza balinizi girin :");
        double vize = input.nextDouble();

        System.out.println("Final balinizi girin :");
        double  final1 = input.nextDouble();

        double notOrtalamasi =vize*40/100 + final1*60/100;

        System.out.println("Not ortalamaniz ="+ notOrtalamasi);



    }

}
