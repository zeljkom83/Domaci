package D21_01_2022;

//Kreirati klasu Sektor koja ima:
//naziv sektora
//platu koja je za taj sektor

public class Sektor {

	protected String nazivSektora;
	protected double plataSektora;

	public Sektor(String nazivSektora, double plata) {
		super();
		this.nazivSektora = nazivSektora;
		this.plataSektora = plata;
	}

	public String getNazivSektora() {
		return nazivSektora;
	}

	public void setNazivSektora(String nazivSektora) {
		this.nazivSektora = nazivSektora;
	}

	public double getPlataSektora() {
		return plataSektora;
	}

	public void setPlataSektora(double plataSektora) {
		this.plataSektora = plataSektora;
	}

}
