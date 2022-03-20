package javaDers91_Map;


import java.util.HashMap;

public class MainClass {
    public static void main(String[] args) {

        HashMap liste = new HashMap();

        liste.put("Esma",75);
        liste.put("Omer",80);
        liste.put("Eli",100);

        System.out.println(liste);
        System.out.println(liste.containsKey("Eli")); // anahtarin oldugu kontrol edilir
        System.out.println(liste.containsValue(80)); // deyerin varligi kontrol edilir
        System.out.println("Entry set ="+ liste.entrySet());

        System.out.println(liste.size());






    }
}
