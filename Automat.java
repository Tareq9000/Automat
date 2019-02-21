import java.util.Scanner;
public class Automat {
	
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		
	}

	String name;
	double preis;
	double kontostand = 0;
	double kontostand2 = 0;
	int nochmal;
	int produkte = 5;
	int wahl = 0;
	
	public boolean istLeer() {
		return false;
	}
	
	public double bezahlenProdukt() {
		
		double bezahlung = 0;
		double zwischenb = 0;
		
		while(bezahlung < preis) {
			System.out.println("Geben Sie Geld ein > ");
			zwischenb = scan.nextDouble();
			bezahlung += zwischenb;
		}
		
		kontostand = bezahlung - preis;
		
		
		return 1;
	}
	
	public void ausgebenProdukt() {
		produkte--;
		if(produkte == 0) {
			System.out.println("Automat ist leer!");
			kontostand += preis;
			System.out.println("Retourgeld:	" +kontostand);
		}
		else {
			System.out.println("Retourgeld:	" +kontostand);
			System.out.println("Produkte übrig:	" +produkte);
			System.out.println("Produkt wird ausgegeben");
		}
	}
}
