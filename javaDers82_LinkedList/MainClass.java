package javaDers82_LinkedList;

import java.util.LinkedList;

public class MainClass {
    public static void main(String[] args) {
        LinkedList liste =new LinkedList<>();

        liste.add("Esma");
        liste.add("Eli");
        liste.add("Ayse");
        liste.addFirst("Ahmed");
        liste.addLast("Memmed");

        System.out.println(liste);
        liste.remove(0);

        System.out.println(liste);

        System.out.println(  liste.getLast());
        System.out.println(liste.get(0));
        System.out.println(liste.contains("Esma")); // sorusulan elemanin olub olmadigini yoxlamaq ucundur


        System.out.println("Eleman sayisi = "+ liste.size()); //eleman sayisini gosterir


    }

}
