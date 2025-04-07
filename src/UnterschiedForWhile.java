import java.util.Scanner;

public class UnterschiedForWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		for(Anfangswert; Abbruchbedinung; Zähler) {
//			
//		}
//		while(Bedinung) {
//			
//		}

		for(int i = 1; i<=5; i++) {
			System.out.println("Astroiere wurde erstellt Nr: " + i);
		}
		Scanner scan = new Scanner(System.in);
		System.out.println("Drücke 1 für Schwierigkeitsgrad Leicht \n "
				+ "Drücke 2 für Schwierigkeitsgrad mittel");
		
		
		int userEingabe = scan.nextInt();
		int anzahlGegner = 0;
		
		if (userEingabe == 1) {
			anzahlGegner = 10;
		}else if(userEingabe == 2)
				while (userEingabe !=10) {
					
				}
	}

}
