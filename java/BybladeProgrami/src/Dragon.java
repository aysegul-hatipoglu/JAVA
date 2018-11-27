
public class Dragon extends Beyblade{

	private String kutsalCanavar;
	private String gizliYetenek;
	
	public Dragon(String beybladeci, int donusHizi, int saldiriGucu, String kutsalCanavar, String gizliYetenek) {
		super(beybladeci, donusHizi, saldiriGucu);
		this.kutsalCanavar = kutsalCanavar;
		this.gizliYetenek = gizliYetenek;
	}

	@Override
	public void kutsalCanavarOrtayaCikar() {
		System.out.println(getBeybladeci()+" "+kutsalCanavar+" ý ortaya çýkarýyor");
        System.out.println(getBeybladeci()+" in saldýrýsý : Hayalet Kasýrgasý");

	}

	@Override
	public void bilgileriGoster() {
		// TODO Auto-generated method stub
		super.bilgileriGoster();
		System.out.println("Kutsal Canavar Adý : "+kutsalCanavar);		
		System.out.println("Gizli Yetenek : "+gizliYetenek);		
	}
	
	
}
