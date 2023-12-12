package com.workintech.challenge;


public class Kullanıcı extends AbstractUser {
    private String ad;
    private String soyad;
    private String eposta;
    private String adres;



    @Override
    public String toString() {
        return "Kullanıcı{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", eposta='" + eposta + '\'' +
                ", adres='" + adres + '\'' +
                ", kitapLimiti=" + kitapLimiti +
                '}';
    }

    private int kitapLimiti;

    public Kullanıcı(String ad, String soyad, String eposta, String adres, int kitapLimiti) {
        this.ad = ad;
        this.soyad = soyad;
        this.eposta = eposta;
        this.adres = adres;
        this.kitapLimiti = kitapLimiti;

    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getEposta() {
        return eposta;
    }

    public void setEposta(String eposta) {
        this.eposta = eposta;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public int getKitapLimiti() {
        return kitapLimiti;
    }

    public void setKitapLimiti(int kitapLimiti) {
        this.kitapLimiti = kitapLimiti;
    }
}
