package com.sinav1;

public class Ýslemler {

	int faktoriyelAl(int sayi) {
		int temp = 1;
		for (int i = 1; i <= sayi; i++) {
		 	temp = temp*i;	
		}
		return temp;
	}
	
	int fonksiyonAl(int sayi) {
		return ((sayi*sayi*sayi)+(sayi-3)*(sayi-3)+5);
	}
}
