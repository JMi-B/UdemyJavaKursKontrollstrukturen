import java.util.Scanner;

import javax.swing.event.SwingPropertyChangeSupport;

public class VerzweigungSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		//Kontrollstruktruren steuern den Programmablaufplan
		
		//switch = Fallunterscheidung
		//cade = Der Fall
		
		// (Bedinung) als Bedinung gilt nur ein int, char und ein String
		
		/*switch (5) {
		case 0:
			System.out.println("Die Zahl ist eine 0");
			break;
		case 3:
			System.out.println("Die Zahl ist eine 3");
			break;
		case 5:
			System.out.println("Die Zahl ist eine 5");
			break;
			
		}*/

		System.out.println("Wieviele Bundesländer hat Deutschland?");
		System.out.println("16 oder 3 oder 30 oder 15");
		
		Scanner scan = new Scanner(System.in);
		int eingabeUser = scan.nextInt();
		
		switch (eingabeUser) {
		case 15 : 
			System.out.println("Das ist falsch!");
		break;
		case 30:
			System.out.println("Das ist falsch!");
		break;
		case 3:
			System.out.println("Das ist falsch!");
		break;
		case 16:
			System.out.println("Das ist richtig :-)");
		break;
		default:
			System.out.println("Zahl ist unbekannt");
		}		
		scan.close();
	}
	

}
