package D11_01_2022;

public class Zadatak3 {

	public static void main(String[] args) {
		// Kreirati klasu FacebookPost koja ima:
//		   Od atributa:
//			   ime i prezime korisnika koji je objavio post
//			   ime i prezime korisnika na kom je profilu objavljen post (posto na fejsbuku mozete da postavite objavu na tudjem profilu)
//			   tekst objave
//			   broj lajkova
//			   broj deljenja
//			     Od metoda:
//			   like(), koja povecava broj lajkova za 1.
//			   dislike(), koja smanjuje broj lajkova za 1 (broj lajkova ne moze da bude manji od nule)
//			   share(), koja povecava broj deljenja za 1
//			   print(), koja stampa objavu u formatu:
//			   (ime i prezime osobe koja je objavila) >>> (ime i prezime na cijem profilu)
//			   (tekst objave)
//			   Likes (broj lajkova) | Shares (broj deljenja)
//
//			   U glavnoj klasi napraviti minimum dva FacebookPost-a i nad svakim pozvati svaku funkciju.


		FacebookPost z = new FacebookPost();
		z.setImeIPrezime("Željko Manojlović");
		z.korisnik= "Jelena Manojlović";
		z.tekstObjave="Lajkuj moj profil";
		z.brojLajkova= 3;
		z.brojDeljenja=1;
		
		z.stampaj();
		z.share();
		z.stampaj();
        z.like();
        z.stampaj();
        z.dislike();
        z.stampaj();
        
	}

}
