package com.week2.donguler;

import java.util.Scanner;

public class SayininBolenleri {

	public static void main(String[] args) {
		Scanner klavyedenOku = new Scanner(System.in);
		System.out.print("Hangi say�n�n b�lenlerini bulmak istiyorsunuz = ");
		int bolunenSayi = klavyedenOku.nextInt();
		for (int i = 2; i <= bolunenSayi; i++) {
			if (bolunenSayi % i == 0)
				System.out.println(i);

		}
	}
}