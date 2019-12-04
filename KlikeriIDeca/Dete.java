package KlikeriIDeca;

public class Dete {
	private String ime;
	private String prezime;
	private int brGod;
	private int brKlikera;
	public static int ukupnoKlikera;
	public static double ukupnoGodina;
	public static int ukupnoDece;
	

	public Dete(String ime, String prezime, int brGod, int brKlikera) {
		this.ime = ime;
		this.prezime = prezime;
		this.brGod = brGod;
		this.brKlikera = brKlikera;
		ukupnoDece++;
		ukupnoGodina+=ukupnoKlikera;

	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public int getBrGod() {
		return brGod;
	}

	public void setBrGod(int brGod) {
		this.brGod = brGod;
	}

	public int getBrKlikera() {
		return brKlikera;
	}

	public static double getUkupnoGodina() {
		return ukupnoGodina;
	}

	public static int getUkupnoDece() {
		return ukupnoDece;
	}

	public void dodajKlikere(int brKliker) {
		
			this.brKlikera += brKliker;
			ukupnoKlikera+=brKliker;
		}
	 public void oduzmiKliker(int brKliker) { 
		 
		 this.brKlikera -= brKliker;
			ukupnoKlikera-=brKliker;
		}
	public static double getProsek() {
		 return ukupnoGodina /ukupnoDece ;
		
	 }}


