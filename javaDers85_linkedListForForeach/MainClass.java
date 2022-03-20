package javaDers85_linkedListForForeach;

import java.util.LinkedList;

public class MainClass {
    public static void main(String[] args) {
        LinkedList<String> liste = new LinkedList<>();

        liste.add("Esma");
liste.add("Tahir");
liste.add("Omer");
liste.add("Eli");

for (int i=0; i< liste.size(); i++) {

    System.out.println(liste.get(i));
}

        System.out.println( );

        for (String  isim : liste ) {
            System.out.println(isim);

        }

    }

}
