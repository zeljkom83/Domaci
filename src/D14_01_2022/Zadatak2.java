package D14_01_2022;

public class Zadatak2 {

	public static void main(String[] args) {
		// (Za vezbanje) Kreirati klasu Proizvod koja ima:
//		sifru proizvoda
//		naziv proizvoda
//		cenu po kilogramu (cena po funti se ne cuva, ona se racuna)
//		konstuktor koji prima sva tri parametra (sifra, naziv, cena po kilogramu)
//		gettere i settere za sifru i naziv
//		setter za cenu po kilogramu
//		metodu getCenaKg koja vraca cenu za 1 kg proizvoda
//		metodu getCenaLb koja vraca cenu za 1lb prozvoda
//		 		konverzija: 1 kg = 2.2046 lb
//		metodu koja stampa proizvod u formatu:
//		(sifra) - (naziv)
//
//			Kreirati klasu Vaga koja ima:
//		merna jedinica (kg ili lb)
//		proizvod (proizvod koji se meri)
//		default-ni konstuktor
//		getteri i setteri za sve atribute
//		metodu sracunajCenu koja vraca cenu proizvoda za unetu tezinu (tezina je parametar funkcije). 
//		Na racunanje cene utice i merna jedinica na koju je vaga podesena. 
//		metodu stampaj koja stampa racun u formatu:
//		               (sifra) - (naziv)
//		   (cena za odgovarajucu mernu jedinicu) (merna jedinica) x (tezina) 
//		   Ukupno: (ukupna cena) 	      

			Proizvod limun = new Proizvod("32", "Limun", 190);
			Vaga l1 = new Vaga("kg", limun , 1.5);
			l1.stampaj();
			

		
	}

}
