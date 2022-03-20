package javaDers26;

import java.util.Scanner;

public class IfelseIfelse {
    public static void main(String[] args) {
        Scanner inport = new Scanner(System.in);

        System.out.println("Eni daxil edin ");
        double eni = inport.nextDouble();

        System.out.println("Uzunlugu daxil edin");
        double uzunluq = inport.nextDouble();

        if (eni == uzunluq) {
            System.out.println("Kvadratdir ");

        } else {
            System.out.println("Duzbucaqlidir");
        }

    }
}
