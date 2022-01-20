package D18_01_2022;

import java.util.ArrayList;

public class Student {
	private int brojIndeksa;
	private String imePrezime;
	private String tipStudija;
	private ArrayList<Ispit> listaIspit = new ArrayList<Ispit>();

	public Student() {

	}

	public Student(int brojIndeksa, String imePrezime, String tipStudija) {

		this.brojIndeksa = brojIndeksa;
		this.imePrezime = imePrezime;
		this.tipStudija = tipStudija;
	}

	public int getBrojIndeksa() {
		return brojIndeksa;
	}

	public void setBrojIndeksa(int brojIndeksa) {
		this.brojIndeksa = brojIndeksa;
	}

	public String getImePrezime() {
		return imePrezime;
	}

	public void setImePrezime(String imePrezime) {
		this.imePrezime = imePrezime;
	}

	public ArrayList<Ispit> getListaIspit() {
		return listaIspit;
	}

	public void setListaIspit(ArrayList<Ispit> listaIspit) {
		this.listaIspit = listaIspit;
	}
	
	public void dodajIspit(Ispit ispit) {
		this.listaIspit.add(ispit);
	}
	public double prosekOcena() {
		double zbir=0;
		double polozeni=0;
		double prosek=0;
		
		for (int i = 0; i < listaIspit.size(); i++) {
			if (this.listaIspit.get(i).polozioJe()==true) {
				zbir= zbir + this.listaIspit.get(i).getOcena();
				polozeni= polozeni +1;
			}
			
			}
			return prosek= zbir/polozeni;
		}
	
	public void stampaj() {
		System.out.println("Broj indeksa: " + this.brojIndeksa + " , student " + this.imePrezime + " , " + this.tipStudija);
		System.out.println("Predmeti: ");
		for (int i = 0; i < listaIspit.size(); i++) {
		System.out.println(listaIspit.get(i).getNazivPredmeta() + " , " + listaIspit.get(i).getImePrezimeProfesora() + " , " + listaIspit.get(i).getOcena());
		}
		System.out.println("Prosecna ocena: " + this.prosekOcena());
	}



	
}
