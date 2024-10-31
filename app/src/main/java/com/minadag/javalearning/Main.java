package com.minadag.javalearning;

public class Main {
    public static void main (String[] args) {

        // ekrana yazdirmak icin
        System.out.println("hello world");
        System.out.println(5*2);

        // VARIABLES
        // integer / long  --> tam sayi degerleri tanımlar
        int age = 20;
        System.out.println(age);
        // float  /  double --> ondalikli degerleri tanimlar

        double x = 2.5;
        float y =3.1f;
        System.out.println(x);
        System.out.println(y);

        // boolean --> true / false olarak deger tanimlar

        boolean isALive = true;
        isALive = false;
        System.out.println(isALive);

        // final --> degeri artık degistirilemez sabit yapar

        final int myInteger = 5;
        System.out.println(myInteger);
       // myInteger =4;  --> hata gösterir degistirilemez oldugundan dolayi
    }

}
