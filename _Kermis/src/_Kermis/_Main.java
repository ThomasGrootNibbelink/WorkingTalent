package _Kermis;
import java.util.*;
import _Kermis.attracties.*;

public class _Main {

	public static void main(String[] args) {
		while(true) {
			try {
				keuzemenu(); 
			} catch(Exception e) {
				keuzemenu();				
			}
		}

	}



	public static void keuzemenu() {
		System.out.println("Kies een attractie:\n"	+	 
				"\n1. botsauto"		+
				"\n2. spin"			+
				"\n3. spiegelpaleis"	+
				"\n4. spookhuis"		+
				"\n5. hawaii"			+
				"\n6. ladderklimmen\n");

		Scanner sc = new Scanner(System.in);
		int invoerKeuzemenu = sc.nextInt();

		if(!((invoerKeuzemenu > 0) && (invoerKeuzemenu < 7))) {
			System.out.println("Kies een getal [1..6]\n");
			throw new RuntimeException("Je hebt twee kansen gehad. Doe je eigen boekhouding maar lekker.");
		}

		if(invoerKeuzemenu == 1) {
			Botsautos botsautos = new Botsautos();
			botsautos.Draaien();
		} else if(invoerKeuzemenu == 2) {
			Spin spin = new Spin();
			spin.Draaien();
		} else if(invoerKeuzemenu == 3) {
			Spiegelpaleis spiegelpaleis = new Spiegelpaleis();
			spiegelpaleis.Draaien();
		} else if(invoerKeuzemenu == 4) {
			Spookhuis spookhuis = new Spookhuis();
			spookhuis.Draaien();
		} else if(invoerKeuzemenu == 5) {
			Hawaii hawaii = new Hawaii();
			hawaii.Draaien();
		} else if(invoerKeuzemenu == 6) {
			Ladderklimmen ladderklimmen = new Ladderklimmen();
			ladderklimmen.Draaien();
		}
	}

}

