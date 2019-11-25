package com.week4;

import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		Scanner klavyedenOku = new Scanner(System.in);
		System.out.print("L�tfen a sayisini giriniz = ");
		int sayi1 = klavyedenOku.nextInt();
		System.out.print("L�tfen b sayisini giriniz = ");
		int sayi2 = klavyedenOku.nextInt();
		System.out.print("L�tfen c sayisini giriniz = ");
		int sayi3 = klavyedenOku.nextInt();
		Topla(sayi1, sayi2);
		Topla(sayi1, sayi2, sayi3);
		Topla("3", "5");
		
	}

	static void Topla(int a, int b) {
		int c = a + b;
		System.out.println("a+b = " + c);
	}

	static void Topla(int a, int b, int c) {
		int d = a + b + c;
		System.out.println("a+b+c = " + d);
	}
	
	static void Topla(String a , String b) {
		int c = Integer.parseInt(a);
		int d = Integer.parseInt(b);
		if(c!=(int)c || d!=(int)d) {
			System.out.println("Girdi�iniz de�erler toplamaya uygun de�ildir...!!!");
		}
		int toplam = c+d;
		System.out.println("Bu iki say�n�n toplam� = "+toplam);
		
	}
}
