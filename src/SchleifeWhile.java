
public class SchleifeWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//while = solange
		
		/* Allgemeiner Aufbau einer while-Schleife
		 * 
		 * while(Bedinung){
		 * 
		 * Anweisungsblock
		 * 
		 * }
		 * 
		 * Merke: Die Bedinung kann entweder true 0 wahr oder false = nichtwahr sein
		 * 
		 */
		
		int count = 1; //Zählervariable
//		while (count != 6) {
//			System.out.println("Ich bin " + count);
//			count ++ ; // hochzählen
//			
//		}
		
		while(true) { // ! Ohne count ist das ein Endlosschleife
			System.out.println("Hi");
			if (count == 3) {
				break;
			}
			count++; //Zähler
		}
		

	}

}
