import java.util.Scanner;

public class Boot {
	
	public static void main (String[] args) {
		System.out.println("Wat voor een boot zullen we eens nemen?");
		Scanner sc = new Scanner(System.in);
		String bootType = sc.nextLine();
		sc.close();
		
		Kapitein.varen(bootType);
		

	}
}
