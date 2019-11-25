package Homework3;

import java.util.Random;
import java.util.Scanner;

public class AlfabeOdevi {

	public static void main(String[] args) {
		Scanner klavyedenOku = new Scanner(System.in);
		Random randomSayi = new Random();
		int random;
		char[] alfabeDizisi = new char[26];

		for (int i = 0; i < 26; i++) {
			alfabeDizisi[i] = (char) (65 + i);
		}

		System.out.print("Ka� karakter istiyorsunuz = ");
		int karakterSayisi = klavyedenOku.nextInt();

		System.out.print("Ka� tane �retilmesini istiyorsunuz = ");
		int �retilecekSayi = klavyedenOku.nextInt();

		char[][] sonucDizisi = new char[�retilecekSayi][karakterSayisi];

		for (int i = 0; i < �retilecekSayi; i++) {
			for (int j = 0; j < karakterSayisi; j++) {
				random = randomSayi.nextInt(alfabeDizisi.length);
				sonucDizisi[i][j] = alfabeDizisi[random];
			}
			System.out.println(sonucDizisi[i]);
		}

	}

}
