package composition;

public class Kasa {
	
	private String model;
	private String malzeme;
	private String uretici;
	
	public Kasa(String model, String malzeme, String uretici) {
		this.model = model;
		this.malzeme = malzeme;
		this.uretici = uretici;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getMalzeme() {
		return malzeme;
	}

	public void setMalzeme(String malzeme) {
		this.malzeme = malzeme;
	}

	public String getUretici() {
		return uretici;
	}

	public void setUretici(String uretici) {
		this.uretici = uretici;
	}
	
	public void bilgisayariAc() {
		System.out.println("Bilgisayar Açýlýyor");
	}

}
