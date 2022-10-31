package ders06_StringManipulation;

public class C03_equalIgnoreCase {
    public static void main(String[] args) {
        String str1 = "Ali";
        String str2 = "ALİ";
        String str3 = "ali";
        System.out.println(str1.equalsIgnoreCase(str2));
        System.out.println(str2.equalsIgnoreCase(str3));
        System.out.println(str1.equalsIgnoreCase(str3));
        System.out.println(str1.equalsIgnoreCase("Ali "));




    }
}
