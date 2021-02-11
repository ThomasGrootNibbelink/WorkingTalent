import java.util.Arrays;
public class ArraySorteren {

	public static void main(String[] args) {
		
		int[] teSorterenArray = new int[10];
		for(int i = 0; i < teSorterenArray.length; i++) {
			teSorterenArray[i] = (int)(Math.random()*100 + 1);
			
		}
		System.out.println("Gegenereerde nummers: " +Arrays.toString(teSorterenArray));
		
		Arrays.sort(teSorterenArray);
		
		System.out.println("Gesorteerde nummers: " + Arrays.toString(teSorterenArray));
		
	}
}
