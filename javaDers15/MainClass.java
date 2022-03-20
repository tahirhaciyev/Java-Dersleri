package javaDers15;

public class MainClass {
    public static void main(String[] args) {

        String isim = "Tahir" ;
        String soyIsim = "Haciyev" ;
        String bosluk =" ";

        String adSoyad =isim.concat(bosluk).concat(soyIsim);
        System.out.println(adSoyad);

        String isim2 = "Aslan";
        String soyIsim2 = "Haciyev";

        String adSoyad2 = isim2.concat(bosluk).concat(soyIsim2);
        System.out.println(adSoyad2);


       /* String isim = "Tahir" ;
        String soyIsim = "Haciyev" ;

        String adSoyad = isim + " " + soyIsim;

        System.out.println(adSoyad);
        System.out.println(adSoyad.length());

        String bilgi = "Benim ismim " +isim + " ve SoyIsmim " + soyIsim;
        System.out.println(bilgi);
*/
    }
}
