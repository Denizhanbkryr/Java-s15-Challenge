package com.workintech.challenge;

import java.util.Date;

public class Dergi extends Yayın {
    private String dergiAdi;

    public Dergi(String dergiAdi, String yayınevi, Date yayınTarihi) {
        super(yayınevi, yayınTarihi);
        this.dergiAdi = dergiAdi;
    }


    public String getDergiAdi() {
        return dergiAdi;
    }

    public void setDergiAdi(String dergiAdi) {
        this.dergiAdi = dergiAdi;
    }

    @Override
    public String toString() {
        return "Dergi{" +
                "dergiAdi='" + dergiAdi + '\'' +
                ", yayınevi='" + getYayınevi() + '\'' +
                ", yayınTarihi=" + getYayınTarihi() +
                '}';
    }
}
