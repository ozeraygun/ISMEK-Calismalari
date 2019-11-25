package com.ozer.dongu;

import java.util.Scanner;

public class HaftaninGunleriDongu {

	private static final boolean True = false;

	public static void main(String[] args) {
		Scanner klavyedenOku = new Scanner(System.in);
		boolean a = True;
		while (a == True) {
			System.out.print("Gün kodunu giriniz = ");
			String haftaninGunuKodu = klavyedenOku.next();

			haftaninGunuKodu = haftaninGunuKodu.toUpperCase();

			switch (haftaninGunuKodu) {
			case "PTS":
				System.out.println("Pazartesi");
				break;
			case "SL":
				System.out.println("Salý");
				break;
			case "CRS":
				System.out.println("Çarþamba");
				break;
			case "PRS":
				System.out.println("Perþembe");
				break;
			case "CM":
				System.out.println("Cuma");
				break;
			case "CMT":
				System.out.println("Cumartesi");
				break;
			case "PZ":
				System.out.println("Pazar");
				break;
			default:
				System.out.println("Girdiðiniz kod herhangi bir gün ile eþleþtirilemedi...!!!!");
				break;
			}
			System.out.println("Tekrardan gün girmek istiyorsanýz 1'e basýnýz=");
			int kullaniciCevap = klavyedenOku.nextInt();
			if (kullaniciCevap == 1) {
				continue;
			} else {
				break;
			}
		}
		System.out.println("1'e basmadýðýnýz için tekrardan gün giremeyeceksiniz ...!!!");
	}
}