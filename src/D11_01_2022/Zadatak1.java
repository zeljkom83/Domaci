package D11_01_2022;

public class Zadatak1 {

	public static void main(String[] args) {
		// Napisati klasu Proizvod koja ima atribute
//		naziv proizvoda (String)
//		cenu proizvoda (double)
//		težinu proizvoda u gramima. (double)
//			i metode:
//		stampaj - stampa podatke proizvoda u formatu {{naziv}}, {{cena}}, {{tezina}}
//
//
//		U glavnom programu kreirati minimum 2 proizvoda i za svaki od njih pozvati metodu za stampu.


		Proizvod z = new Proizvod();
		Proizvod j = new Proizvod();
		
		z.naziv = "jaje";
		z.cena = 10.0;
		z.tezina=12.0;
		
		j.naziv = "grisini";
		j.cena = 15.0;
		j.tezina=30.0;

		z.stampaj();
		j.stampaj();
		 
		int skuplje=5;
		z.povecajCenu(skuplje);
		z.stampaj();
		j.povecajCenu(skuplje);
		j.stampaj();
		
		
		z.vratiCenuSaPopustom(20);
		z.stampaj();
		
	}

	
	
}
