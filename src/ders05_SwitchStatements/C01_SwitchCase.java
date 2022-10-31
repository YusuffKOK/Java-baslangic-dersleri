package ders05_SwitchStatements;

import java.util.Scanner;

public class C01_SwitchCase {
    public static void main(String[] args) {
        // JDK
        // J : Java
        // D : Development
        // K : Kit
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir harf giriniz :");
        char harf = scan.next().charAt(0);
        switch (harf){
            case 'J' :
                System.out.println("Java");
                break;
            case 'D' :
                System.out.println("Development");
                break;
            case 'K' :
                System.out.println("Kit");
                break;
            default:
                System.out.println("Hatalı giris yaptiniz :");
        }

    }
}
