package ders04_Matematiksel_islemler_increment_decrement;

import java.util.Scanner;

public class C16_IfElseIf_Statement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Aldınız ürünün adedini giriniz :");
        int adet = scan.nextInt();
        System.out.println("Aldıgınız ürünün liste fiyatını giriniz");
        double fiyat = scan.nextInt();
        System.out.println("Müsteri kartınız var mı ? (EVET yada HAYIR)");
        char kart = scan.next().charAt(0);
        if (kart == 'E' && adet >= 10){
            System.out.println(" % 20 indirim kazandiniz" + " ödemeniz gereken tutar : " + ((adet * fiyat)*0.8));
        } else if (kart == 'E' && adet < 10) {
            System.out.println(" % 15 indirim kazandiniz" + " ödemeniz gereken tutar : " + ((adet * fiyat)*0.85));
        } else if (kart == 'H' && adet >= 10) {
            System.out.println(" % 15 indirim kazandiniz" + " ödemeniz gereken tutar : " + ((adet * fiyat)*0.85));
        }else {
            System.out.println(" % 10 indirim kazandiniz" + " ödemeniz gereken tutar : " + ((adet * fiyat)*0.90));
        }


    }
}
