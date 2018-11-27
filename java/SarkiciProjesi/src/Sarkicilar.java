import java.util.ArrayList;

public class Sarkicilar {
	
	private ArrayList<String> sarkiciListesi = new ArrayList<String>();
	
	public void sarkiciBastir() {
		
		System.out.println("Þarkýcý Listesinde "+sarkiciListesi.size()+" kadar þarkýcý var");
		for(int i=0;i<sarkiciListesi.size();i++) {
			
			System.out.println((i+1)+". sýradaki þarkýcý : "+sarkiciListesi.get(i));
		}
	}
	
	public void sarkiciEkle( String sarkici) {
		
		sarkiciListesi.add(sarkici);
		System.out.println("Þarkýcý listeye eklendi");
	}
	public void sarkiciGuncelle(int pozisyon,String yeni) {
		
		sarkiciListesi.set(pozisyon , yeni);
		String eski = sarkiciListesi.get(pozisyon);
		System.out.println(eski+" þarkýcýsý "+yeni+" þarkýcýsýyla deðiþtirildi");
	}
	
	public void sarkiciSil(int pozisyon) {
		sarkiciListesi.remove(pozisyon);
		String eski = sarkiciListesi.get(pozisyon);
		System.out.println(eski+" þarkýcýsý silindi");
	}

	public void sarkiciAra(String sarkici) {
	
		int pozisyon = sarkiciListesi.indexOf(sarkici);
		if(pozisyon>=0) {
			System.out.println(sarkiciListesi.get(pozisyon)+" isimli Þarkýcý bulundu");
		}
		else
			System.out.println("Bu isimde Þarkýcý Listede yok");
	}
}
