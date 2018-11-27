
public class Yazilimci extends Calisan{
	
	String diller;

	public Yazilimci(String ad, String soyad, int id, String diller) {
		super(ad, soyad, id);
		// TODO Auto-generated constructor stub
		this.diller = diller;
	}
	
	public void formatAt(String isletim_sistemi) {
		
		System.out.println(getAd()+" "+isletim_sistemi+"ni yüklüyor");
	}

	@Override
	public void bilgileriGoster() {
		// TODO Auto-generated method stub
		super.bilgileriGoster();
		System.out.println("Yazýlýmcýný Bildiði Diller"+diller);
	}
	

}
