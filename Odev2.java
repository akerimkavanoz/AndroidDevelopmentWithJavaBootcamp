package com.example.javadersleri.nesne_tabanli;

public class Odev2 {
    // Parametre olarak girilen kenar sayısına göre her bir iç açıyı hesaplayıp sonucu geri gönderen metod yazınız.
    // İç açılar toplamı = ( (Kenar sayısı - 2) x 180 ) / Kenar sayısı

    public int icAciyiBul(int kenarSayisi) {

        int icAcilar = 0;

        if (kenarSayisi <= 2) {
            System.out.println("Kenar sayısı 2 ve 2'den küçük olamaz");
            return 0;
        }
        else {
            icAcilar =( ( (kenarSayisi - 2) * 180) / kenarSayisi );
            return icAcilar;
        }
    }

    // Parametre olarak girilen gün sayısına göre maaş hesabı yapan ve elde edilen değeri döndüren metod yazınız.
    // 1 günde 8 saat çalışılabilir.
    // Çalışma saat ücreti : 40 TL
    // Mesai saat ücreti : 80 TL
    // 150 saat üzeri mesai sayılır.

    public int maasHesapla(int gun) {

        int saat = 8;
        int saatUcreti = 40;
        int mesaiSaatUcreti = 80;
        int mesaiSaati = 150;
        int toplamSaat = saat * gun;
        int maas = 0;

        if (gun <= 0) {
            System.out.println("Gün sayısı 0 ve 0'dan küçük olamaz.");
            return 0;
        }
        else {
            if (toplamSaat > mesaiSaati) {
                maas = ( (mesaiSaati * saatUcreti) + ((toplamSaat - mesaiSaati) * mesaiSaatUcreti) );
                return maas;
            }
            else {
                maas = toplamSaat * saatUcreti;
                return maas;
            }
        }
    }

    // Parametre olarak girilen otopark süresine göre otopark ücreti hesaplayarak geri döndüren metodu yazınız.
    // 1 saat = 50  TL
    // 1 saat aşımından sonra her 1 saat 10 TL'dir.

    public double otoparkUcretiHesapla(int otoparkSuresi){
        double ilkSaat = 50;
        double saatAsimi = 10;
        double otoparkUcreti = 0;

        if (otoparkSuresi <= 0) {
            System.out.println("Otopark süresi 0 ve 0'dan küçük olamaz");
            return 0;
        }
        else{
            otoparkUcreti = ( ( (otoparkSuresi - 1) * saatAsimi ) + ilkSaat );
            return otoparkUcreti;
        }
    }

    // Parametre olarak girilen kilometreyi mile dönüştürdükten sonra geri döndüren bir metod yazınız.
    // Mile = Km x 0.621

    public double mileDonustur(double km) {

        double oran = 0.621;
        double mile = 0;

        if (km <= 0) {
            System.out.println("KM 0 veya 0'dan küçük olamaz");
            return 0;
        }
        else {
            mile = km * oran;
            return mile;
        }
    }

    // Kenarları parametre olarak girilen ve dikdörtgen alanını hesaplayan bir metod yazınız.

    public double dikdortgenAlanınıHesapla(double kenar1, double kenar2) {
        double alan = 0;

        if (kenar1 <= 0 || kenar2 <= 0){
            System.out.println("Dikdörtgen kenarları 0 veya 0'dan düşük olamaz.");
            return 0;
        }
        else{
            alan = kenar1 * kenar2;
            return alan;
        }
    }

    // Parametre olarak girilen sayının faktoriyel değerini hesaplayıp geri döndüren metodu yazınız

    public long faktoriyelHesapla(int sayi) {

        if (sayi < 0) {
            System.out.println("Negatif sayı giremezsiniz.");
            return 0;
        }
        else {
            if (sayi >= 1)
                return sayi * faktoriyelHesapla(sayi - 1);
            else
                return 1;
        }
    }

    // Parametre olarak girilen kelime içinde kaç adet e harfi olduğunu gösteren bir metod yazınız.

    public int kacAdetEVar(String kelime) {

        int eHarfiSayisi = 0;

        if (kelime.isEmpty()) {
            System.out.println("Kelime boş olamaz");
            return 0;
        }
        else {
            for(int i = 0; i < kelime.length(); i++) {
                if (kelime.charAt(i) == 'e' || kelime.charAt(i) == 'E') {
                    eHarfiSayisi++;
                }
            }
            return eHarfiSayisi;
        }
    }
}
