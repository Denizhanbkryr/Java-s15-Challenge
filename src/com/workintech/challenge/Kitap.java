package com.workintech.challenge;
import java.util.Date;


public class Kitap implements Yayın {
    private String isim;
    private String yazar;
    private Kategori kategori;
    private int fiyat;

    private int id;

    private boolean durum;

    public int getId() {
        return id;
    }

    public Kitap(String isim, String yazar, Kategori kategori, int fiyat, int id, boolean durum) {
        this.isim = isim;
        this.yazar = yazar;
        this.kategori = kategori;
        this.fiyat = fiyat;
        this.id = id;
        this.durum = durum;
    }

    public void setId(int id) {
        this.id = id;
    }



    @Override
    public String toString() {
        return "Kitap{" +
                "isim='" + isim + '\'' +
                ", yazar='" + yazar + '\'' +
                ", kategori=" + kategori +
                ", fiyat=" + fiyat +
                ", id=" + id +
                ", durum=" + durum +
                '}';
    }



    public String getIsim() {
        return this.isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getYazar() {
        return this.yazar;
    }

    public void setYazar(String yazar) {
        this.yazar = yazar;
    }

    public Kategori getKategori() {
        return kategori;
    }

    public void setKategori(Kategori kategori) {
        this.kategori = kategori;
    }

    public int getFiyat() {
        return fiyat;
    }

    public void setFiyat(int fiyat) {
        this.fiyat = fiyat;
    }

    public boolean isDurum() {
        return durum;
    }

    public void setDurum(boolean durum) {
        this.durum = durum;
    }


}
