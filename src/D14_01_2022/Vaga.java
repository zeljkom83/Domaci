package D14_01_2022;

public class Vaga {
	
	private String mernaJedinica;
	private Proizvod proizvod;
	private double tezina;
	
	public Vaga (String mernaJedinica, Proizvod proizvod, double tezina) {
		this.mernaJedinica=mernaJedinica;
		this.proizvod=proizvod;
		this.tezina= tezina;
		
	}

	public String getMernaJedinica() {
		return mernaJedinica;
	}

	public void setMernaJedinica(String mernaJedinica) {
		this.mernaJedinica = mernaJedinica;
	}

	public Proizvod getProizvod() {
		return proizvod;
	}

	public void setProizvod(Proizvod proizvod) {
		this.proizvod = proizvod;
	}

	public double sracunajCenu() {
		if (this.mernaJedinica.equals("kg")) {
			return this.proizvod.getCenaKg() * tezina;
		}
		else if (this.mernaJedinica.equals("lb")) {
			return this.proizvod.getCenaLb() * (tezina / 2.2046);
			
		}
		return 0;
	}
	public void stampaj () {
		this.proizvod.stampaj();
	    if (this.mernaJedinica.equals("kg")) {
	    	System.out.println(this.proizvod.getCenaKg() + "rsd, " + this.mernaJedinica+ " " + tezina);
	    }
	    else if (this.mernaJedinica.equals("lb")) {
	    	System.out.println(this.proizvod.getCenaLb() + "rsd, " + this.mernaJedinica+ " " + tezina);
	    }
	    System.out.println("Ukupna cena je: " + this.sracunajCenu() + "rsd");
}
}
