package com.sinav1;
import java.util.Random;
public class Sýnav1 {

	public static void main(String[] args) {
		Random random = new Random();
		Ýslemler islem = new Ýslemler();
		int islemSayisi = random.nextInt(10);
		System.out.println("Yapýlacak iþlem sayýsý = " + islemSayisi);
		int islemTuru = random.nextInt(2);

		if (islemTuru == 0)
			System.out.println("Yapýlacak iþlem türü = Faktoriyel Hesaplama");
		else if (islemTuru == 1)
			System.out.println("Yapýlacak iþlem türü = Fonksiyon Hesaplama");

		switch (islemTuru) {
		case 0:
			System.out.println();
			for (int i = 0; i < islemSayisi; i++) {
				int sayi1 = random.nextInt(10);
				System.out.println((i + 1) + ")Gelen random sayý =" + sayi1);
				System.out.println("Faktoriyel Sonucu =" + islem.faktoriyelAl(sayi1));
				System.out.println();
			}
			break;

		case 1:
			System.out.println();
			for (int i = 0; i < islemSayisi; i++) {
				int sayi2 = random.nextInt(10);
				System.out.println((i + 1) + ")Gelen random sayý =" + sayi2);
				System.out.println("Fonksiyon Sonucu =" + islem.fonksiyonAl(sayi2));
				System.out.println();
			}

			break;
		default:
			System.out.println(
					"Ýþlem türü " + islemTuru + " sayýsý geldiði için gerçekleþtirilemedi.Tekrar Deneyiniz..!!");
			break;
		}
	}
}