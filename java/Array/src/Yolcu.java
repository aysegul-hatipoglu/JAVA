import java.util.Scanner;

public class Yolcu implements YurtdýsýKurallarý{

	private int harc;
	private boolean siyasi_yasak;
	private boolean vize_durumu;
	
	public Yolcu() {
		
		 
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Yatýrdýðýnýz Harç Bedeli: ");
		this.harc = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("Herhangi bir siyasi yasaðýnýz bulunuyor mu(evet/hayýr): ");
		String cevap = scanner.nextLine();
		if(cevap.equals("evet")) {
			this.siyasi_yasak=true;
		}
		else {
			this.siyasi_yasak=false;
		}
		
		System.out.println("Vizeniz Bulunuyor mu(evet/hayýr): ");
		String cevap2 = scanner.nextLine();
		
		if(cevap2.equals("evet")) {
			this.vize_durumu=true;
		}
		else {
			this.vize_durumu=false;
		}
	}
	
	@Override
	public boolean yurtDýsýHarcýKontrol() {
		if(this.harc<15) {
			System.out.println("Harcý Eksik yatýrdýnýz Lütfen Tam yatýrýnýz");
			return false;
		}
		else {
			System.out.println("Yurt Dýþý Harç iþlemi Tamam");
			return true;
		}
	}
	
	@Override
	public boolean siyasiYasakKontrol() {
		if(this.siyasi_yasak==true) {
			System.out.println("Siyasi yasaðýnýz bulunyor Yurt dýþýna çýkamazsýnýz");
			return false;
		}
		else {
			System.out.println("Yurt dýþýna çýkabilirsiniz");
			return true;
		}
	}
	
	
	@Override
	public boolean vizeDurumuKontrol() {
		if(this.vize_durumu==true) {
			System.out.println("Vizeniz var yurt dýþýna çýkabilirsiniz");
			return true;
		}
		else {
			System.out.println("Vizenizi yenilemeden çýkamazsýnýz");
			return false;
		}
	}
	
}
