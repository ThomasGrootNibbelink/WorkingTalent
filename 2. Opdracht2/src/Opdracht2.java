import java.util.Scanner;

public class Opdracht2 {

	public static void main(String[] args) {
		int eTeller = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Kies een woord");
		
		String gekozenWoord = sc.nextLine();
		
		for (int i = 0; i < gekozenWoord.length(); i++) {
			if(gekozenWoord.charAt(i) == 'e') {
				eTeller ++;
			}
		
		}
		System.out.println("je aantal 'e's is: " + eTeller);
	}
}