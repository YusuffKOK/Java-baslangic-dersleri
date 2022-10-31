package ders04_Matematiksel_islemler_increment_decrement;

import java.util.Scanner;

public class C12_If_ElseIf_Statement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen ucgenin kenarlarini giriniz :");
        int knr1 = scan.nextInt();
        int knr2 = scan.nextInt();
        int knr3 = scan.nextInt();
        if(knr1 <= 0 || knr2 <= 0 || knr3 <= 0){
            System.out.println("Gecersiz bir kenar uzunlugu girdiniz :");
        } else if (knr1 == knr2 && knr2 == knr3) {
            System.out.println("Eskenar ücgendir. ");
        } else {
            System.out.println("Eskenar ucgen degildir.");
        }
    }
}
