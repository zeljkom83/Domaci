package D17_01_2022;

public class Racun {
	private String brojRacuna;
	private String imePrezime;
	private double stanje;

	public Racun() {

	}

	public Racun(String brojRacuna, String imePrezime, double stanje) {
		this.brojRacuna = brojRacuna;
		this.imePrezime = imePrezime;
		this.stanje = stanje;
	}

	public String getBrojRacuna() {
		return brojRacuna;
	}

	public void setBrojRacuna(String brojRacuna) {
		this.brojRacuna = brojRacuna;
	}

	public String getImePrezime() {
		return imePrezime;
	}

	public void setImePrezime(String imePrezime) {
		this.imePrezime = imePrezime;
	}

	public double getStanje() {
		return stanje;
	}
	public void povecajSredstva (double vrednost) {
		this.stanje= this.stanje+vrednost;
		
	}
	public void smanjiStanje(double stanje) {
		if(this.stanje-stanje>0) {
		this.stanje= this.stanje-stanje;
		}
		
	
	else {
		System.out.println("Nemate dovoljno sredstava");
	}
	}
	public void stampaj() {
		System.out.println("Ime i prezime, " + this.imePrezime + " - broj racuna " + this.brojRacuna);
		System.out.println("Stanje na racunu je " + this.stanje + " RSD");

	}
}