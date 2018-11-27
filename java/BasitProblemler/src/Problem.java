
public class Problem {
	
	public static class Matematik{
		
		public  static void daireHesapla(int yaricap) {
		
			System.out.println("Dairenin Alaný: "+Math.PI*yaricap*yaricap);
		}
		
		public static void ucgenCevresiHesapla(int k1, int k2, int k3) {
		
			System.out.println("Üçgen çevresi"+(k1+k2+k3));
		}
		
	}
	
	public static class Fizik{
	
		public static void vektorIcCarpimi(Vector vec1, Vector vec2) {
			int carpim = vec1.getI()*vec2.getI()+vec1.getJ()*vec2.getJ()+vec1.getK()*vec2.getK();
			System.out.println("Vectörel Çarpým: "+carpim);
		}
	}

}
