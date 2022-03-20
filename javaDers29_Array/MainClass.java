package javaDers29_Array;

import java.util.Arrays;

public class MainClass {
    public static void main(String[] args) {

        // 1. yontem

        String [] array = new  String[5];

        array[0] ="Tahir" ;
        array[1] ="Leyla" ;
        array[2] ="Esma";
        array[3] = "Memmed" ;
        array[4] ="Cefer" ;


        // 2. yontem
        String [] isimler = {"Tahir", "Leyla", "Esma", "Memmed", "Cefer"} ;
        int[] sayilar = {1,2,3,4,5};

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(isimler));
        System.out.println(Arrays.toString(sayilar));


    }
}
