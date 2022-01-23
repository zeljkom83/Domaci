package D20_01_2022;

//Kreirati klasu Trener koja nasledjuje klasu Osoba i koja ima:
//godine iskustva
//tip trenera (kondicioni, za igru, pomocni, personalni)
//metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o treneru.


public class Trener extends Osoba{
	private int godineIskustva;
	private String tipTrenera;
	
	public Trener() {
		super();
		
	}

	public Trener(String imePrezime, String jmbg, int godinaRodjenja, int godineIskustva,String tipTrenera) {
		super (imePrezime, jmbg, godinaRodjenja);
		this.godineIskustva = godineIskustva;
		this.tipTrenera = tipTrenera;
	}
	public void stampaj() {
		super.stampaj();
		System.out.println("Iskustvo: " + this.godineIskustva + " godina Tip Trenera: " + this.tipTrenera);
	}
	}
	
	
	
	


