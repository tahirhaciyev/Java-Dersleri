package javaDers50_birkacConstructor;

public class MainClass {
    public static void main(String[] args) {

         Araba nesne = new Araba(180,"siyah");
         Araba nesne1 = new Araba(200,"mavi");
        Araba nesne2 = new Araba(250,"sari");


        System.out.println(nesne.hiz);
        System.out.println(nesne.reng);
        System.out.println( );

        System.out.println(nesne1.hiz);
        System.out.println(nesne1.reng);

        System.out.println( );

        System.out.println(nesne2.hiz);
        System.out.println(nesne2.reng);


    }
}
