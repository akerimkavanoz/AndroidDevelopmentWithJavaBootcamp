package com.example.javadersleri.nesne_tabanli;

public class Odev2Main {
    public static void main(String[] args) {
        Odev2 odev = new Odev2();

        System.out.println("İç Açılar            : " +odev.icAciyiBul(3));

        System.out.println("Maaş                 : " +odev.maasHesapla(20));

        System.out.println("Otopark Ücreti       : " +odev.otoparkUcretiHesapla(3));

        System.out.println("Mile                 : " +odev.mileDonustur(3));

        System.out.println("Dikdörtgen Alan      : " +odev.dikdortgenAlanınıHesapla(6, 4));

        System.out.println("Faktoriyel           : " +odev.faktoriyelHesapla(5));

        System.out.println("Kaç Adet E Harfi Var : " +odev.kacAdetEVar("Zeynep"));
    }
}
