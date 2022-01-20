package D17_01_2022;

public class Transakcija {

	private String idTransakcije;
	private Racun posiljalac;
	private Racun primalac;

	public Transakcija() {

	}

	public Transakcija(String idTransakcije, Racun posiljalac, Racun primalac) {
		this.idTransakcije = idTransakcije;
		this.posiljalac = posiljalac;
		this.primalac = primalac;
	}

	public String getIdTransakcije() {
		return idTransakcije;
	}

	public void setIdTransakcije(String idTransakcije) {
		this.idTransakcije = idTransakcije;
	}

	public Racun getPosiljalac() {
		return posiljalac;
	}

	public void setPosiljalac(Racun posiljalac) {
		this.posiljalac = posiljalac;
	}

	public Racun getPrimalac() {
		return primalac;
	}

	public void setPrimalac(Racun primalac) {
		this.primalac = primalac;
	}

	private double provizija(double iznos) {
		if (iznos < 4500) {
			iznos = 45;
		} else {
			iznos = iznos * 0.01;
		}
		return iznos;
	}

	public void transakcijaSaRacuna (double vrednost) {
		this.posiljalac.smanjiStanje(vrednost + provizija(vrednost));
		this.primalac.povecajSredstva(vrednost);
	}

	public void stampaj() {
		System.out.println(this.idTransakcije);
		System.out.println("Racun sa " + this.posiljalac.getImePrezime() + " - " + getPosiljalac().getBrojRacuna());
		System.out.println("Racun na " + this.primalac.getImePrezime() + " - " + getPrimalac().getBrojRacuna());
	}

}
