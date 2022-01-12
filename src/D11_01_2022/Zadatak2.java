package D11_01_2022;

public class Zadatak2 {

	public static void main(String[] args) {
		// Kreirati klasu SmartAirConditioning koja ima:
//		atribut za marku klime (npr: Samsung, Galanz, Gree, �)
//		atribut za potrosnju elektricne energije dok hladi (npr 1kW/h)
//		atribut za potrosnju elektricne energije dok greje (npr 2kW/h)
//		atribut za izabranu temperaturu (minimum je 16, maksimum 35)
//		atribut za mod (hladi/greje)
//		metodu za stampu - stampa u formatu 
//		marka - mod - termperatura
//		metodu koja racuna mesecnu potrosnju u kW/h, po formuli:
//		30 * 15 * potrosnja po satu ( zavisi da li greje ili hladi)
//		metodu koja racuna koliko klima novca potrosi za mesec dana
//		Prvih 350 kW/h su u zelenoj zoni i 1 kW/h kosta 6din
//		Sve ostalo se racuna kao u plavoj zoni, gde 1kW/h kosta 9 dinara
//		Metoda vraca ukupnu cenu za taj mesec
//
//		U glavnom programu krairati objekat klase SmartAirConditioning i testirati sve metode.


		SmartAirConditioning z = new SmartAirConditioning();
		SmartAirConditioning j = new SmartAirConditioning ();
		
		z.marka="Samsung";
		z.temperatura= 18;
		z.mod= true;
		
		j.marka="Gree";
		j.temperatura= 22;
		j.mod= false;
		
		z.stampaj();
		j.stampaj();
		
	}

}
