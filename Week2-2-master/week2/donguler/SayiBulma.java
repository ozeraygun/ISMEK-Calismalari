package com.week2.donguler;

import java.util.Random;
import java.util.Scanner;

public class SayiBulma {

//	private static final boolean True = false;
//	private static final boolean False = false;

	public static void main(String[] args) {
		Random random = new Random();
		Scanner klavyedenOku = new Scanner(System.in);
		int randomSayi = random.nextInt(10);
		
		System.out.print("Sayýyý tahmin ediniz = ");
		int sayi = klavyedenOku.nextInt();
		
		//boolean a = True;
		while (randomSayi != sayi) {
				System.out.println("Sayýyý yanlýþ tahmin ettiniz.Tekrar deneyiniz..");
				System.out.print("Sayýyý tekrardan tahmin ediniz = ");
				sayi = klavyedenOku.nextInt();
			}
		System.out.print("Sayýyý doðru tahmin ettiniz.Doðru sayý  "+randomSayi+"  Tebrikler....!!! ");
		}
	}
