package D11_01_2022;

public class FacebookPost {

	private String imeIPrezime;
	String korisnik;
	String tekstObjave;
	int brojLajkova;
	int brojDeljenja;

	public void stampaj(){
		
		System.out.println(this.getImeIPrezime() + " >>> " + this.korisnik);
		System.out.println(this.tekstObjave);
		System.out.println(this.brojLajkova + "|" + this.brojDeljenja);
		
	}

	public void like() {
		this.brojLajkova = this.brojLajkova + 1;

	}

	public void dislike() {
		if (brojLajkova>0) {
			this.brojLajkova=this.brojLajkova-1;
		}
		
		}
	 public void share() {
		this.brojDeljenja=this.brojDeljenja+1;
	}

	public String getImeIPrezime() {
		return imeIPrezime;
	}

	public void setImeIPrezime(String imeIPrezime) {
		this.imeIPrezime = imeIPrezime;
	}
}