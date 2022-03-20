package javaDers78_ArrayList;

import java.util.ArrayList;

public class MainClass {
    public static void main(String[] args) {

        ArrayList isimler = new ArrayList();

        isimler.add("Esma");  // veri eklemek ucundur
        isimler.add("Omer");
        isimler.add("Eli");

        System.out.println(isimler);

        System.out.println(isimler.get(2)); // istediyimiz index get() metodu ile tapiriq
        System.out.println(isimler.size());


        boolean varmi =isimler.contains("Esma");  // verilen datanin olub olmadigini yazdirir
        System.out.println(varmi);




        isimler.remove(1); // verileri silmek ucun istifade edilir
        System.out.println(isimler);

        System.out.println(isimler.get(1));


        System.out.println(isimler.size()); // kac tane varsa gosterir

        isimler.clear(); //butun elemanlari listeden temizleyir


        System.out.println(isimler);





    }
}
