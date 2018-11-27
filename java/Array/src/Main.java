
public class Main {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("Sabiha Gökçen Havalimanýna Hoþgeldiniz...");
		
		String sartlar = "Yurtdýþýna Çýkýþ Kurallarý\n"
						+"....Siyasi Yasaðýnýz Bulunmamalý\n"
						+"....15 TL harç bedelini Tam yatýrmalýsýnýz\n"
						+"....Gideceðiniz ülkeye vizeniz bulunmalý\n";
		String mesaj = "Yurtdýþý þartlarýnda hepsini saðlamalýsýnýz";
		
		while(true) {
			System.out.println("************************************");
			System.out.println(sartlar);
			System.out.println("**************ÞARTLAR***************");
		
			
			Yolcu yolcu = new Yolcu();
			
			System.out.println("Harç bedeli kontrol ediliyor");
			Thread.sleep(3000);
			if(yolcu.yurtDýsýHarcýKontrol()==false){
				System.out.println(mesaj);
				continue;
			}
			
			System.out.println("\nSiyasi yasak kontrol ediliyor");
			Thread.sleep(3000);
			if(yolcu.siyasiYasakKontrol()==false) {
				System.out.println(mesaj);
				continue;
			}
			
			System.out.println("\nVize durumu kontrol ediliyor");
			Thread.sleep(3000);
			if(yolcu.vizeDurumuKontrol()==false) {
				System.out.println(mesaj);
				continue;
			}
			System.out.println("Ýþlemler tamam yurt dýþýna çýkabilirsiniz");
			break;
		}

	}

}
