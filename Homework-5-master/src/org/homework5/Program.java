package org.homework5;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner klavyedenOku = new Scanner(System.in);
		System.out.println("Asagidaki dukkanlardan hangisi hakkinda bilgi almak "
						+ "istiyorsan�z , yan�nda bulunan rakami tuslayiniz...");
		System.out.println("----------------------------------------------------"+
						   "---------------------------------------------------");
		System.out.println("Market Hakkinda Bilgi Almak Ic�n --->  1\n"
				+ "Firin  Hakkinda Bilgi Almak Ic�n --->  2\n"
				+ "Eczane Hakkinda Bilgi Almak Ic�n --->  3\n"
				+ "Kuafor Hakkinda Bilgi Almak Ic�n --->  4\n\n");
		System.out.print("Lutfen Sayiyi Giriniz = ");
		byte bilgiAlmakIc�nGirilenSayi = klavyedenOku.nextByte();
		switch (bilgiAlmakIc�nGirilenSayi) {
		case 1:
			System.out.println("Bilgi Alacaginiz Dukkan = Market\n");
			Market market = new Market();
			market.dukkanAdi = "G�nes Market";
			market.aylikKazanc = 90000;
			market.buAyEnCokSatanUrun = "Camasir Deterjani";
			market.bulunduguKonum = "Bakirkoy";
			market.gundeKacSaatAcik = 12;
			market.isciSayisi = 20;
			market.kacTaneKasaMevcut = 4;
			market.kacTaneSubesiVar = 2;
			market.haftaSonuAcikMi();
			market.sabahKactaAcilir();
			market.aksamKactaKapanir();
			break;
		case 2:
			System.out.println("Bilgi Alacaginiz Dukkan = Firin\n");
			F�r�n firin = new F�r�n();
			firin.dukkanAdi = "�z Karadeniz Firini";
			firin.gundeKacSaatAcik = 18;
			firin.aylikKazanc = 20000;
			firin.bulunduguKonum = "Esenler";
			firin.anlasmaliOlunanMarketSayisi = 6;
			firin.gundeOrtalamaSatilanEkmekSayisi = 2500;
			firin.isciSayisi = 7;
			firin.kullanilanFirininTipi = "Tas Firini";
			firin.haftaSonuAcikMi();
			firin.sabahKactaAcilir();
			firin.aksamKactaKapanir();
			break;
		case 3:
			System.out.println("Bilgi Alacaginiz Dukkan = Eczane\n");
			Eczane eczane = new Eczane();
			eczane.dukkanAdi = "Hayat Eczanesi";
			eczane.bulunduguKonum = "Gayrettepe";
			eczane.aylikKazanc = 13000;
			eczane.ayniIlcedeKacSaglikKurumuVar = 8;
			eczane.enYakinOlunanSaglikKurumu = "Ozel Ensar Hastanesi";
			eczane.gundeKacSaatAcik = 9;
			eczane.hangiGunNobetciEczane = "Carsamba";
			eczane.isciSayisi = 3;
			eczane.haftaSonuAcikMi();
			eczane.sabahKactaAcilir();
			eczane.aksamKactaKapanir();
			break;
		case 4:
			System.out.println("Bilgi Alacaginiz Dukkan = Kuafor\n");
			Kuafor kuafor = new Kuafor();
			kuafor.dukkanAdi = "Karizma Erkek Kuaforu";
			kuafor.bulunduguKonum = "Bagcilar";
			kuafor.aylikKazanc = 9500;
			kuafor.bulunanKoltukSayisi = 6;
			kuafor.calisanCirakSayisi = 2;
			kuafor.gundeKacSaatAcik = 16;
			kuafor.isciSayisi = 5;
			kuafor.haftaSonuAcikMi();
			kuafor.sabahKactaAcilir();
			kuafor.aksamKactaKapanir();
			break;
		default:
			System.out
					.println("Girmis oldugunuz sayi hicbir dukkan ile eslesmedi."
							+ "Bir kez daha secim yapmak istiyorsaniz , tekrar deneyin..");
			break;
		}
	}
}
