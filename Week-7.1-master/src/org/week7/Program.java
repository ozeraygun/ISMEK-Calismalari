package org.week7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Program {

	static ArrayList<Okul> okulList = new ArrayList<Okul>();
	static ArrayList<Ogrenci> ogrenciList = new ArrayList<Ogrenci>();
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		HashMap<Okul,ArrayList<Ogrenci>> map = new HashMap<Okul,ArrayList<Ogrenci>>();
		
		boolean donguDevamEdiyor = true;
		do {
			
			WriterUtils.menuyuYazdir();
			System.out.print("Se�iminiz=");
			int secim = scanner.nextInt();
			switch (secim) {
			case 1:
				System.out.println("Okul tan�m� yap�lacak");
				
				System.out.print("Okul Id =");
				int okulId = scanner.nextInt();
				System.out.print("Okul Ad� = ");
				String okulAdi = scanner.next();
				
				Okul okul = new Okul();
				okul.setId(okulId);
				okul.setAdi(okulAdi);
				okulList.add(okul);
				okulListele();
				break;
			case 2:
				System.out.println("Okul listele yap�lacak");
				okulListele();
				break;
			case 3:
				System.out.println("��renci tan�m� yap�lacak");
				
				okulListele();
				
				System.out.println("��renci Numaras� = ");
				int ogrenciNo = scanner.nextInt();
				
				System.out.println("��renci Ad� = ");
				String ogrenciAdi = scanner.next();
				
				
				System.out.println("Okul Id = ");
				int ogrenciOkulId = scanner.nextInt();
				Okul ogrencininOkulu = findOkulById(ogrenciOkulId);

				Ogrenci ogrenci = new Ogrenci();
				ogrenci.setNumara(ogrenciNo);
				ogrenci.setIsim(ogrenciAdi);
				ogrenci.setOkul(ogrencininOkulu);
				ogrenciList.add(ogrenci);
				
				break;
			case 4:
				System.out.println("��renci listele yap�lacak");
				for (Ogrenci ogrenciNesnesi : ogrenciList) {
					System.out.println(ogrenciNesnesi);
				}
				break;
			case 5:
				// Hangi okulda hangi ��renciler var. 
				for (Okul okulNesnesi : okulList) {
					ArrayList<Ogrenci> ogrlist = new ArrayList<Ogrenci>();
					for (Ogrenci ogrenciListesi : ogrenciList) {
						if(ogrenciListesi.getOkul().getId()==okulNesnesi.getId()) {
							ogrlist.add(ogrenciListesi);
						}
					}
					map.put(okulNesnesi, ogrenciList);
				}
				for (Object object : map.keySet()) {
					System.out.println(object);
				}
				break;
			case 6:
				System.out.println("��k�� yap�lacak");
				donguDevamEdiyor = false;
				break;
			default:
				break;
			}
		} while (donguDevamEdiyor);
	}
	
	private static void map(Okul okul, ArrayList<Ogrenci> ogrenciList2) {
		// TODO Auto-generated method stub
		
	}

	private static void okulListele() {
		for (Okul okulNesnesi : okulList) {
			System.out.println(okulNesnesi);
		}
	}

	private static Okul findOkulById(int id) {
		for (Okul okulOku : okulList) {
			if (id == okulOku.getId()) {
				return okulOku;
			}
		}
		return null;
	}

}
