package javaDers46_nesne;

public class MainClass {
    public static void main(String[] args) {
            /*

Araba audi = new Araba();  // hetta burdada tezeden qiymet verib yeni iymetle yazma olur

        System.out.println(audi.fiyat);
        System.out.println(audi.maxHiz);
        System.out.println(audi.vites);


       // asagida tezeden yazib deyisdirmek olur

        // ne qeder istesek bu usulla yazib deyisiklik elemek olur


        System.out.println(  );

        Araba toyota= new Araba();
        toyota.fiyat = 12000;
        toyota.maxHiz =220;
        toyota.vites =4;

        System.out.println(toyota.maxHiz);
        System.out.println(toyota.fiyat);
        System.out.println(toyota.vites);

        System.out.println( );

        Araba mersedes = new Araba();

        mersedes.vites =6;
        mersedes.fiyat =65000;
        mersedes.maxHiz = 280;

        System.out.println(mersedes.fiyat);
        System.out.println(mersedes.maxHiz);
        System.out.println(mersedes.vites);
        */
            Bilgiler nesne =new Bilgiler();

            System.out.println(nesne.isim);
            System.out.println(nesne.sayi);
            System.out.println(nesne.ortalama);
            System.out.println(nesne.sonuc);


            nesne.isim ="Tahir";
            nesne.ortalama =0.89f;
            nesne.sayi = 560;
            nesne.sonuc = true;

// nesne. yazib deyisiklik edirik

            System.out.println( );

            System.out.println(nesne.isim);
            System.out.println(nesne.sayi);
            System.out.println(nesne.ortalama);
            System.out.println(nesne.sonuc);

    }

}
