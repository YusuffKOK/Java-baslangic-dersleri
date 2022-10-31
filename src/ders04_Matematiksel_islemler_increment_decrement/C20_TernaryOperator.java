package ders04_Matematiksel_islemler_increment_decrement;

import java.util.Scanner;

public class C20_TernaryOperator {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
      /*  System.out.println("bir tam sayi giriniz");
        int sayi = scan.nextInt();
        System.out.println(sayi % 5 == 0 ? "sayi 5 in tam kati" : "sayi 5 in kati degil");
    */
        System.out.println("lütfen ücgenin kenarlarini giriniz ");
        int knr1 = scan.nextInt();
        int knr2 = scan.nextInt();
        int knr3 = scan.nextInt();
        System.out.println(knr1 == knr2 && knr2 == knr3 ? "eskenar ucgen" : "eskenar ucgen degil");






    }



}
