package javaDers27_ternary;

public class DersNotu {
    public static void main(String[] args) {
        int vizanotu = 86;
        int finalnotu =89;
        int ortalama = vizanotu * 40 /100 + finalnotu * 60 / 100 ;

        String herfNotu = ortalama < 50 ? "FF" : ortalama < 75 ? "CC" : ortalama < 90 ? " BB" : "AA" ;

        System.out.println(herfNotu);

    }
}
