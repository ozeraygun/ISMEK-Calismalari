package com.week4;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner klavyedenOku = new Scanner(System.in);

		System.out.print("Birinci sayiyi giriniz = ");
		float sayi1 = klavyedenOku.nextFloat();

		System.out.print("�kinci sayiyi giriniz = ");
		float sayi2 = klavyedenOku.nextFloat();

		Matematik�slemleri islem = new Matematik�slemleri();
		islem.Toplama(sayi1, sayi2);
		islem.Cikarma(sayi1, sayi2);
		islem.Carpma(sayi1, sayi2);
		islem.Bolme(sayi1, sayi2);

		System.out.println("Yap�lan i�lemlerin say�s� = " +islem.sayac);

	}

}
