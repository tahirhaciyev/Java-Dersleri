package javaDers41_metodlar;

public class MainClass {
    public static void main(String[] args) {

        /* Metodlarin meqsedi alt programlara bolmekdir.

         */
        System.out.println(arrayToplam(new int[] {10, 20, 30, 40, 50}));
        System.out.println(arrayToplam(new  int[] {100,200,300}));


    }
        public static  int arrayToplam (int[] sayiar) {

            int toplam =0;

            for (int sayi: sayiar ) {
                toplam+=sayi;
            }
            return toplam;
        }



}
