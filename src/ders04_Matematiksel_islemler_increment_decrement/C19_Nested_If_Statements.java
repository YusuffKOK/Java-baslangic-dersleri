package ders04_Matematiksel_islemler_increment_decrement;

public class C19_Nested_If_Statements {
    public static void main(String[] args) {
        char kart = 'H';
        int adet = 8;
        double fiyat = 12.5;
        if (kart == 'E'){
            if(adet >= 10){
                System.out.println(" % 20 indirim kazandınız " + " ödemeniz gereken tutar : " + ((adet*fiyat)*0.8));
            }else {
                System.out.println(" % 15 indirim kazandınız " + " ödemeniz gereken tutar : " + ((adet*fiyat)*0.85));
            }

        }else {
            if(adet >= 10){
                System.out.println(" % 15 indirim kazandınız " + " ödemeniz gereken tutar : " + ((adet*fiyat)*0.85));
            }else {
                System.out.println(" % 10 indirim kazandınız " + " ödemeniz gereken tutar : " + ((adet*fiyat)*0.90));
            }
        }
    }
}
