package javaDers18;

public class MainClass {
    public static void main(String[] args) {

        String diller ="ingilisce ,  fransizca , almanca , ispanyolca " ;

        System.out.println(diller.replace("almanca", "arapca"));

        String bilgi = "Ben Java'yi sevmiyorum!" ;

        System.out.println(bilgi);

        System.out.println(bilgi.replace("sevmiyorum", "seviyorum"));

        String dil1 = diller.substring(0,9);

        System.out.println(dil1); // 0-dan 9-a qeder yazir

        System.out.println(diller.substring(5)); // 5 ciden baslayaraq sona qeder yazdirir


    }
}
