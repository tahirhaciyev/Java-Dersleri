package javaDers65_Get_Set;

public class Ogretmen {

    private int yas = 20;
    private String isim ="Esma";
    private long kimlikNo= 2365478;

    public int getYas() {
        return  yas;
    }


    void setYas(int yas) {
        if( yas < 18){
            this.yas= 18;
        } else
            this.yas= yas;
    }
    public String getIsim() {
        return isim;
    }


}
