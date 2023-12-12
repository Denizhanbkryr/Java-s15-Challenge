package com.workintech.challenge;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Kütüphane extends AbstractUser {
    private Map<Integer, Kitap> kitaplarMap;
    private Map<Integer, Kullanıcı> kullanıcılarMap;
    private Map<Integer, List<Kitap>> odemeYapilanKitaplarMap;




    public Kütüphane() {
        super();
        kitaplarMap = new HashMap<>();
        kullanıcılarMap = new HashMap<>();
        odemeYapilanKitaplarMap = new HashMap<>();

    }

    public void yeniKitapEkle(Kitap kitap) {
        kitaplarMap.put(kitap.getId(), kitap);
    }


    public Kitap kitapSec(int id, String isim, String yazar) {
        for (Kitap kitap : kitaplarMap.values()) {
            if (kitap.getId() == id || kitap.getİsim().equals(isim) || kitap.getYazar().equals(yazar)) {
                return kitap;
            }
        }
        return null;
    }

    public void kitapBilgileriniGuncelle(Kitap kitap) {
        kitaplarMap.put(kitap.getId(), kitap);
        System.out.println(kitap);
    }


    public void kitapSil(int id) {
        kitaplarMap.remove(id);
    }

    public List<Kitap> kategoriKitaplariListele(Kategori kategori) {
        List<Kitap> kitaplar = new ArrayList<>();

        for (Kitap kitap : kitaplarMap.values()) {
            if (kitap.getKategori().equals(kategori)) {
                kitaplar.add(kitap);
            }
        }
        System.out.println(kitaplar);
        return kitaplar;
    }


    public List<Kitap> yazarKitaplariListele(String yazar) {
        List<Kitap> kitaplar = new ArrayList<>();

        for (Kitap kitap : kitaplarMap.values()) {
            if (kitap.getYazar().equals(yazar)) {
                kitaplar.add(kitap);
            }

        }
        System.out.println(kitaplar);
        return kitaplar;


    }

    public void kullaniciOlustur(Kullanıcı kullanici) {
        kullanıcılarMap.put(kullanici.getId(), kullanici);
    }

    public Kullanıcı kullaniciSec(int id) {
        return kullanıcılarMap.get(id);
    }

    public void kullaniciBilgileriniGuncelle(Kullanıcı kullanici) {
        kullanıcılarMap.put(kullanici.getId(), kullanici);
        System.out.println(kullanici);
    }

    public void kullaniciSil(int id) {
        kullanıcılarMap.remove(id);
    }

    public void kitapOde(Kullanıcı kullanici, Kitap kitap) {
        if(kullanici.getBakiye() >= kitap.getFiyat()) {
            kullanici.setBakiye(kullanici.getBakiye() - kitap.getFiyat());
            kullanici.setKitapLimiti(kullanici.getKitapLimiti()-1);


            List<Kitap> odemeYapilanKitaplar = odemeYapilanKitaplarMap.getOrDefault(kullanici.getId(), new ArrayList<>());
            odemeYapilanKitaplar.add(kitap);
            odemeYapilanKitaplarMap.put(kullanici.getId(), odemeYapilanKitaplar);

            System.out.println(kullanici.getAd() + " Kalan bakiye:" + kullanici.getBakiye() +
                    " Kitap Fiyatı:" + kitap.getFiyat() + " Kalan Kitap Limiti: " + kullanici.getKitapLimiti() +" Ödünç alınan kitaplar: " + odemeYapilanKitaplarMap);
        } else {
            System.out.println(kullanici.getAd() + " kullanıcısının yeterli bakiyesi bulunmamaktadır.");
        }
    }

    public void kitapIade(Kullanıcı kullanici, Kitap kitap) {
        kitaplarMap.remove(kitap.getId(), kitap);


        List<Kitap> odemeYapilanKitaplar = odemeYapilanKitaplarMap.getOrDefault(kullanici.getId(), new ArrayList<>());
        odemeYapilanKitaplar.remove(kitap);
        odemeYapilanKitaplarMap.put(kullanici.getId(), odemeYapilanKitaplar);

        System.out.println(kitap);
    }

    public void kitapOdemesiIade(Kullanıcı kullanici, Kitap kitap) {
        kullanici.setBakiye(kullanici.getBakiye() + kitap.getFiyat());
        kullanici.setKitapLimiti(kullanici.getKitapLimiti()+1);
        System.out.println(kitap);
    }
    @Override
    public String toString() {
        return "Kütüphane{" +
                "kitaplarMap=" + kitaplarMap +
                ", kullanıcılarMap=" + kullanıcılarMap +
                ", id=" + id +
                ", ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", eposta='" + eposta + '\'' +
                ", adres='" + adres + '\'' +
                ", kitapLimiti=" + kitapLimiti +
                ", bakiye=" + bakiye +
                '}';
    }
}
