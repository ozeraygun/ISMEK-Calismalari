package com.week5;

public class Program {

	public static void main(String[] args) {
		IsmekCalisanlar ismekCalisani = new IsmekCalisanlar();
		Egitmen egitmen = new Egitmen();
		TemizlikGorevlisi temizlikGorevlisi = new TemizlikGorevlisi();
		GuvenlikGorevlisi guvenlikGorevlisi = new GuvenlikGorevlisi();
		
		egitmen.adi = "Ali";
		egitmen.soyadi = "Yýlmaz";
		egitmen.yasi = 27;
		egitmen.kacYildirCalisiyor = 4;
		egitmen.maasi = 3500;
		egitmen.verdigiKurs  = "Java Programlama Dili";
		
		guvenlikGorevlisi.yasi = 34;
		guvenlikGorevlisi.kullandigiGuvenlikAleti = "Elektro Þok Cihazý";
		
		temizlikGorevlisi.sorumluOlduguKat = 3;
		temizlikGorevlisi.maasi = 2500;
		
		
	}
}