package D14_01_2022;

public class Zadatak1 {

	public static void main(String[] args) {
//       Kreirati klasu Autor koja ima
//		-ime i prezime
//		-konstuktore koje mislite da su vam potrebni
//		-gettere i settere za atribute
//		-metodu print koja stampa u formatu:
//		(ime autora) (prezime autora)
//
//		 Kreirati klasu Knjiga koji ima:
//		-ISBN
//		-naziv
//		-godina izdanja
//		-autor
//		-konstuktore koje mislite da su vam potrebni
//		-gettere i settere za atribute
//		-metodu print koja stampa u formatu (izbegavati dupliranje koda):
//		(ISBN)
//		(naziv) - (godina izdanja)
//		 autor: (ime autora) (prezime autora) 
//
//	    U glavnom programu napraviti vise autora sa vise knjiga.

		Autor momoKapor = new Autor("Momo Kapor");
		Knjiga una = new Knjiga("4231-4231-4231", "Una", 1995, momoKapor);

		una.stampaj();

		System.out.println();
		
		Autor hermanHese = new Autor("Herman Hese");
		Knjiga sidarta = new Knjiga("1345-5268-9856", "Sidarta", 1922, hermanHese);

		sidarta.stampaj();

	}

}
