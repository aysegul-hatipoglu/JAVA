import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
	
	public static void islemleriBastir() {
		System.out.println("0-Ýþlemleri Görüntüle");
		System.out.println("1-Bir sonraki þehire git");
		System.out.println("2-Bir önceki þehire git");
		System.out.println("3-Uygulamadan çýk");
	}
	
	public static void sehirleriTurla(LinkedList<String> sehirler) {
		ListIterator<String> iterator = sehirler.listIterator();
		int islem;
		islemleriBastir();
		Scanner scanner = new Scanner(System.in);
		if(!iterator.hasNext()) {
			System.out.println("Herhangi bir deðere bulunmuyor");
		}
		boolean cikis = false;
		boolean ileri = true;
		while(!cikis) {
			System.out.println("Bir iþlem seçiniz");
			islem=scanner.nextInt();
			switch(islem) {	
				case 0:
					islemleriBastir();
					break;
					
				case 1:
					if(!ileri) {
						if(iterator.hasNext()) {
							iterator.next();
						}
						ileri = true;
					}
					if(iterator.hasNext()) {
						System.out.println("Þehre Gidiliyor : "+iterator.next());
					}
					else {
						System.out.println("Gidilecek Þehir Kalmadý");
						ileri = true;
					}
					break;
					
				case 2:
					if(ileri) {
						if(iterator.hasPrevious()) {
							iterator.previous();
						}
					}ileri=false;
					if(iterator.hasPrevious()) {
						System.out.println("Þehre Gidiliyor : "+iterator.previous());
					}
					else {
						System.out.println("Þehir turu baþladý");
					}
					break;
					
				case 3:
					cikis = true;
					System.out.println("Uygulamadan çýkýlýyor");
			
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> sehirler = new LinkedList<String>();
		sehirler.add("Ankara");
		sehirler.addLast("Eskiþehir");
		sehirler.addLast("Afyon");
		sehirleriTurla(sehirler);


	}

}
