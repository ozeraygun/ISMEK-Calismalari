package com.ozer.yildiz;

import java.util.Scanner;

public class YildizPrint {

	public static void main(String[] args) {
		Scanner klavyedenOku = new Scanner(System.in);
		System.out.print("Sat�r say�s�n� giriniz = ");
		int satirSayisi = klavyedenOku.nextInt();
		System.out.print("S�t�n say�s�n� giriniz = ");
		int sutunSayisi = klavyedenOku.nextInt();

		for (int i = 0; i < satirSayisi; i++) {
			if (i == 0 || i == satirSayisi - 1) {
				for (int j = 0; j < sutunSayisi; j++) {
					System.out.print("*");
				}
			} else {
				for (int j = 0; j < sutunSayisi; j++) {
					if (j == 0 || j == sutunSayisi - 1)
						System.out.print("*");
					else {
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}
	}
}
