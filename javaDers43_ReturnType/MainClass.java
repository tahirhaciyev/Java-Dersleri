package javaDers43_ReturnType;

public class MainClass {
    public static void main(String[] args) {
        bilgiGoster();
        int sonuc= topla(20,30);
        System.out.println(sonuc);

    }

    public static void bilgiGoster() {

        System.out.println("Salam");
        System.out.println("Necesen?");
    }


            public static int  topla( int sayi1, int sayi2 )
            {
        int topla = sayi1 + sayi2;

        return topla;

    }
}