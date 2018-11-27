import java.util.Scanner;

public class Main {

	private static Sarkicilar sarkicilar = new Sarkicilar();
	private static Scanner scanner = new Scanner(System.in);
	
public static void islemleri_bastir() {
        
        System.out.println("\t 0-Ýþlemleri Görüntüle");
        System.out.println("\t 1-Þarkýcýlarý Görüntüle");
        System.out.println("\t 2-Þarkýcý Ekle");
        System.out.println("\t 3-Þarkýcý Güncelle");
        System.out.println("\t 4-Þarkýcý Sil");
        System.out.println("\t 5-Þarkýcý Ara");
        System.out.println("\t 6-Uygulamadan Çýk");
        
    }
    public static void sarkici_goruntule() {
        sarkicilar.sarkiciBastir();
        
    }
    public static void sarkici_ekle(){
        
        System.out.println("Eklemek istediðiniz þarkýcýnýn ismi:");
        
        String isim = scanner.nextLine();
        sarkicilar.sarkiciEkle(isim);
        
    }
    public static void sarkici_guncelle() {
        
        System.out.println("Güncellemek istediðiniz pozisyon(1,2,3...)");
        
        int pozisyon = scanner.nextInt();
        scanner.nextLine();
        
        String yeni_isim = scanner.nextLine();
        sarkicilar.sarkiciGuncelle(pozisyon - 1,yeni_isim);
        
    }
    public static void sil() {
        
        System.out.println("Silmek istediðiniz pozisyon (1,2,3....)");
        
        int pozisyon = scanner.nextInt();
        
        sarkicilar.sarkiciSil(pozisyon-1);
        
        
    }
    public static void ara() {
        
        System.out.println("Aramak istediðiniz þarkýcý:");
        
        String isim = scanner.nextLine();
        
        sarkicilar.sarkiciAra(isim);
        
        
    }
    public static void main(String[] args) {
        
        System.out.println("\t Þarkýcý Uygulamasýna Hoþgeldiniz...");
        
        islemleri_bastir();
        
        boolean cikis = false;
        
        int islem;
        
        while(!cikis) {
            System.out.println("Bir iþlem seçiniz:");
            
            islem = scanner.nextInt();
            
            scanner.nextLine();
            
            switch(islem) {
                case 0:
                    islemleri_bastir();
                    break;
                case 1:
                    sarkici_goruntule();
                    break;
                case 2:
                    sarkici_ekle();
                    break;
                case 3:
                    sarkici_guncelle();
                    break;
                case 4:
                    sil();
                    break;
                case 5:
                    ara();
                    break;
                case 6:
                    cikis = true;
                    System.out.println("Uygulamadan çýkýlýyor...");
                    break;   
            }   
        }
    }

}
