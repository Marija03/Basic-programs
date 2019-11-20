package testovi;

import java.util.Scanner;

public class Zadatak_1_11182019 {

	public static void main(String[] args) {
		/*
		 * Traziti od korisnika da unese pozitivan broj N. Zatim ucitavati N brojeva sa
		 * standardnog ulaza i ispisati vrednost najmanjeg unetog broja
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("Uneti zeljeni broj: ");
		int broj = sc.nextInt();

		if (broj <= 0) {
			System.out.println("Uneti adekvatan broj!");
		} else {
			System.out.println("Unesi broj: ");
			int a = sc.nextInt();
			int min = a;
			for (int i = 1; i < broj; i++) {
				System.out.println("Uneti broj: ");
				a = sc.nextInt();
				if (a < min)
					min = a;
			}
			System.out.println("Najmanji broj je: " + min);

		}

	}
}
