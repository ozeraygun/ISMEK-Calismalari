package com.week2;

import java.util.Scanner;

public class HaftaninGunu2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("G�n kodunu giriniz = ");
		String haftaninGunuKodu = scanner.next();

		haftaninGunuKodu = haftaninGunuKodu.toUpperCase();

		switch (haftaninGunuKodu) {
		case "PTS":
		case "SL":
		case "CRS":
		case "PRS":
		case "CM":
			System.out.println("Bug�n HAFTA��� g�nlerinden biridir...!!!!");
			break;

		case "CMT":
		case "PZ":
			System.out.println("Bu g�n HAFTASONU g�nlerinden biridir...!!!!");
			break;
		default:
			System.out.println("Girdi�iniz kod herhangi bir g�n ile e�le�tirilemedi...!!!!");
			break;
		}
	}

}