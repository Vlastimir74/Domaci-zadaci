package KlikeriIDeca;

public class GlavniDete {

	public static void main(String[] args) {
		
		Dete a=new Dete("Zika", "Zivac", 6, 10);
		Dete a1=new Dete("Mika", "Mikic", 3, 8);
		Dete a2=new Dete("Zoki", "Zoric", 5, 15);
		
		
		
		a1.dodajKlikere(45);
		a2.dodajKlikere(52);
	    a2.oduzmiKliker(5);
		
	    System.out.println("Broj klikera a2 je "+a2.getBrKlikera());
	    System.out.println("Ukupan broj dece je "+Dete.ukupnoDece);
	    System.out.println("Prosek godina: "+Dete.getProsek());
	    System.out.println("Ukupno klikera je: "+ Dete.ukupnoKlikera);
		
		

	}

}
