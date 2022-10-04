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
		int[] numbers = {4,5,6,4,6};
		System.out.println("Average: " + mean(numbers));
	}
}