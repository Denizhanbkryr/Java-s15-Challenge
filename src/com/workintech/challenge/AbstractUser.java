package com.workintech.challenge;

import java.util.Map;

public abstract class AbstractUser {
    public int id;
    public String ad;
    public String soyad;
    public String eposta;
    public String adres;
    public int kitapLimiti;
    public int bakiye;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getBakiye() {
        return bakiye;
    }

    public void setBakiye(int bakiye) {
        this.bakiye = bakiye;
    }

    public AbstractUser() {
        this.id = id;
        this.ad = ad;
        this.soyad = soyad;
        this.eposta = eposta;
        this.adres = adres;
        this.kitapLimiti = kitapLimiti;
        this.bakiye = 0;
    }


}