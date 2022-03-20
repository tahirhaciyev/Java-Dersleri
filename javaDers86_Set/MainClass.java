package javaDers86_Set;

import java.util.HashSet;

public class MainClass {
    public static void main(String[] args) {
        HashSet liste = new HashSet();

        liste.add("Esma");
        liste.add(100);
        liste.add("Omer");
        liste.add(false);
        liste.add("Eli");

        System.out.println(liste);

        System.out.println(liste.contains("Tahir"));



    }
}
