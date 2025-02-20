
public class SchluesselwortIf {

	public static void main(String[] args) {

		// Kontrollstrukturen steuern den Programmablaufplan

		// if = falls
		// else = ansonsten

		int score = 4000;

		if (score == 5000) { // false
			System.out.println("Herzlichen Glückwunsch neuer Rekord!");
		}else{ // false
			System.out.println("Schade dein Score reicht leider nicht!");
		}
		
		int lebenPlayer = 0;
		
		if (lebenPlayer == 0) { // true
			System.out.println("Spiel verloren!");
		}
		
		boolean gegnerHit = false;
		int highscore = 0;
		
		if (gegnerHit == true) {
			System.out.println("Gegener getroffen");
			highscore +=10;
			System.out.println("Hiegscore: " + highscore);
			
		} else {
			System.out.println("Daneben");
		}
	}

}
