package ders04_Matematiksel_islemler_increment_decrement;

import java.util.Scanner;

public class C13_IfElseIf_Statement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen pozitif bir tam sayi yaziniz :");
        int sayi = scan.nextInt();
        if (sayi <= 0){
            System.out.println("Gecersiz bir sayi girdiniz");
        } else if (sayi < 10) {
            System.out.println("Rakam");
        } else if (sayi < 100) {
            System.out.println("İki basamaklı sayi");
        } else {
            System.out.println("Büyük sayi");
        }


    }
}
