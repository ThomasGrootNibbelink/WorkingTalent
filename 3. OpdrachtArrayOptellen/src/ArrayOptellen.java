public class ArrayOptellen {

	public static void main(String[] args) {
		int[] optelArray = {1, 2, 3, 4, 5};
		int som = 0;
		for(int i = 0; i < optelArray.length; i++) {
			som = som + optelArray[i];
		}
		
		System.out.println(som);
	}

}