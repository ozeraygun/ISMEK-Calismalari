package com.week4;

import java.util.Scanner;

public class MetodOrnek {

	public static void main(String[] args) {
		Scanner klavyedenOku = new Scanner(System.in);
        System.out.print("Lütfen boyunuz giriniz(metre cinsinden) = ");
        float boy = klavyedenOku.nextFloat();
        System.out.print("Lütfen kilonuzu giriniz = ");
        float kilo = klavyedenOku.nextFloat();
        vucutKitleEndeksi(boy ,kilo) ;
	}
	static void vucutKitleEndeksi(float boy , float kilo) {
		float endeks = kilo / (boy * boy);
		System.out.print(endeks);
	}
}
