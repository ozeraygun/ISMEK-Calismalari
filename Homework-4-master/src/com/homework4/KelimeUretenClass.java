package com.homework4;

import java.util.Random;

public class KelimeUretenClass {

	String ogrenciAdiOlustur(int gelenSayi) {
		Random randomSayi = new Random();
		char[] alfabeDizisi = new char[26];
		char rastgeleHarf;
		int rastgeleSayi;
		for (int i = 0; i < 26; i++) {
			alfabeDizisi[i] = (char) (65 + i);
		}
		String olusanKelime = "";
		for (int i = 0; i < gelenSayi; i++) {
			rastgeleSayi = randomSayi.nextInt(alfabeDizisi.length);
			rastgeleHarf = alfabeDizisi[rastgeleSayi];
			olusanKelime = olusanKelime + rastgeleHarf;
		}

		return olusanKelime;
	}
}
