package Domaci1;

import java.util.Scanner;

public class Zadatak_9_11222019 {

	public static double proizvod(double a, double b, double c) {
		return a * b * c;
	}

	public static double min(double a, double b, double c) {
		double min = 0;
		if (a < b && a < c)
			min = a;
		if (b < a && b < c)
			min = b;
		if (c < a && c < b)
			min = c;
		return min;
	}

	public static void main(String[] args) {
		/*
		 * Napisati program u kom se unose 3 realna broja i poziva i ispisuje dve
		 * metode(u mainu). Prva metoda vraca proizvod unetih brojeva. Druga metoda
		 * ispisuje najmanji od unesenih brojeva.
		 */

		Scanner sk = new Scanner(System.in);

		System.out.println("Unesite prvi broj: ");
		double a = sk.nextDouble();
		System.out.println("Unesite drugi broj: ");
		double b = sk.nextDouble();
		System.out.println("Unesite treci broj: ");
		double c = sk.nextDouble();

		double s = proizvod(a, b, c);
		System.out.println("Proizvod je: " + s);
		double najmanji = min(a, b, c);
		System.out.println("Najmanji broj: " + najmanji);
	}
}
