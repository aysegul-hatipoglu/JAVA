package interfacesOrnek;

public class MakinaMuhendisi implements Imuhendis{
	
	private boolean askerlik;
	private boolean adliSicil;

	public MakinaMuhendisi(boolean askerlik, boolean adliSicil) {
		super();
		this.askerlik = askerlik;
		this.adliSicil = adliSicil;
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
		
		if(array.length==0) {
			System.out.println("Herhangi bir iþ tecrübem bulunmuyor");
		}
		else {
			System.out.println("Makine Mühendisi olarak þu þirketlerde çalýþtým");
			for(int i=0;i<array.length;i++) {
				System.out.println(array[i]);
			}	
		}
	}

	public void referansGetir(String[] array) {
		
		if(array.length==0) {
			System.out.println("Herhangi bir referans bulunmuyor");
		}
		else {
			System.out.println("Referanslarým : ");
			for(int i=0;i<array.length;i++) {
				System.out.println(array[i]);
			}	
		}
	}
	

}
