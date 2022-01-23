package D21_01_2022;

import java.util.ArrayList;

public class Zadatak1 {

	public static void main(String[] args) {
//		     Kreirati klasu Sektor koja ima:
//			 naziv sektora
//			 platu koja je za taj sektor
//
//			 Kreirati abstraktnu klasu Radnik koja ima:
//			 ime i prezime
//			 niz sektora u kojima radi
//			 abstraktnu metodu koja vraca platu radnika
//			 metodu zaposli u sektor, kojoj se prosledjuje sektor u kom radnik pocinje sa radom
//
//			 Kreirati klasu Menadzer koja nasledjuje klasu Radnik koja ima:
//			 override uje metodu za platu. Plata se racuna kao suma svih plata po sektorima.
//
//			 Kreirati klasu Magacioner koja nasledjuje klasu Radnik koja:
//			 ima privatnu metodu koja racuna prosecnu platu za sektore u kojima radi radnik kao:
//			 suma plata svih sektor / broj sektora * 0.5
//			 override uje metodu za platu, tako da se plata racuna po formuli:
//			(prosecna plata za sve sektore u kojima radi) * (broj sektora).
//
//			U glavnom programu kreirati jednog magacionera i jednog menadzera, 
//		    postaviti sektore u kojima rade i ispisati platu za svakog


		ArrayList<Sektor> magacionerskiSektor = new ArrayList<Sektor>();
		ArrayList<Sektor> menadzerskiSektor = new ArrayList<Sektor>();

		Magacioner mag1 = new Magacioner("Zeljko Manojlovic", magacionerskiSektor);

		Menadzer men1 = new Menadzer("Jelena Manojlovic", menadzerskiSektor);

		Sektor magacin = new Sektor("Sektor Magacina ", 43500.00);
		Sektor distribucija = new Sektor("Distribucija ", 38000.00);
		Sektor prodaja = new Sektor("Prodaja ", 55000.00);

		Sektor logistike = new Sektor("Logistika ", 65000.00);
		Sektor finansija = new Sektor("Finansije ", 50000.00);
		Sektor nabavke = new Sektor("Nabavka ", 30000.00);

		mag1.zaposliUSektor(magacin);
		mag1.zaposliUSektor(prodaja);
		mag1.zaposliUSektor(distribucija);
		

		men1.zaposliUSektor(nabavke);
		men1.zaposliUSektor(logistike);
		men1.zaposliUSektor(finansija);
		
		System.out.println("Plata menadzera iznosi: " + men1.plata());
		System.out.println();
		System.out.println("Plata magacionera iznosi: " + mag1.plata());
		

	
	}

}
