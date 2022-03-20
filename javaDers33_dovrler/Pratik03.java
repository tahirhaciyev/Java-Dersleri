package javaDers33_dovrler;

public class Pratik03 {
    public static void main(String[] args) {

        int [] array ={20,30,40,50,60,8,5,6,90,40};
        int uzunluk = array.length;

        int sira =0;
  int  toplam = 0;
        while (sira < uzunluk) {
toplam+= array[sira];
            sira++;
        }
        System.out.println(toplam);

    }
}
