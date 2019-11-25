package com.week2.donguler;

import java.util.Scanner;

public class HaftaninGunleriDongu {

	private static final boolean True = false;

	public static void main(String[] args) {
		Scanner klavyedenOku = new Scanner (System.in);
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
			System.out.println("Tekrardan gün girmek istiyorsanýz Y yazýnýz =");
			String kullaniciCevap = klavyedenOku.next();
			kullaniciCevap = kullaniciCevap.toUpperCase();
			if(kullaniciCevap == "Y"  ) {
				continue;
			}
			else {
				break;
			}
		}
		System.out.println("Y demediðiniz için tekrardan gün giremeyeceksiniz ...!!!");
}
}