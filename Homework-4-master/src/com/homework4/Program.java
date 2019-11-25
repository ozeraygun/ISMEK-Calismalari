package com.homework4;

import java.util.Random;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner klavyedenOku = new Scanner(System.in);
		Random otomatikSayi = new Random();
		OgrenciClass ogrenciOlustur = new OgrenciClass();
		KelimeUretenClass kelimeUret = new KelimeUretenClass();

		System.out.print("Kaç harfli kelime üretmek istiyorsunuz = ");
		byte harfSayisi = klavyedenOku.nextByte();

		String[] ogrenciAdlari = new String[11];
		int[] ogrenciNumaralari = new int[11];

		System.out.print("Lutfen program basligini giriniz = ");
		String programBasligi = klavyedenOku.next();

		for (int i = 1; i <= 10; i++) {
			ogrenciOlustur.ogrenciAdi = kelimeUret
					.ogrenciAdiOlustur(harfSayisi);
			ogrenciAdlari[i] = ogrenciOlustur.ogrenciAdi;

			ogrenciOlustur.ogrenciNumarasi = otomatikSayi.nextInt(100);
			ogrenciNumaralari[i] = ogrenciOlustur.ogrenciNumarasi;
		}
		YazdirmaMetodlari ekranaYazdir = new YazdirmaMetodlari();

		ekranaYazdir.fatihBilisimOkuluProgramBasligiYazdir();
		ekranaYazdir.programBasligiYazdir(programBasligi);

		for (int i = 1; i <= 10; i++) {
			ekranaYazdir.islemSonucuYazdir(ogrenciAdlari[i],
					ogrenciNumaralari[i], i);
			ekranaYazdir.ayracYazdir();
		}
	}
}
