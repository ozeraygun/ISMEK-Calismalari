package com.week4;

public class MatrisBolmesi {

	public static void main(String[] args) {
		float[][] matris1 = { { 13, 26 }, { 39, 13 } };
		float[][] matris2 = { { 7, 4 }, { 2, 3 } };

		float[][] multiplied = new float[2][2];

		float det = (matris2[0][0] * matris2[1][1]) - (matris2[0][1] * matris2[1][0]);
		float temp = 0;
		temp = matris2[0][0];
		matris2[0][0] = matris2[1][1];
		matris2[1][1] = temp;

		matris2[0][0] = matris2[0][0] / det;
		matris2[0][1] = -matris2[0][1] / det;
		matris2[1][0] = -matris2[1][0] / det;
		matris2[1][1] = matris2[1][1] / det;

		multiplied[0][0] = (matris1[0][0] * matris2[0][0]) + (matris1[0][1] * matris2[1][0]);
		multiplied[0][1] = (matris1[0][0] * matris2[0][1]) + (matris1[0][1] * matris2[1][1]);
		multiplied[1][0] = (matris1[1][0] * matris2[0][0]) + (matris1[1][1] * matris2[1][0]);
		multiplied[1][1] = (matris1[1][0] * matris2[0][1]) + (matris1[1][1] * matris2[1][1]);

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(multiplied[i][j]);
				System.out.print("\t");
			}
			System.out.println();
		}
	}

}
