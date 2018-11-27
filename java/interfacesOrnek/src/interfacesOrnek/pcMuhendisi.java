package interfacesOrnek;

public class pcMuhendisi implements Imuhendis{
	
	private boolean adliSicil;
	private boolean askerlik;
	

	public pcMuhendisi(boolean adliSicil, boolean askerlik) {
		super();
		this.adliSicil = adliSicil;
		this.askerlik = askerlik;
	}

	@Override
	public void askerlikDurumuSorgula() {	
		
		if(askerlik) {
			System.out.println("Askerliðimi Yaptým");
		}
		else {
			System.out.println("Askerliðimi yapmadým");
		}
	}

	@Override
	public String mezuniyetOrtalamasi(double derece) {
		
		return "Ortalamam : "+derece;
	}

	@Override
	public void adliSicilSorgula() {
		if(adliSicil) {
			System.out.println("Adli sicil kaydým bulunuyor");
		}
		else {
			System.out.println("Adli sicil kaydým bulunmuyor");
		}
		
	}

	@Override
	public void isTecrubesi(String[] array) {
		
		System.out.println("Bilgisayar Mühendisi olarak þu þirketlerde çalýþtým");
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
		
	}

}
