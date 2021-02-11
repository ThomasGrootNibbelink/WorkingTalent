/*ik had geen idee hoe dit te doen, 
 * dus dit is min of meer letterlijk 
 * gekopieerd van het internet.
 * Het werkt wel, ware het niet dat hoofdletters, spaties en leestekens
 * een lagere waarde hebben en dus altijd vooraan gezet worden.
 */

import java.util.Scanner; 

public class Alfabetiseerder {
	public static void main (String[] args) {
		String tijdelijkeOpslag;
		System.out.println("Voer een string in:");
		Scanner sc = new Scanner(System.in);
		String[] ingevoerdeString = sc.nextLine().split("");
		sc.close();
		for (int i=0; i<ingevoerdeString.length; i++) {
			for (int j = i + 1; j < ingevoerdeString.length; j++) { 
				if (ingevoerdeString[i].compareTo(ingevoerdeString[j])>0) {
	                    tijdelijkeOpslag = ingevoerdeString[i];
	                    ingevoerdeString[i] = ingevoerdeString[j];
	                    ingevoerdeString[j] = tijdelijkeOpslag;
				}
			}
		}
		System.out.print("Letters op alfabet gesorteerd:");
	    for (int i = 0; i < ingevoerdeString.length; i++) {
	            System.out.print(ingevoerdeString[i] + ", ");
	    }
			
	}
}


