package com.week2;

import java.util.Scanner;

public class HaftaninGunu {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Lütfen gün kodunu giriniz = ");
		String haftaninGunuKodu = scanner.next();
		haftaninGunuKodu = haftaninGunuKodu.toUpperCase();
		switch (haftaninGunuKodu) {
		case "PTS":
			System.out.print("Bugün günlerden PAZARTESÝ..!!");
			break;
		case "SL":
			System.out.print("Bugün günlerden SALI..!!");
			break;
		case "CRS":
			System.out.print("Bugün günlerden ÇARÞAMBA..!!");
			break;
		case "PRS":
			System.out.print("Bugün günlerden PERÞEMBE..!!");
			break;
		case "CM":
			System.out.print("Bugün günlerden CUMA..!!");
			break;
		case "CMT":
			System.out.print("Bugün günlerden CUMARTESÝ..!!");
			break;
		case "PZ":
			System.out.print("Bugün günlerden PAZAR..!!");
			break;
		default:
			System.out.println("Girdiðiniz kod herhangi bir gün ile eþleþtirilemedi...!!!!!!!");
			break;

		}

	}

}
