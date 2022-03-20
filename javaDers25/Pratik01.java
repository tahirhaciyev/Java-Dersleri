package javaDers25;

import java.util.Scanner;

public class Pratik01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Bu gun hansi gundur? ");

        String gun = input.next();

        if (gun.equalsIgnoreCase("cumaertesi ") || gun.equalsIgnoreCase("pazar")) {
            System.out.println("Heftesonudur ");
        } else

        {
            System.out.println("Hefte ici ");
        }


    }
}