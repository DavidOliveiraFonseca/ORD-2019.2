public class BubbleSort {
	public static void main(String[] args) {
		int[] array = new int[args.length];
		
		for (int i = 0; i < args.length; i++) {
			array[i] = Integer.parseInt(args[i]);
		}
		printArray(array);
		bubbleSort(array);
		printArray(array);
	}
	
	public static void bubbleSort(int[] array) {
		boolean trocado;
		do {
			trocado = false;
			for (int i = 0; i < (array.length - 1); i++) {
				if (array[i] > array[i + 1]) {
					int aux = array[i];
					array[i] = array[i + 1];
					array[i + 1] = aux;	
					trocado = true;
				}
			}
		} while(trocado);
	}
	
	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
}
