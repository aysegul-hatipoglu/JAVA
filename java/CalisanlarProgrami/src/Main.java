import java.util.Scanner;

public class Main {
	
	private static Scanner scanner;

	public static void main(String[] args) {
		 /*
        Çalýþanlar Programý
        
        Calisan Sýnýfý Þeklinde Bir Üst Sýnýf
        
        Calisan Sýnýfýndan Türeyen Yazilimci adýnda Bir Alt Sýnýf
        Calisan Sýnýfýndan Türeyen Yonetici adýnda Bir Alt Sýnýf

        */
        scanner = new Scanner(System.in);
        
        System.out.println("Çalýþanlar Programýna Hoþgeldiniz...");
        
        String islemler = "Ýþlemler...\n"
                          + "1. Yazýlýmcý Ýþlemleri\n"
                          + "2. Yönetici Ýþlemleri\n"
                          + "Çýkýþ Ýçin q'ya basýn";
        System.out.println("**********************************");
        System.out.println(islemler);
        System.out.println("**********************************");
        
        while (true) {
            System.out.print("Ýþlemi Seçiniz : ");
            String islem = scanner.nextLine();
            
            if (islem.equals("q")){
                
                System.out.println("Programdan Çýkýlýyor...");
                break;
                
            }
            else if (islem.equals("1")){
                
            	Yazilimci yazilimci = new Yazilimci("Ayþegül","Hatipoðlu",123,"C-Java-Python");
                String yazilimci_islem = "1. Format At\n"
                                         +"2. Bilgileri Göster\n"
                                         + "Çýkýþ için q'ya basýn";
                System.out.println(yazilimci_islem);
                
                while (true) {
                    System.out.print("Ýþlemi Seçiniz : ");
                    String y_islem = scanner.nextLine();
                    
                    if (y_islem.equals("q")) {
                        System.out.println("Yazýlýmcý Ýþlemlerinden Çýkýlýyor...");
                        break;
                    }
                    else if (y_islem.equals("1")){
                        
                        System.out.print("Ýþletim Sistemi : ");
                        String isletim_sistemi = scanner.nextLine();
                        yazilimci.formatAt(isletim_sistemi);
                        
                    }
                    else if (y_islem.equals("2")){
                        
                        yazilimci.bilgileriGoster();
                    }
                    else {
                        System.out.println("Geçersiz Yazýlýmcý Ýþlemi...");
                    }
                    
                }
                
            }
            else if (islem.equals("2")) {
                Yonetici yonetici = new Yonetici("Serhat","Say", 123, 10);
                
                String yonetici_islem = "Yönetici Ýþlemleri\n"
                                        + "1. Zam Yap\n"
                                        + "2. Bilgileri Göster\n"
                                        + "Çýkýþ için q'ya basýn";
                System.out.println(yonetici_islem);
                
                while (true) {
                    System.out.println("Ýþlemi Seçiniz: ");
                    String y_islem = scanner.nextLine();
                    
                    if (y_islem.equals("q")){
                        System.out.println("Yönetici Ýþlemlerinden Çýkýlýyor...");
                        break;
                        
                    }
                    else if (y_islem.equals("1")) {
                        System.out.print("Yöneticinin ne kadar zam yapmasýný istiyorsunuz : ");
                        int zamMiktari = scanner.nextInt();
                        scanner.nextLine();
                        yonetici.zamYap(zamMiktari);
                        
                    }
                    else if (y_islem.equals("2")){
                        yonetici.bilgileriGoster();
                        
                    }
                    else {
                        System.out.println("Geçersiz Yönetici Ýþlemi....");
                    }
                    
                    
                }
                
            }
            else {
                System.out.println("Geçersiz Ýþlem....");
            }
            
            
        }
        
        
    }
}