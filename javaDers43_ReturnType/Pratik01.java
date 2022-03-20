package javaDers43_ReturnType;

public class Pratik01 {
    public static void main(String[] args) {
       int cem= toplam(30,40) ;
       int ferq = cixma(70,10);
       int hasil =vurma(15,30);
       double bol = bolme(80,30);
        System.out.println("cem= "+cem);
        System.out.println(ferq);
        System.out.println(hasil);
        System.out.println(bol);

    }
    public static int toplam (int sayi1,int sayi2) {
        int toplam = sayi1+sayi2;
        return  toplam;
    }
    public static int cixma (int sayi1,int sayi2) {
        int cixma = sayi1-sayi2;
        return  cixma;
    }
    public static int vurma (int sayi1,int sayi2) {
        int vurma = sayi1*sayi2;
        return  vurma;
    }
    public static int bolme (int sayi1,int sayi2) {
        int bolme = sayi1/sayi2;
        return  bolme;
    }


}
