package ders04_Matematiksel_islemler_increment_decrement;

public class C18_Nested_If_Statements {
    public static void main(String[] args) {
        int yas =14;
        char cinsiyet ='K';
        if (yas >= 65){
            System.out.println("emekli oldunuz.");
        } else if (yas < 65 &&  yas >= 60) {
            if (cinsiyet == 'K'){
                System.out.println("emekli oldunuz bayan");
            }else {
                System.out.println("Emekli olmanıza " + (65-yas) + " yil var.");
            }
        } else if (yas < 60 &&  yas >= 15) {
            if(cinsiyet == 'K') {
                System.out.println("Emekli olmanıza " + (60 - yas) + " yil var.");
            }else {
                System.out.println("Emekli olmanıza " + (65 - yas) + " yil var.");
            }
        }else {
            System.out.println("Cocuk isci calistirmak yasak");
        }
    }
}
