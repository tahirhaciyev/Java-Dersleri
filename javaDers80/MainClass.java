package javaDers80;

import java.util.ArrayList;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        List<String> liste= new ArrayList<>();

        liste.add("Esma");
        liste.add("Eli");
        liste.add("Omer");

        liste.add(0,"Ayse");
        liste.add(2,"Memmed");

        liste.remove(2);


        System.out.println(liste);




    }
}
