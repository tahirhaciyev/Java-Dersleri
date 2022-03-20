package javaDers39_wrapperClasslar;

public class Parslar {
    public static void main(String[] args) {

        /*
        int sayi1    = 5;
        Integer sayi2= new Integer(40);

        System.out.println(sayi2);

         */

        /*
      int maxSayi=  Integer.max(50,100);
        System.out.println(maxSayi);
         */

        /*
        String yas ="50" ; // text tamsayiya cevire bilirik. Wrapper metodu ile
        int yasTamsayi= Integer.parseInt(yas);
        System.out.println(yasTamsayi);
         */

        String sonuc = "false"; // text diger claslara cevire bilirik
        boolean sonucBoolean = Boolean.parseBoolean(sonuc);

        System.out.println(sonucBoolean);


        int sayi=60;

        String yazi = ""+ 60;

        System.out.println(yazi);

    }
}
