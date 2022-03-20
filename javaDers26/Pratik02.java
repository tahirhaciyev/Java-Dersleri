package javaDers26;

import java.util.Scanner;

public class Pratik02 {
    public static void main(String[] args) {
        Scanner inport = new Scanner(System.in);

        System.out.println("Masininiz varmi? (true/false)");
        boolean masin = inport.nextBoolean();

        System.out.println("Hava yagislidir? (true/false)");
        boolean yagmur = inport.nextBoolean();


        if (masin) {
            if (yagmur){
                System.out.println("cetire ehtiyac yoxdur ama yagis var");
            } else {
                System.out.println("cetire ehtiyac yoxdur, cunki yagis yagmir");
            }
        } else {
            if (yagmur) {

                System.out.println("cetire ehtiyacin var. ");
            } else {
                System.out.println("ceire ehtiyacin yoxdur");
            }
        }




    }
}
