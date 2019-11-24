package Domaci1;

import java.util.Scanner;

public class Zadatak_10_11222019 {

	public static int proizvod(int[] niz) {

		int proizvod = 1;
		for (int i = 0; i < niz.length; i++) {
			if (i % 2 != 0)
				proizvod *= niz[i];

		}
		return proizvod;

	}

	public static int zbir(int[] zbirniz) {

		int zbir = 0;
		for (int j = 0; j < zbirniz.length; j++) {
			if (zbirniz[j] % 2 == 0)
				zbir = zbir + zbirniz[j];
		}
		return zbir;

	}

	public static void main(String[] args) {

		/*
		 * Napisati program koji ucitava niz od n celih brojeva i dve metode. Prva
		 * metoda vraca proizvod elemenata na neparnim pozicijama, a druga vraca zbir
		 * parnih elemenata niza.
		 */

		Scanner sk = new Scanner(System.in);
		int niz[], n;

		System.out.println("Unesite duzinu niza: ");
		n = sk.nextInt();

		if (n < 0) {

		} else {
			niz = new int[n]; // rezervisanje prostora za niz od n clanova
			for (int i = 0; i < n; i++) {
				System.out.println("Unesite elemente: ");
				niz[i] = sk.nextInt();
			}
			int m = proizvod(niz);
			System.out.println("Proizvod elemenata na neparnim pozicijama:  " + m);
			int z = zbir(niz);
			System.out.println("Zbir parnih elemenata:  " + z);
		}

	}
}
