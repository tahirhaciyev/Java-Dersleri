package javaDers42_Metodlar;

public class Pratik03 {
    public static void main(String[] args) {

        int[] sayilar = {20, 40, 50};
        int arananSayi= 70;

        kontrol(sayilar,arananSayi);



    }
    public static void kontrol(int[]  array, int arananSayi  ) {

        boolean varmi = false;
        for (int sayi : array) {

            if (sayi == arananSayi) {
                varmi = true;
                break;
            }
        }
        System.out.println("var =" +varmi);

    }

}
