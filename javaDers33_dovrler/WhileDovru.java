package javaDers33_dovrler;

import java.util.Arrays;

public class WhileDovru {
    public static void main(String[] args) {

        // sade hal
        int sayi =1;

        while (sayi < 10) {

            System.out.println("Salam");
            sayi++;
        }
        System.out.println("Necesen? ");


           //
        String [] isimler ={"Asif", "Vahide", "Tahir", "Aslan","Sayad","Esma" } ;

        int index =0;

        while (index < isimler.length)
        {
            if (isimler[index].equals("Esma") ) {
                System.out.println("Arrayda Esma adi var");
            }

         index++;

        }

    }
}
