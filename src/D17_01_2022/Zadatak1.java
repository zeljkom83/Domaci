package D17_01_2022;

import java.util.ArrayList;

public class Zadatak1 {

	public static void main(String[] args) {
		// Kreirati klasu ZeleniKarton koja ima:
//		ime i prezime studenta 
//		broj indeksa 
//		naziv predmeta
//		ime i prezime profesora
//		ocenu - od 5 do 10
//		gettere i settere
//		konstruktore
//		metodu koja vraca da li je ispit polozen ili ne (ispit je polozen ako je ocena veca od 5)
//		metodu stampaj koja stampa podatke u formatu:
//				(naziv predmeta) - (ocena)
//				Student: ime i prezime, broj indeksa
//				Profesor: ime i prezime
//
//			U glavnoj klasi:
//		kreirati niz od 10tak zelenih kartona za ispite i odstampati podatke za sve ispite


		ArrayList<ZeleniKarton> polaganje = new ArrayList<ZeleniKarton>();
		
		ZeleniKarton polaganje1 = new ZeleniKarton("Željko Manojlović", 100, "Geomorfologija","Predrag Manojlović", 8);
		ZeleniKarton polaganje2 = new ZeleniKarton("Bojan Milosavljević", 101, "Geomorfologija","Predrag Manojlović", 7);
		ZeleniKarton polaganje3 = new ZeleniKarton("Marko Dimitrijević", 102, "Geomorfologija","Predrag Manojlović", 9);
		ZeleniKarton polaganje4 = new ZeleniKarton("Ana Milkić", 103, "Geomorfologija","Predrag Manojlović", 10);
		ZeleniKarton polaganje5 = new ZeleniKarton("Ana Milivojević", 104, "Geomorfologija","Predrag Manojlović", 6);
		ZeleniKarton polaganje6 = new ZeleniKarton("Zoran Milošević", 105, "Geomorfologija","Predrag Manojlović", 5);
		ZeleniKarton polaganje7 = new ZeleniKarton("Sanja Blagojević", 106, "Geomorfologija","Predrag Manojlović", 6);
		ZeleniKarton polaganje8 = new ZeleniKarton("Milan Veljković", 107, "Geomorfologija","Predrag Manojlović", 10);
		ZeleniKarton polaganje9 = new ZeleniKarton("Tijana Stošić", 108, "Geomorfologija","Predrag Manojlović", 6);
		ZeleniKarton polaganje10 = new ZeleniKarton("Marija Bratić", 109, "Geomorfologija","Predrag Manojlović", 8);
		
		polaganje.add(polaganje1);
		polaganje.add(polaganje2);
		polaganje.add(polaganje3);
		polaganje.add(polaganje4);
		polaganje.add(polaganje5);
		polaganje.add(polaganje6);
		polaganje.add(polaganje7);
		polaganje.add(polaganje8);
		polaganje.add(polaganje9);
		polaganje.add(polaganje10);
		
		for (int i = 0; i < polaganje.size(); i++) {
			polaganje.get(i).stampaj();
			
		}
	}

}
