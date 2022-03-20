package javaDers28_SvitchCase;

import java.util.Scanner;

public class Pratik02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Birinci sayini girin ");
        int s1= input.nextInt();

        System.out.println("Ikinci sayini girin");
        int s2= input.nextInt();

        System.out.println("Emel secin \n1 : toplama \n2 : cixma \n3 : vurma \n4 : bolme");
        int secim = input.nextInt();

        switch (secim) {
            case 1 : {
                System.out.println("Toplama= "+ (s1+s2));
                break;
            }
               case 2: {
                    System.out.println("Cixma= " + (s1 - s2));
                    break;
                }
                case 3: {
                    System.out.println("Vurma= " + (s1 * s2));
                    break;
                }

                case 4: {
                    System.out.println("Bolme= " + (s1 / s2));
                    break;
                }
            default: {
                System.out.println("Duz deyil");
                break;
            }

            }


    }
}
