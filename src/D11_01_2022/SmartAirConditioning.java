package D11_01_2022;

public class SmartAirConditioning {

	String marka;
	int hladi;
	int greje;
	int temperatura;
	boolean mod;

	public void stampaj() {
		System.out.println(this.marka + "," + this.metMod() + " , " + this.temperatura);
		System.out.println("Mesecna potrosnja u KW je " + this.mesecnaPotrosnja());
		System.out.println(" Cena mesečne potrošnje iznosi " + this.cenaMesPot() + " RSD");

	}

	public String metMod() {
		if (this.mod ) {
			return "Klima hladi";
		} else {
			return "klima greje";
		}
	}

	public int mesecnaPotrosnja() {
		if (this.mod) {
			return 30 * 15;
		} else {
			return 30 * 15 * 2;
		}
		
	}
	 public int cenaMesPot() {
		 int cena=0;
		 cena = 6 * 350 + ((this.mesecnaPotrosnja()-350)*9);
		 return cena;
	 }
}
