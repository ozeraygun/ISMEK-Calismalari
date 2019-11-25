package com.week2.donguler;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		Scanner klavyedenOku = new Scanner(System.in);
		System.out.print("Çarpým tablosunun üst deðerini giriniz = ");
		int carpimSayisi = klavyedenOku.nextInt();
		for (int a = 1; a <= carpimSayisi; a++) {
			System.out.print("\t" + a);
		}
		System.out.println();
		for (int i = 1; i <= carpimSayisi; i++) {
			System.out.print(i);
			for (int j = 1; j <= carpimSayisi; j++) {
				System.out.print("\t" + j * i);
			}
			System.out.println();
		}

	}
}