import java.util.*;

public class HetSpel {

	public static void main(String[] args) {
		List<String> geradenWoorden = new ArrayList<String>();
		for(int i = 0;;) {
			
			String IGOVENM = new String ("ik ga op vakantie en ik neem mee: ");
			System.out.println(IGOVENM + geradenWoorden); 
			
			Scanner sc = new Scanner(System.in);
			String invoer = sc.nextLine();
		
				if(!(geradenWoorden.isEmpty())) { 
				//Als er al wel woorden in de list staan.
					
					String laatsteWoord = geradenWoorden.get(geradenWoorden.size()-1);
					char laatsteLetter = laatsteWoord.charAt(laatsteWoord.length()-1);
					 
					
					if(invoer.charAt(0) == laatsteLetter && !(geradenWoorden.contains(invoer))) { 
					//Als char 0 van invoer gelijk is aan de laatste letter van het vorige woord
						
						geradenWoorden.add(invoer);
						i++;
					}
					else { 
						//Als char 0 niet gelijk is aan de laatste letter van het vorige woord
						
						System.out.println("Die mag niet.");
						i++;
					}
				}
					
				else { 	
				//Als er nog geen woorden in de list staan.
					
					geradenWoorden.add(invoer);
					i++;
					
				}			
		}
	}
} 

