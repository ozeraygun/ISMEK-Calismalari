package com.week2;

import java.util.Scanner;

public class HaftaninGunu {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("L�tfen g�n kodunu giriniz = ");
		String haftaninGunuKodu = scanner.next();
		haftaninGunuKodu = haftaninGunuKodu.toUpperCase();
		switch (haftaninGunuKodu) {
		case "PTS":
			System.out.print("Bug�n g�nlerden PAZARTES�..!!");
			break;
		case "SL":
			System.out.print("Bug�n g�nlerden SALI..!!");
			break;
		case "CRS":
			System.out.print("Bug�n g�nlerden �AR�AMBA..!!");
			break;
		case "PRS":
			System.out.print("Bug�n g�nlerden PER�EMBE..!!");
			break;
		case "CM":
			System.out.print("Bug�n g�nlerden CUMA..!!");
			break;
		case "CMT":
			System.out.print("Bug�n g�nlerden CUMARTES�..!!");
			break;
		case "PZ":
			System.out.print("Bug�n g�nlerden PAZAR..!!");
			break;
		default:
			System.out.println("Girdi�iniz kod herhangi bir g�n ile e�le�tirilemedi...!!!!!!!");
			break;

		}

	}

}
