import java.util.Scanner;

public class LingoSpelen {
	public static void main(String[] args) {
		int beurtenTeller = 0;
		int correctTeller = 0;
		while (beurtenTeller < 5 && correctTeller < 5) {
				Scanner sc = new Scanner(System.in);
				String teRadenWoord = "LAURA";
				System.out.println("Raad een woord van vijf letters");
				String geradenWoord = sc.nextLine().toUpperCase();
				if(!(geradenWoord.length() == 5)) {
					System.out.println("Dat waren er geen vijf, dus je bent af.");
					System.exit(1);
				}
		
				String[] geradenWoordArray = geradenWoord.split("");
				
				beurtenTeller += 1;
				correctTeller = 0;
				for (int i=0; i<teRadenWoord.length(); i++) {
					if(geradenWoord.charAt(i) == teRadenWoord.charAt(i)) {
						System.out.println("2");
						correctTeller ++;
						} else {
							if (teRadenWoord.contains(geradenWoordArray[i])){						
								
								System.out.println("1");
						}
							else {
								System.out.println("0");
							}
						}
				}
				if(correctTeller == 5) {
					System.out.println("Je hebt het goed!");
					System.exit(1);
				}
				
				}
		System.out.println("Je bent af.");
			}
		
	}


	