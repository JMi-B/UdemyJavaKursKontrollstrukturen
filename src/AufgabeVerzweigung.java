import java.util.Scanner;

public class AufgabeVerzweigung {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Kontrollstrukturen steuern den Programmablaufplan
		
		// if heist falls
		// else heist ansonsten
		
		System.out.println("Wie viele Bundesländer hat Deutschland?");
		System.out.println("15, 3, 16 oder 30");
		
		Scanner scan = new Scanner(System.in); // Dekleration des Objekts
		int eingabeUser = scan.nextInt();
		
		//Auswertung der Eingabe
		
		if (eingabeUser == 15) {
			System.out.println("Das ist leider falsch");
		} else if (eingabeUser == 3) {
			System.out.println("Das ist leider falsch");
		}else if (eingabeUser == 16) {
			System.out.println("Das ist richtig !!!");
			System.out.println("Wie heißt der Bundespräsident?");
		} else if (eingabeUser == 30 ) {
			System.out.println("Das ist leider falsch");
		} else {// von mir erweitert
			System.out.println("Ungültige Zahl");
		}
	

	}

}
