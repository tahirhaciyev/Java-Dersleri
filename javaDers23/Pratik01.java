package javaDers23;

import java.util.Scanner;

public class Pratik01 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        System.out.println("Lutfen e-mail adresinizi giriniz :");
        String email = input.next();

        int index  = email.indexOf("@");
        String gmail = email.substring(index+1);

        if (email.contains("@")==false) {
            System.out.println("@ olmadan bir email yazamazsiniz ");
        }
        if (gmail.equals("gmail.com")==false) {
            System.out.println("dogru bir gmail hesabi giriniz ");
        }



        if ( email.contains("@") && email.contains("gmail.com"))
        {
            System.out.println("Dogru gmail formati");
        }



    }
}
