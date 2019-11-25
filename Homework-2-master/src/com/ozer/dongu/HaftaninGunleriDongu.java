package com.ozer.dongu;

import java.util.Scanner;

public class HaftaninGunleriDongu {

	private static final boolean True = false;

	public static void main(String[] args) {
		Scanner klavyedenOku = new Scanner(System.in);
		boolean a = True;
		while (a == True) {
			System.out.print("G�n kodunu giriniz = ");
			String haftaninGunuKodu = klavyedenOku.next();

			haftaninGunuKodu = haftaninGunuKodu.toUpperCase();

			switch (haftaninGunuKodu) {
			case "PTS":
				System.out.println("Pazartesi");
				break;
			case "SL":
				System.out.println("Sal�");
				break;
			case "CRS":
				System.out.println("�ar�amba");
				break;
			case "PRS":
				System.out.println("Per�embe");
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
				System.out.println("Girdi�iniz kod herhangi bir g�n ile e�le�tirilemedi...!!!!");
				break;
			}
			System.out.println("Tekrardan g�n girmek istiyorsan�z 1'e bas�n�z=");
			int kullaniciCevap = klavyedenOku.nextInt();
			if (kullaniciCevap == 1) {
				continue;
			} else {
				break;
			}
		}
		System.out.println("1'e basmad���n�z i�in tekrardan g�n giremeyeceksiniz ...!!!");
	}
}