package ders05_SwitchStatements;

import java.util.Scanner;

public class C02_SwitchCase {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir ay numarası giriniz");
        int ay = scan.nextInt();
        switch (ay){
            case 1 :
            case 2 :
            case 3 :
                System.out.println("Kis Mevsimi");
                break;
            case 4 :
            case 5 :
            case 6 :
                System.out.println("İlkbahar Mevsimi");
                break;
            case 7 :
            case 8 :
            case 9 :
                System.out.println("Yaz Mevsimi");
                break;
            case 10:
            case 11:
            case 12:
                System.out.println("Sonbahar Mevsimi");
                break;
            default:
                System.out.println("Gecersiz bir sayi girdiniz :");







        }
    }
}
