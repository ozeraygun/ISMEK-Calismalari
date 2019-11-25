package com.week2;

import java.util.Scanner;

public class HaftaninGunu2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Gün kodunu giriniz = ");
		String haftaninGunuKodu = scanner.next();

		haftaninGunuKodu = haftaninGunuKodu.toUpperCase();

		switch (haftaninGunuKodu) {
		case "PTS":
		case "SL":
		case "CRS":
		case "PRS":
		case "CM":
			System.out.println("Bugün HAFTAÝÇÝ günlerinden biridir...!!!!");
			break;

		case "CMT":
		case "PZ":
			System.out.println("Bu gün HAFTASONU günlerinden biridir...!!!!");
			break;
		default:
			System.out.println("Girdiðiniz kod herhangi bir gün ile eþleþtirilemedi...!!!!");
			break;
		}
	}

}