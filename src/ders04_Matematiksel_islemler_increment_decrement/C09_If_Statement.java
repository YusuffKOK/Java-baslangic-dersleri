package ders04_Matematiksel_islemler_increment_decrement;

import java.util.Locale;
import java.util.Scanner;

public class C09_If_Statement {
    public static void main(String[] args) {
        /* Scanner scan = new Scanner(System.in);
       System.out.println("Lütfen bir tam sayi giriniz :");
        int sayi = scan.nextInt();

        if ((sayi % 5) == 0){
            System.out.println("sayi 5 in kati");
        } */
        // Ocak Şubat Mart Nisan Mayıs Haziran Temmuz Agustos Eylül Ekim Kasım Aralık
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen ay isminin ilk harfini giriniz :");
        char harf = scan.next().charAt(0);
        if (harf == 'o' || harf == 'O') {
            System.out.println("Ocak");
        }
        if (harf == 's' || harf == 'S') {
            System.out.println("Subat");
        }
        if (harf == 'm' || harf == 'M') {
            System.out.println("Mart veya Mayıs");
        }
        if (harf == 'n' || harf == 'N') {
            System.out.println("Nisan");
        }
        if (harf == 'h' || harf == 'H') {
            System.out.println("Haziran");
        }
        if (harf == 't' || harf == 'T') {
            System.out.println("Temmuz");
        }
        if (harf == 'a' || harf == 'A') {
            System.out.println("Agustos veya Aralık");
        }
        if (harf == 'e' || harf == 'E') {
            System.out.println("Eylül veya Ekim");
        }
        if (harf == 'k' || harf == 'K') {
            System.out.println("Kasım");
        }








    }
}
