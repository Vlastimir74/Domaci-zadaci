package Ucionica;

public class GlavniPrg {

	public static void main(String[] args) {
		  
		
		Polaznik p=new Polaznik("Milan ","Petrovic ");
		Polaznik p1=new Polaznik("Goran ","Mihajlovic ");
		Polaznik p3=new Polaznik("Petar ","Popovic "); 

System.out.println(p3.ispis());


Laptop l=new Laptop("Samsung");// laptopovi
Laptop l1=new Laptop("Acer");
Laptop l2=new Laptop("Dell");

l.dodajPolaznika(p);
l1.dodajPolaznika(p1);
l2.dodajPolaznika(p3);

System.out.println(l.ispis());
	}

}
