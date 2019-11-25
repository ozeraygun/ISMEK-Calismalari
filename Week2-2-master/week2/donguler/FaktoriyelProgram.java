package com.week2.donguler;

import java.util.Scanner;

public class FaktoriyelProgram {

	public static void main(String[] args) {
		Scanner klavyadenOku = new Scanner (System.in);
		System.out.print("Faktöriyel alýncak sayýyý giriniz = ");
		int faktoriyelAlinacakSayi = klavyadenOku.nextInt();
		int sonuc = 1;
		for (int i = 1; i <= faktoriyelAlinacakSayi; i++) {
			
			System.out.println(sonuc+"*"+i+"="+sonuc*i);
			sonuc = sonuc * i;
		}
		System.out.println("Son Sonuç = "+sonuc);
	}

}
