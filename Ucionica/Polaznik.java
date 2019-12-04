package Ucionica;

public class Polaznik {

	private String ime;
	private String prezime;
	private static int id = 1; // id, krece od 1 jer hocu da mi id 1. polaznika bude 1

	
	public Polaznik(String ime, String prezime) {
		this.ime=ime;
		this.prezime=prezime;
	
	}

	
	

	public String getIme() {
		return ime;
	}




	public String getPrezime() {
		return prezime;
	}




	
	
	public String ispis() {
		String ispis= ime+"_"+prezime+"{"+id+"}";
		return ispis;
	}
	
}
