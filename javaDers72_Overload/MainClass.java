package javaDers72_Overload;

public class MainClass {
    public static void main(String[] args) {

        int sonuc1 = toplama(10,50);
        System.out.println("sonuc1 = "+sonuc1);

        int sonuc2 = toplama(20,5,3);
        System.out.println("sonuc2= "+ sonuc2);

    }

    public static int toplama (int sayi1, int sayi2) {
        return sayi1+sayi2;
    }
    public static int toplama (int sayi1, int sayi2, int sayi3) {
        return sayi1+sayi2+sayi3;
    }
}
