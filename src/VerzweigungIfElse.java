
public class VerzweigungIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Konntrollstrukturen steuern den Programmablaufplan

		// if = falls
		// else = ansonsten

		int i = 0;
		
		//Mehrer Bedinungen einer Variablen 

		if (i == 1) { //Start wenn true 
			System.out.println("Zahl i ist " + i);//dann passiert das
		} else if (i >= 1) {//1. Verzweigung wenn true
			System.out.println("Zahl i ist " + i);//dann passiert das
		} else if (i <= 1) {//2.Verzweigung wenn true
			System.out.println("Zahl i ist " + i);//dann passiert das
		}else {//Abschluss in allen andern Fällen
			System.out.println("Zahl unbekannt!");// passiert das
		}
		
		int score = 6000;
		int lebenPlayer = 3;
		
		if (score == 1000) {
			System.out.println(" Du hast * von ***");
		}else if (score == 5000) {
			System.out.println("Du hast ** von ***");
		}else if (score > 5000) {//es können mehrer Methoden in einem Anweisungsblock stehen
			System.out.println("Du hast *** von ***");
			lebenPlayer += 1;
			System.out.println("Du hast jetzt " + lebenPlayer + " Leben");
		}
	}

}
