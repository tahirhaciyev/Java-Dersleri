package javaDers73_Interface;

  public class Araba implements Arac, Model {


      @Override
      public void bilgi() {
          System.out.println("Bilgiler..");

      }

      @Override
      public void modelBilgileri() {
          System.out.println("Modeller..");

      }
  }
