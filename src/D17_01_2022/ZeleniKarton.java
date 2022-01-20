package D17_01_2022;

public class ZeleniKarton {

	private String imePrezime;
	private int brojIndeksa;
	private String nazivPredmeta;
	private String imePrezimeProfesora;
	private int ocena;
	

	public ZeleniKarton(String imePrezime, int brojIndeksa, String nazivPredmeta, String imePrezimeProfesora, int ocena) {
		this.imePrezime = imePrezime;
		this.brojIndeksa = brojIndeksa;
		this.nazivPredmeta = nazivPredmeta;
		this.imePrezimeProfesora=imePrezimeProfesora;
		this.ocena = ocena;

	}

	public String getImePrezime() {
		return imePrezime;
	}

	public void setImePrezime(String imePrezime) {
		this.imePrezime = imePrezime;
	}

	public int getBrojIndeksa() {
		return brojIndeksa;
	}

	public void setBrojIndeksa(int brojIndeksa) {
		this.brojIndeksa = brojIndeksa;
	}

	public String getNazivPredmeta() {
		return nazivPredmeta;
	}

	public void setNazivPredmeta(String nazivPredmeta) {
		this.nazivPredmeta = nazivPredmeta;
	}

	public String getImePrezimeProfesora() {
		return imePrezimeProfesora;
	}

	public void setImePrezimeProfesora(String imePrezimeProfesora) {
		this.imePrezimeProfesora = imePrezimeProfesora;
	}

	public int getOcena() {
		return ocena;
	}

	public void setOcena(int ocena) {
		this.ocena = ocena;
	}
	

	

	public boolean daLiJePolozen() {
		boolean polozioJe= true;
		if (this.ocena==5) {
			 polozioJe=false;
		}
		return polozioJe;
	}

	public void stampaj() {
		System.out.println(this.nazivPredmeta + " - " + this.ocena);
		System.out.println("Student: " + this.imePrezime + " , broj indeksa " + this.brojIndeksa);
		System.out.println("Profesor: " + this.imePrezimeProfesora);
		System.out.println();
	}
}
