package javaDers22_if;

public class IfDersi {
    public static void main(String[] args) {

        // task 1
       String diller = "Azerbaycanca, Ingilizce, Fransizca, Almanca" ;

       if (diller.contains("Turkce")) {

           System.out.println("Turkce bilyorsunuz");
       }
       if (diller.contains("Ingilizce")) {
           System.out.println("Ingilizce bilyorsunuz");
       }
       // task 2
        String cinsiyyet ="Erkek" ;
       int   yas =25;

       if (yas >=18 && cinsiyyet.equals("Erkek") ) {
           System.out.println("Askere gide bilirsiniz ");
           System.out.println("cinsiyyet :"+ cinsiyyet);
           System.out.println("yas :"+ yas);
          }






    }
}
