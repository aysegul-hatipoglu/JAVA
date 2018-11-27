import java.util.Scanner;

public class Main {
	

	public static void main(String[] args) {
		///Polymorphizm kullanarak beyblade programý
		
		System.out.println("*******Beblade Programýna Hoþgeldiniz********");
		System.out.println("Çýkýþ için q ya basýnýz");
		
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("Hangi Beyblade'i Üretmek istersiniz ?");
			String islem = scanner.nextLine();
			if(islem.equals("q")) {
				System.out.println("Program Sonlanýyor Hoþcakalýn...");
				break;
			}
			else {
				BeybladeFabrikasi fabrika = new BeybladeFabrikasi();
				Beyblade beyblade = fabrika.beybladeUret(islem);
				if(beyblade==null) {
					System.out.println("Lütfen geçerli bir beyblade ismi giriniz");
				}
				else {
					beyblade.bilgileriGoster();
					beyblade.saldiri();
					beyblade.kutsalCanavarOrtayaCikar();
				}
				
			}
		}

	}

}
