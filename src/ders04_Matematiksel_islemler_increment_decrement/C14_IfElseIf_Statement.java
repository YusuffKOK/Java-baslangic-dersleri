package ders04_Matematiksel_islemler_increment_decrement;

import java.util.Scanner;

public class C14_IfElseIf_Statement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen yasinizi giriniz :");
        int yas = scan.nextInt();
        System.out.println("Lütfen cinsiyetinizi giriniz (Erkek veya Kadın)");
        char cinsiyet = scan.next().charAt(0);

        if ((cinsiyet!= 'e' && cinsiyet != 'E') && (cinsiyet != 'k' && cinsiyet != 'K')) {
            System.out.println("Yanlıs giris yaptiniz");
        } else if ((cinsiyet == 'e' || cinsiyet == 'E') && yas >= 65){
            System.out.println("Emekli olabilirsiniz Beyefendi");
        } else if ((cinsiyet == 'k' || cinsiyet == 'K') && yas >= 60) {
            System.out.println("Emekli olabilirsiniz Hanımefendi");
        } else if ((cinsiyet == 'e' || cinsiyet == 'E') && yas < 65) {
            System.out.println((65-yas) + " Yıl daha calismaniz gerekiyor");
        } else if ((cinsiyet == 'k' || cinsiyet == 'K') && yas < 60) {
            System.out.println((60-yas) + " Yıl daha calismaniz gerekiyor.");
        }else {
            System.out.println("hatalı giris yaptınız");
        }


    }
}
