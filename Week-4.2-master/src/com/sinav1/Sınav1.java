package com.sinav1;
import java.util.Random;
public class S�nav1 {

	public static void main(String[] args) {
		Random random = new Random();
		�slemler islem = new �slemler();
		int islemSayisi = random.nextInt(10);
		System.out.println("Yap�lacak i�lem say�s� = " + islemSayisi);
		int islemTuru = random.nextInt(2);

		if (islemTuru == 0)
			System.out.println("Yap�lacak i�lem t�r� = Faktoriyel Hesaplama");
		else if (islemTuru == 1)
			System.out.println("Yap�lacak i�lem t�r� = Fonksiyon Hesaplama");

		switch (islemTuru) {
		case 0:
			System.out.println();
			for (int i = 0; i < islemSayisi; i++) {
				int sayi1 = random.nextInt(10);
				System.out.println((i + 1) + ")Gelen random say� =" + sayi1);
				System.out.println("Faktoriyel Sonucu =" + islem.faktoriyelAl(sayi1));
				System.out.println();
			}
			break;

		case 1:
			System.out.println();
			for (int i = 0; i < islemSayisi; i++) {
				int sayi2 = random.nextInt(10);
				System.out.println((i + 1) + ")Gelen random say� =" + sayi2);
				System.out.println("Fonksiyon Sonucu =" + islem.fonksiyonAl(sayi2));
				System.out.println();
			}

			break;
		default:
			System.out.println(
					"��lem t�r� " + islemTuru + " say�s� geldi�i i�in ger�ekle�tirilemedi.Tekrar Deneyiniz..!!");
			break;
		}
	}
}