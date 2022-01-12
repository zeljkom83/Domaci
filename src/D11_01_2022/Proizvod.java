package D11_01_2022;

public class Proizvod {

	String naziv;
	Double cena;
	Double tezina;

	public void stampaj() {
		System.out.println(this.naziv + ", " + this.cena + ", " + this.tezina);
		System.out.println("Cena sa poštarinom iznosi: " + this.racunajPostarinu());

	}

	public void povecajCenu(int skuplje) {
		this.cena = this.cena + skuplje;
	}

	public double vratiCenuSaPopustom(int popust) {
		double x = this.cena / 100 * popust;
		return this.cena = this.cena - x;

	}

	public double racunajPostarinu() {
		if (this.tezina<100) {
			return  200;
		}
		else if (this.tezina>100 && this.tezina < 500) {
			return 400;
		}
		else  {
			return 1000;
		}
}
}
