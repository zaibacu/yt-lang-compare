public class Sort {
	public static void print(int[] arr){
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i] + " ");
		}

		System.out.println();
	}

	public static int min(int[] arr, int offset){
		int m = offset;
		for(int i=offset; i<arr.length; i++){
			if(arr[i] < arr[m]){
				m = i;
			}
		}

		return m;
	}

	public static void swap(int[] arr, int a, int b){
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}

	public static void sort(int[] arr){
		for(int i=0; i<arr.length; i++){
			int m = min(arr, i);
			swap(arr, i, m);
		}
	}

	public static void main(String[] args){
		int[] numbers = {2, 6, 7, 1, 2, 3, 4, 5};
		print(numbers);
		sort(numbers);
		print(numbers);
	}
}