package com.week2.donguler;

import java.util.Scanner;

public class HaftaninGunleriDongu {

	private static final boolean True = false;

	public static void main(String[] args) {
		Scanner klavyedenOku = new Scanner (System.in);
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
			System.out.println("Tekrardan g�n girmek istiyorsan�z Y yaz�n�z =");
			String kullaniciCevap = klavyedenOku.next();
			kullaniciCevap = kullaniciCevap.toUpperCase();
			if(kullaniciCevap == "Y"  ) {
				continue;
			}
			else {
				break;
			}
		}
		System.out.println("Y demedi�iniz i�in tekrardan g�n giremeyeceksiniz ...!!!");
}
}