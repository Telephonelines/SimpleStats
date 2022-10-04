public class Mean {
	public static double mean(int[] numbers) {
		double total = 0;

		for(int n : numbers) {
			total += n;
		}

		double average = total / numbers.length;
		return average;
	}

	public static void main(String[] args) {
		int[] numbers = {1,3,6,7,8,7, 7, 9};
		System.out.println("Average: " + mean(numbers));
	}
}