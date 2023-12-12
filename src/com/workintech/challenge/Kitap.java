package com.workintech.challenge;
import java.util.Date;


public class Kitap extends Yayın{
    private String isim;
    private String yazar;
    private Kategori kategori;
    private int fiyat;

    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private boolean durum;

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

    public Kitap(String isim, String yazar, Kategori kategori, int fiyat, boolean durum) {
        super("", new Date());
        this.isim = isim;
        this.yazar = yazar;
        this.kategori = kategori;
        this.fiyat = fiyat;
        this.durum = durum;
    }

    public String getİsim() {
        return isim;
    }

    public void setİsim(String isim) {
        this.isim = isim;
    }

    public String getYazar() {
        return yazar;
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
