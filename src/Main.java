import com.workintech.challenge.*;

import java.util.Date;

import static com.workintech.challenge.Kategori.YAŞAM;


public class Main {
    public static void main(String[] args) {


        Kütüphane library = new Kütüphane();

        // Create some books
        Kitap book1 = new Kitap("Book1","Den",Kategori.BİLGİ,79,true);
        Kitap book2 = new Kitap("Book2","Deniz", Kategori.YAŞAM,63,false);
        Kitap book3 = new Kitap("Book3","Denizhan", Kategori.YAŞAM,29,true);
        Kitap book4 = new Kitap("Book4","Den", Kategori.BİLGİ,24,true);
        Kitap book5 = new Kitap("Book5","Denizhan",Kategori.ÇOCUK,59,true);



        library.kitapSec(1,"Book1","Den");

        library.yeniKitapEkle(book1);
        library.yeniKitapEkle(book2);
        library.yeniKitapEkle(book3);
        library.yeniKitapEkle(book4);
        library.yeniKitapEkle(book5);

        book1.setId(1);
        book2.setId(2);
        book3.setId(3);
        book4.setId(4);
        book5.setId(5);

        System.out.println(library);

        library.kitapSil(3);


        Kullanıcı user1 = new Kullanıcı("John", "Doe", "john@example.com", "123 Main St", 3);
        Kullanıcı user2 = new Kullanıcı("Mary", "Jane", "mary@example.com", "912 Rear St", 2);
        Kullanıcı user3 = new Kullanıcı("Louis", "Pedro", "louis@example.com", "724 Front St", 6);
        Kullanıcı user4 = new Kullanıcı("Wesley", "Sneijder", "wesley@example.com", "943 Left St", 8);

        user1.setBakiye(100);
        user2.setBakiye(20);
        user3.setBakiye(10);
        user4.setBakiye(50);

        user1.setId(1);
        user2.setId(2);
        user3.setId(3);
        user4.setId(4);

        library.kullaniciSec(1);
        library.kullaniciSec(2);
        library.kullaniciSec(3);
        library.kullaniciSec(4);

        library.kullaniciOlustur(user1);
        library.kullaniciOlustur(user2);
        library.kullaniciOlustur(user3);
        library.kullaniciOlustur(user4);

        library.kullaniciSil(3);

        System.out.println("-------------Aynı Yazarın Kitapları----------");
        library.yazarKitaplariListele("Den");
        System.out.println("----------------------------------------------");
        System.out.println("-------------Aynı Kategoride Olan Kitaplar----------");
        library.kategoriKitaplariListele(Kategori.BİLGİ);
        library.kategoriKitaplariListele(YAŞAM);
        System.out.println("----------------------------------------------");
        System.out.println("----------------Kitap Öde------------");
        library.kitapOde(user1,book5);
        library.kitapOde(user2,book3);
        library.kitapOde(user4,book4);

        System.out.println("----------------İade Olan Kitaplar------------");
        library.kitapIade(user1,book1);
        System.out.println("----------------------------------------------");
        System.out.println("----------------İade Kitap Ödemsi Olan Kitaplar------------");
        library.kitapOdemesiIade(user4,book4);
        System.out.println(user4.getAd() + " adlı kişinin kalan bakiyesi: "+user4.getBakiye());
        System.out.println("----------------------------------------------");
        System.out.println("----------------Kullanıcı Bilgileirni Güncelle------------");
        library.kullaniciBilgileriniGuncelle(user1);
        library.kullaniciBilgileriniGuncelle(user2);
        library.kullaniciBilgileriniGuncelle(user3);
        library.kullaniciBilgileriniGuncelle(user4);
        System.out.println("------------------------------------------------------");

        System.out.println("----------------Kitap Bilgileirni Güncelle------------");
        library.kitapBilgileriniGuncelle(book1);
        library.kitapBilgileriniGuncelle(book2);
        library.kitapBilgileriniGuncelle(book3);
        library.kitapBilgileriniGuncelle(book4);
        library.kitapBilgileriniGuncelle(book5);
        System.out.println("------------------------------------------------------");


        Yayın yayin1 = new Kitap("Book1", "Den", Kategori.BİLGİ, 79, true);

        System.out.println("---------------- Kitap/Dergi Bilgileri ---------------");
        System.out.println(yayin1);
        System.out.println("------------------------------------------------------");

        System.out.println(library);


        user1.getAd();

    }
}