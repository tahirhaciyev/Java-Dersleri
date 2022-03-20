package javaDers21;

import java.util.Scanner;

public class Pratik01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("byte :");
        byte deger1 = input.nextByte();

        System.out.println("short :");
        short deger2 = input.nextShort();

        System.out.println("int :");
        int deger3 = input.nextInt();


        System.out.println("long :");
        long deger4 = input.nextLong();

        System.out.println("float :");
        float deger5 = input.nextFloat();

        System.out.println("double :");
        double deger6 = input.nextDouble();

        System.out.println("boolean :");
        boolean deger7 = input.nextBoolean();

        System.out.println("char :");
        char deger8 = input.next().charAt(2);



        System.out.println("byte :"+deger1);
        System.out.println("short :"+deger2);
        System.out.println("int :"+deger3);
        System.out.println("long :"+deger4);
        System.out.println("float :"+deger5);
        System.out.println("double :"+deger6);
        System.out.println("boolean :"+deger7);
        System.out.println("char :"+deger8);



    }
}
