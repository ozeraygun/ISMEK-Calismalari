package com.week2.donguler;

import java.util.Scanner;

public class EKOK {

	public static void main(String[] args) {
		Scanner klavyedenOku = new Scanner(System.in);
		System.out.print("Ekokunu almak istediðiniz sayýyý giriniz = ");
		int ekokuAlinanSayi = klavyedenOku.nextInt();

		for (int i = 2; i <= ekokuAlinanSayi; i++) {
			if (ekokuAlinanSayi % i == 0) {
				System.out.println(i);
				ekokuAlinanSayi = ekokuAlinanSayi / i;
				i = i - 1;
			}

		}
	}

}