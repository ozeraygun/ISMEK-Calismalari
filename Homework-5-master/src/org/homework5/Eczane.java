package org.homework5;

public class Eczane extends Dukkanlar {
	String enYakinOlunanSaglikKurumu;
	String hangiGunNobetciEczane;
	byte ayniIlcedeKacSaglikKurumuVar;

	void sabahKactaAcilir() {
		System.out.println("Sabah saat 10:00'da acilir.");
	}

	void aksamKactaKapanir() {
		System.out.println("Aksam saat 19:00'da kapanir.");
	}
}
