package javaDers52_constructorZiciri;

public class Araba {

    public  Araba() {
        this (200);
        System.out.println("Defolt");

            }

            public  Araba( int hiz) {
        this(180,"Mavi");
                System.out.println("Tekli");

            }

            public  Araba(int hiz, String reng) {
                System.out.println("Ilkili");

            }

}
