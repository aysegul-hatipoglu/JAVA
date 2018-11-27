class Hayvan{
	private String isim;
	
	public Hayvan(String isim) {
		this.isim = isim;
	}
	public String getIsim() {
		return isim;
	}
	public void setIsim(String isim) {
		this.isim = isim;
	}
	public String konus() {
		return "Hayvan Konuþuyor...";
	}
}
class kedi extends Hayvan{

	public kedi(String isim) {
		super(isim);
	}

	@Override
	public String konus() {
		// TODO Auto-generated method stub
		return this.getIsim()+" miyavlýyor";
	}
}
class kopek extends Hayvan{

	public kopek(String isim) {
		super(isim);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String konus() {
		// TODO Auto-generated method stub
		return this.getIsim()+" havlýyor";
	}
	
}
class at extends Hayvan{

	public at(String isim) {
		super(isim);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String konus() {
		// TODO Auto-generated method stub
		return this.getIsim()+" kiþniyor";
	}
	
}
public class Main {
	
	public static void konustur(Hayvan hayvan) {
		System.out.println(hayvan.konus());
	}

	public static void main(String[] args) {
		
		Hayvan hayvan1 = new kedi("Tekir");
		Hayvan hayvan2 = new kopek("Karabaþ");
		Hayvan hayvan3 = new at("Cazgýr");
		
		System.out.println(hayvan1.konus());
		System.out.println(hayvan2.konus());
		System.out.println(hayvan3.konus());
		System.out.println("************************");
		konustur(new kedi("tekir"));
		konustur(new kopek("Karabaþ"));
		konustur(new at("Cazgýr"));
	}

}
