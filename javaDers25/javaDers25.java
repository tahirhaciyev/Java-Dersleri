package javaDers25;

public class javaDers25 {
    public static void main(String[] args) {

        /*
        int sayi =20;

        if (sayi > 50) {

            System.out.println(" sayi 50 den boyukdur");
        } else {
            System.out.println(" sayi 50 den kicikdir");

        } */

        String cinsiyyet = "Kisi";
        int yas = 25;

        if (cinsiyyet.equals("Kisi")) {
            System.out.println("Cinsiyyetiniz kisidir ");
            if (yas >= 20) {
                System.out.println("Askerliye gede bilersen");
            } else {
                System.out.println("Yasin hele yeterli deyil ");
            }
        }
            else {
                System.out.println("Cinsiyyetiniz qadindir buna gore askere gidemezsiniz");
            }

    }
}