package com.workintech.challenge;
import java.util.Date;


public class Yayın {
    private String yayınevi;
    private Date yayınTarihi;

    public Yayın(String yayınevi, Date yayınTarihi) {
        this.yayınevi = yayınevi;
        this.yayınTarihi = yayınTarihi;
    }

    public String getYayınevi() {
        return yayınevi;
    }

    public void setYayınevi(String yayınevi) {
        this.yayınevi = yayınevi;
    }

    public Date getYayınTarihi() {
        return yayınTarihi;
    }

    public void setYayınTarihi(Date yayınTarihi) {
        this.yayınTarihi = yayınTarihi;
    }
}
