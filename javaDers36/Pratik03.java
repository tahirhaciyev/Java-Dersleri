package javaDers36;

public class Pratik03 {
    public static void main(String[] args) {

      /*  System.out.println(Math.sqrt(4)); // kvadrat jojunu alir
        System.out.println(Math.sin(30) );

*/

        int sayi = 9;
        double karekok = 1;

        for (double i = 1.00; i * i <= 9; i += 0.01) {

            karekok = i;
        }

        System.out.println(karekok);


    }
}
