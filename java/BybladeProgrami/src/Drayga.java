
public class Drayga extends Beyblade{
	private String kutsalCanavar;

	public Drayga(String beybladeci, int donusHizi, int saldiriGucu,String kutsalCanavar) {
		super(beybladeci, donusHizi, saldiriGucu);
		// TODO Auto-generated constructor stub
		this.kutsalCanavar=kutsalCanavar;
	}

	@Override
	public void kutsalCanavarOrtayaCikar() {
		
		System.out.println(getBeybladeci()+" "+kutsalCanavar+" ý ortaya çýkarýyor");
        System.out.println(getBeybladeci()+" in saldýrýsý Alev kýlýcý");

	}

	@Override
	public void bilgileriGoster() {
		super.bilgileriGoster();
		System.out.println("Kutsal Canavar Adý : "+kutsalCanavar);		
	}
	
	
}
