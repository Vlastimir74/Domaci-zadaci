package Domaci1;

import java.util.Scanner;

public class Zadatak_11_11202019 {

	public static int[] ucitajniz(int duzinamniz, int[] brojevi, Scanner sk) {

		for (int i = 0; i < brojevi.length; i++) {
			brojevi[i] = sk.nextInt();
		}
		return brojevi;
	}

	public static void deljivsapet(int[] brojevi) {
		for (int i = 0; i < brojevi.length; i++)
			if (brojevi[i] % 5 == 0)
				System.out.println(brojevi[i] + "");
	}

	public static void deljivsatri(int[] brojevi) {
		for (int i = 0; i < brojevi.length; i++)
			if (brojevi[i] % 3 == 0)
				System.out.println(brojevi[i] + "");
	}

	public static void main(String[] args) {
		/*
		 * Korisnik ucitava niz od N elemenata niza (koristiti posebnu metodu). Napisati
		 * zasebno 2 metode Prva metoda ispisuje elemente niza koji su deljivi sa 3
		 * Druga metoda ispisuje elemente niza koji su deljivi sa 5
		 */
		Scanner sk = new Scanner(System.in);
		System.out.println("Unesite duzinu niza: ");
		int n = sk.nextInt();
		int[] mniz = new int[n];
		if (n < 0) {
			System.out.println("Greska, negativan broj ! \n Pokusajte ponovo !");
		} else {
			System.out.println("Unesi elemente niza: ");
			mniz = ucitajniz(n, mniz, sk);
			System.out.println("Elementi deljivi sa 5 su: ");
			deljivsapet(mniz);
			System.out.println("Elementi deljivi sa 3 su: ");
			deljivsatri(mniz);

		}

	}
}
