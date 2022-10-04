import java.util.Arrays;

public class Median {
	public static void median(int[] numbers) {
		Arrays.sort(numbers);
		int middle = 0;
		double median = 0;
		if (numbers.length % 2 == 1) {
			middle = numbers.length / 2;
			median = numbers[middle];
		}
		else {
			middle = numbers.length / 2;
			median = ((double) numbers[middle] + (double) numbers[middle - 1]) / 2;
		}
		System.out.println("Median is: " + median);
	}

	public static void main(String[] args) {
		int[] numbers = {1,3,6,7,8,7};

		median(numbers);
	}
}