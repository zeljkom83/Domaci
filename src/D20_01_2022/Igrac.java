package D20_01_2022;

//Kreirati klasu Igrac koja nasledjuje klasu Osoba i koja ima:
//broj (broj koji igrac nosi)
//poziciju koju igra (odbrambeni, napadac, … )
//kapiten (promenljiva koja kaze da li je igrac kapiten tima, i tipa je boolean)
//default-ni konstuktor
//konstuktor sa parametrima
//gettere i settere za broj, kapiten i poziciju
//metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o igracu

public class Igrac extends Osoba {

	private int brojNaDresu;
	private String pozicija;
	private boolean kapitenJe;

	

	

	public Igrac() {
		super();
		
	}

	public Igrac(String imePrezime, String jmbg, int godinaRodjenja,int brojNaDresu, String pozicija, boolean kapitenJe) {
		super(imePrezime, jmbg, godinaRodjenja);
		this.brojNaDresu = brojNaDresu;
		this.pozicija = pozicija;
		this.kapitenJe = kapitenJe;
		
	
	}

	public int getBrojNaDresu() {
		return brojNaDresu;
	}

	public void setBrojNaDresu(int brojNaDresu) {
		this.brojNaDresu = brojNaDresu;
	}

	public String getPozicija() {
		return pozicija;
	}

	public void setPozicija(String pozicija) {
		this.pozicija = pozicija;
	}

	public boolean isKapitenJe() {
		return kapitenJe;
	}

	public void setKapitenJe(boolean kapitenJe) {
		this.kapitenJe = kapitenJe;
	}

	public void stampaj() {
		super.stampaj();
		System.out.println("Broj igraca : " + this.brojNaDresu + " Pozicija " + this.pozicija);
		if (kapitenJe= true) {
			System.out.println("Igrac je kapiten tima ");
		} else {
			System.out.println("Igrac nije kapiten tima ");
		}
	}

}
