import java.util.Scanner;
		
public class Test{
		
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		
		WasserAutomat w = new WasserAutomat(1.5);
		KaffeeAutomat k = new KaffeeAutomat(2);
		PizzaAutomat p = new PizzaAutomat(7);
		SuessesAutomat s = new SuessesAutomat(4);
		
		System.out.println("AUTOMAT");
		System.out.println("------------------");
		System.out.println("Wasser =	0");
		System.out.println("Kaffee =	1");
		System.out.println("Pizza =		2");
		System.out.println("Süsses =	3");
		w.wahl = scan.nextInt();
		do {
			if (w.wahl == 0) {
				System.out.println("Preis Wasser:	" +w.preis);
				if (w.istLeer() == false) {
					w.bezahlenProdukt();
					w.ausgebenProdukt();
				}
			}
			else if (w.wahl == 1) {
				System.out.println("Preis Kaffee:	" +k.preis);
				if (k.istLeer() == false) {
					k.bezahlenProdukt();
					k.ausgebenProdukt();
				}
			}
			else if (w.wahl == 2) {
				System.out.println("Preis Pizza:	" +p.preis);
				if (p.istLeer() == false) {
					p.bezahlenProdukt();
					p.ausgebenProdukt();
				}
			}
			else if (w.wahl == 3) {
				System.out.println("Preis Süssigkeiten:	" +s.preis);
				if (s.istLeer() == false) {
					s.bezahlenProdukt();
					s.ausgebenProdukt();
				}
			}
			System.out.println("\nNochmal? (0 = ja)");
			w.nochmal = scan.nextInt();
		}while(w.nochmal == 0);
		
	}	
}		
		