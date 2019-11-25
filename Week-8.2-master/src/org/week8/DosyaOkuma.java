package org.week8;

import java.io.FileReader;

public class DosyaOkuma {

	public static void main(String[] args) throws Exception {
		FileReader fileRead = new FileReader("Z:\\20190421\\text.txt");
		int i;
		while ((i = fileRead.read()) != -1)
			System.out.print((char) i);
	}
}
