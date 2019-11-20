package testovi;

import java.util.Scanner;

public class Zadatak_2_11182019 {

	public static void main(String[] args) {
		/*
		Ukoliko kupac kupi robu u iznosu vecem od 1500 dinara, dobija 10% popusta, 
		a ukoliko kupi robu u iznosu vecem od 7000 dinara dobija 20% popusta. 
		Napisati program koji ce za uneti iznos odabrane robe ispisati koliko zapravo treba platiti.
		 */

		
		Scanner sc = new Scanner(System.in);
		System.out.println("Uneti cenu: ");
		int n = sc.nextInt();
		int suma = n-(n/100*10);
		int suma1 = n-(n/100*20);
		
		if(n<=0) {
			System.out.println("Uneti tacan broj.");
		}
		else {
			if(n<1500) {
				System.out.println("Cena je " + n);
			}
			else if(n>=1500 && n<7000) {
				System.out.println("Cena je " + suma);
			}
			else if(n>=7000) {
				System.out.println("Cena je " + suma1);
			}
		}
		
		
		
	}

}
