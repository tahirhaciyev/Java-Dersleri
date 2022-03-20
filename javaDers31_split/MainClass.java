package javaDers31_split;

import java.util.Arrays;

public class MainClass {
    public static void main(String[] args) {



      /* String  diller = "Azerbaycanca, Turkce , Ingilisce , Rusca  , Fransizca" ;

      String [] array= diller.split(",") ;
       // System.out.println(Arrays.toString(array));

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);

        System.out.println(array.length);
*/

    /*
        String ifade = "Ben Javayi seviyorum" ;

        String [] array = ifade.split("Javayi");

        System.out.println(array.length);
        System.out.println(array[0]);
        System.out.println(array[1]);
    */
   String metin ="Bu gun cuma. Iyi gunler. Kendine iyi bak." ;

   String []  cumleler = metin.split("\\ ."); //ozel karakter olduqda " 2 \\ "  istifade olunur

        System.out.println(cumleler.length);
        System.out.println(cumleler[0]);
        System.out.println(cumleler[1]);

    }
}
