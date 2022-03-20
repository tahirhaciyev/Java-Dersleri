package javaDers38_typeCasting;

public class MainClass {
    public static void main(String[] args) {

        /*byte -8 bit
          short -16 bit
          int -32 bit
          long -64 bit
          float -32 bit
          double -64 bit

         */

        byte sayi1 = 100;
        int  sayi2 = 50;

         sayi1 = (byte) sayi2;

        System.out.println(sayi1);


        int sayi3 = 250;
        long sayi4 =600;
        sayi4 = sayi3;

        System.out.println(sayi4);







    }
}
