package idmanProgrami;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ýdman Programýna Hoþgeldiniz");
		
		String idmanlar = "Geçerli Hareketeler \n\nBurppe\nPushup(ÞINAV)\nSitup(MEKÝK)\nSquat";
		System.out.println(idmanlar);
		System.out.println("Bir idman oluþturunuz");
		
		System.out.println("Burpee Sayýsý");
		int burpee = scanner.nextInt();
		
		System.out.println("Pushup Sayýsý");
		int pushup = scanner.nextInt();
		
		System.out.println("Situp Sayýsý");
		int situp = scanner.nextInt();
		
		System.out.println("Squat Sayýsý");
		int squat = scanner.nextInt();
		scanner.nextLine();
		
		Idman idman = new Idman(burpee,pushup,situp,squat);
		
		System.out.println("Ýdmanýnýz baþlýyor...");
		
		while(idman.idmanBittiMi()==false) {
			System.out.println("Hareket Türü = (Burpee,Pushup,Situp,Squat)");
			String tur = scanner.nextLine();
			System.out.println("Bu hareketten Kaç Tane Olsun");
			int sayi = scanner.nextInt();
			scanner.nextLine();
			idman.hareketYap(tur, sayi);
		}       
		System.out.println("Idmanýný baþarýyla bitirdin....");
	}

}
