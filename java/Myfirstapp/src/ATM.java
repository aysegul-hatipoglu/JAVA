import java.util.Scanner;

public class ATM {
	
	public void calis(Hesap hesap) {
		
		Login login = new Login();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Bankamýza Hoþ Geldiniz.....");
		System.out.println("*****************************");
		System.out.println("Kullanýcý Giriþi...");
		System.out.println("*****************************");
				
		int girisHakki = 3;
		while(true) {
			if(login.login(hesap)) {
				System.out.println("Giriþ Baþarýlý");	
				break;
			}
			else {
				System.out.println("Giriþ Baþarýsýz");
				girisHakki--;
				System.out.println("Kalan Giriþ Hakkýnýz :"+girisHakki);
			}
			if(girisHakki==0) {
				System.out.println("Giriþ Hakkýnýz Doldu Güle Güle.....");
				return;
			}
		}
		System.out.println("***************************");
		String islemler = "1-Bakiye Görüntüle\n2-Para Yatýrma\n3-Para Çekme\nÇýkýþ için Q'ya basýnýz";
		System.out.println(islemler);
		System.out.println("***************************");
		while(true) {
			System.out.println("Ýþlem Seçiniz.....");
			String islem = scanner.nextLine();
			if(islem.equals("q")) {
				
				break;
			}
			else if(islem.equals("1")) {
				System.out.println("Bakiyeniz : "+hesap.getBakiye());
			}
			else if(islem.equals("2")) {
				System.out.println("Yatýrmak istediðiniz Tutar : ");
				int tutar  =scanner.nextInt();
				hesap.paraYatir(tutar);
			}
			else if(islem.equals("3")) {
				System.out.println("Çekmek istediðiniz Tutar : ");
				int tutar = scanner.nextInt();
				hesap.paraCek(tutar);
			}
			else
				System.out.println("Geçersiz Ýþlem");
		}
		
		
		
		
		
		
		
	}

	
	
	
}
