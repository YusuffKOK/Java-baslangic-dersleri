package ders06_StringManipulation;

public class C06_substring {
    public static void main(String[] args) {
        String str = "Java ögren, isi kap";
        System.out.println(str.substring(5));
        System.out.println(str.length()); // 19
        // son karakteri String olarak kaydedin
        String sonHarf ="" + str.charAt(str.length()-1);
        System.out.println(sonHarf);
        sonHarf = str.substring(str.length()-1);
        System.out.println(str.substring(str.length()-3).toUpperCase());
    }
}
