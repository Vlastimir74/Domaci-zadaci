package Ucionica;

import java.util.ArrayList;

public class Laptop {
	
	private String marka;
	ArrayList<Polaznik>ucenici;
	
	
	
	public Laptop(String marka) {
		this.marka=marka;
		ucenici=new ArrayList<Polaznik>();
		}
               
	public void dodajPolaznika(Polaznik p) {
		ucenici.add(p);
	}
	public ArrayList<Polaznik> getUcenici() {
		return ucenici;
	}
	
	
	public String getMarka() {
		return marka;
	}
	public String ispis() {
		String ispis=marka+"{";
	for (int i = 0; i < ucenici.size(); i++) {
		ispis+=ucenici.get(i).ispis();
		
		if(i<(ucenici.size()-1)) {
			ispis+=",";
		}
		
	}
	return ispis + "}";
	
    
	
    
		

	


		


	

		
	}	

}
