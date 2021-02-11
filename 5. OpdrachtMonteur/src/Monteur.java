public class Monteur {
	public static void main(String[] args) {
		int Kassa = 0; //Maakt 'n lege kassa aan.
		Auto auto1 = new Auto(true, true, false, true); //Iemand komt z'n auto brengen.
		String[] autoString = {"motor: ", "deur: ", "uitlaat: ", "voorruit: "}; // Dit is voor de leuk.
		boolean[] autoArray = {auto1.motor, auto1.deur, auto1.uitlaat, auto1.voorruit};

	
		for (int i = 0; i < autoArray.length; i++) {
			System.out.println(autoString[i] + autoArray[i]);
		} //De monteur gaat eens loeren wat er nou stuk is
		
		System.out.println("\nPoh, laat ik alles wat true is eens repareren.\n");
		
		for (int i = 0; i < autoArray.length; i++) {			
			if(autoArray[i] == true) {
				autoArray[i] = false; //De monteur verricht een reparatie
				Kassa += 25; //De monteur telt per reparatie 25 euro bij de rekening op
			}
			
			System.out.println(autoString[i]+ autoArray[i]); //De monteur kijkt nog eens in de array of alles nu false is.
		}
		
		if(!autoArray[0] && !autoArray[1] && !autoArray[2] && !autoArray[3]){
			System.out.println("\nHoera, er is niks meer stuk. Dat wordt dan "+ Kassa+ " euro, alsjeblieft.");
		}else {
			System.out.println("\nSapperdeflap, er is nog wat stuk."); //Als het goed is deze line overbodig, maar je weet maar nooit want ik ben nog niet zo goed hier in.
		}
		
}
}