package D20_01_2022;

public class Zadatak1 {

	public static void main(String[] args) {
//      Kreirati klasu Osoba koja ima:
//		ime i prezime
//		jmbg
//		godinu rodjenja
//		default-ni konstuktor
//		konstuktor sa parametrima
//		gettere i settere 
//		metodu stampaj koja stampa u formatu:
//		(ime i prezime), (jmbg), (godina rodjenja)
//
//		Kreirati klasu Igrac koja nasledjuje klasu Osoba i koja ima:
//		broj (broj koji igrac nosi)
//		poziciju koju igra (odbrambeni, napadac, … )
//		kapiten (promenljiva koja kaze da li je igrac kapiten tima, i tipa je boolean)
//		default-ni konstuktor
//		konstuktor sa parametrima
//		gettere i settere za broj, kapiten i poziciju
//		metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o igracu
//
//		Kreirati klasu Trener koja nasledjuje klasu Osoba i koja ima:
//		godine iskustva
//		tip trenera (kondicioni, za igru, pomocni, personalni)
//		metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o treneru.
//
//		U glavnom programu kreirati 2 igraca i 2 trenera, i istestirati metode.
//
//       (Za vezbanje) U glavnom programu kreirati niz igraca i niz trenera, na kraju programa ispisati sve igrace i trenere. 
//		Podatke za igrace i trenere unosi korisnik sa tastature.


		Igrac i1= new Igrac("Marko Simonović ", "31256987", 1986, 14, "PF", true);
		Igrac i2= new Igrac("Nikola Kalinić", "3125698", 1991, 12, "Krilo", false);
		
		Trener t1 = new Trener("Dejan Radonjić", "2105265897458", 1970, 17, "Za igru");
		Trener t2 = new Trener("Goran Bošković", "2105365987456", 1972, 10, "Pomocni");
		
		
		i1.stampaj();
		System.out.println();
		i2.stampaj();
		System.out.println();
		t1.stampaj();
		System.out.println();
		t2.stampaj();

	}

}
