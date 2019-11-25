package org.homework5;

public class Dukkanlar {
	String dukkanAdi;
	byte gundeKacSaatAcik;
	int isciSayisi;
	int aylikKazanc;
	String bulunduguKonum;

	void haftaSonuAcikMi() {
		System.out.println("Hafta Sonlari Tatil Gunudur.");
	}

	void sabahKactaAcilir() {
		System.out.println("Sabah saat 08:00'da acilir.");
	}

	void aksamKactaKapanir() {
		System.out.println("Aksam saat 22:00'da kapanir.");
	}
}
