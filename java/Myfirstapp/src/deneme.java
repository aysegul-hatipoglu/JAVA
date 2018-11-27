import java.util.Scanner;

public class deneme {
	
	public static void main(String[] args) {
		
		ATM atm = new ATM();
		
		Hesap hesap = new Hesap("aysegu.htpgl","35659122834",100);
		atm.calis(hesap);
		
	}
}
