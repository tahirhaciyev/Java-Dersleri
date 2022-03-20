package javaDers22_if;

import java.util.Scanner;

public class Pratik01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Boyunuzu daxil edin :");
       double boy = input.nextDouble();

        System.out.println("Kilonuzu daxil edin :");
       double kilo=  input.nextDouble();

       double vke = kilo/(boy*boy);

        if (vke <=18 )  {

            System.out.println("Zeifsiniz bir az yemek yeyin " + vke);
        }
        if (vke >18 && vke <25 ) {
            System.out.println("Ideal kilodasiniz "+ vke);

        }

        if ( vke > 25 && vke <30 )
        {
            System.out.println(" Biraz egzersiz yapmalisiniz" +vke);
        }

        if (vke > 30) {
            System.out.println(" Toppussunuz ariqlamaniz lazimdir "+ vke);
        }

    }
}
