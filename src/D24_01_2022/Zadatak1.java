package D24_01_2022;

//U glavnom programu kreirati jednu Korpu i u nju dodati nekoliko Ambalaza razlicitih tipova i 
//istestirati sve metode i ispisati ukupnu cenu sa popustom.

public class Zadatak1 {

	public static void main(String[] args) {

		Korpa korpa1 = new Korpa();
		SuperKartica superKartica = new SuperKartica("52874-6938", "Željko Manojloviic", 10);

		Ambalaza tetrapak1 = new Tetrapak(true, 90.00, "125458lk", "Imlek", 100.0, 120.0);
		Ambalaza tetrapak2 = new Tetrapak(false, 12.50, "235jkuz", "Kiselo mleko", 200.0, 300.0);
		Ambalaza staklenaAmbalaza1 = new StaklenaAmbalaza(45, true, 55.00, "258974114", "Frutela", 50.0, 220.0);
		Ambalaza staklenaAmbalaza2 = new StaklenaAmbalaza(0, false, 120.00, "1345LK53", "KOka KOla", 120.0, 100.50);

		korpa1.dodajAmbalazu(tetrapak1);
		korpa1.dodajAmbalazu(tetrapak2);
		korpa1.dodajAmbalazu(staklenaAmbalaza1);
		korpa1.dodajAmbalazu(staklenaAmbalaza2);
		korpa1.izbaciAmbalazu(tetrapak2.getBarkod());

		korpa1.ukupnaCenaKorpe(superKartica);

		tetrapak1.stampaj();
		tetrapak2.stampaj();
		staklenaAmbalaza1.stampaj();
		staklenaAmbalaza2.stampaj();

		System.out.println("Ukupna cena korpe je: " + korpa1.ukupnaCenaKorpe(superKartica) + " din");

	}

}
