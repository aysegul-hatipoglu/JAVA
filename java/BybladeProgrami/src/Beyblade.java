
public class Beyblade {
	
	private String beybladeci;
	private int donusHizi;
	private int saldiriGucu;
	
	public Beyblade(String beybladeci, int donusHizi, int saldiriGucu) {
		this.beybladeci = beybladeci;
		this.donusHizi = donusHizi;
		this.saldiriGucu = saldiriGucu;
	}
	
	public String getBeybladeci() {
		return beybladeci;
	}
	public void setBeybladeci(String beybladeci) {
		this.beybladeci = beybladeci;
	}
	public int getDonusHizi() {
		return donusHizi;
	}
	public void setDonusHizi(int donusHizi) {
		this.donusHizi = donusHizi;
	}
	public int getSaldiriGucu() {
		return saldiriGucu;
	}
	public void setSaldiriGucu(int saldiriGucu) {
		this.saldiriGucu = saldiriGucu;
	}

	public void saldiri() {
		System.out.println(beybladeci+" "+saldiriGucu+" ve "+donusHizi+" ile saldiriyor");
		
	}

	public void kutsalCanavarOrtayaCikar() {
		System.out.println("Bu beyblade'in kutsal canavarý bulunmuyor");
	}
	public void bilgileriGoster() {
		System.out.println("Beybladeci ismi : "+beybladeci);
		System.out.println("Saldýrý Gücü : "+saldiriGucu);
		System.out.println("Dönüþ Hýzý : "+donusHizi);
		
	}
}
