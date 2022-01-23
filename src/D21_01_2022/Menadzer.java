package D21_01_2022;
//Kreirati klasu Menadzer koja nasledjuje klasu Radnik koja ima:
//override uje metodu za platu. Plata se racuna kao suma svih plata po sektorima.

import java.util.ArrayList;

public class Menadzer extends Radnik{

	public Menadzer(String imeIPrezime, ArrayList<Sektor> sektoriUKojimaRadi) {
		super(imeIPrezime, sektoriUKojimaRadi);

	}

	@Override
	public double plata() {
		double plata = 0;

		for (int i = 0; i < sektoriUKojimaRadi.size(); i++) {
			plata = plata + sektoriUKojimaRadi.get(i).getPlataSektora();

		}

		return plata;
	}
}
