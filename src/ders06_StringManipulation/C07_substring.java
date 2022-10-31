package ders06_StringManipulation;

public class C07_substring {
    public static void main(String[] args) {
        String str = "Java gün gectikce güzellesiyor";
        System.out.println(str.substring(5,8)); // 5. index dahil 3 karakter yazdirilir. 8.karakter yazilmaz
        // 5.index dahil (inclusive) 8. index dahil degil (exclusive)
        System.out.println(str.substring(9,17));
        String isim = "YuSuF";
        System.out.println(isim.substring(0,1).toUpperCase() + isim.substring(1).toLowerCase());

    }
}
