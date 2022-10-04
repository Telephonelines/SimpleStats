// SINGLE MODE IMPLEMENTATION!!!

// TO DO: Add a multi mode version...
// return an int[] ?
public class Mode {
    public static int mode(int[] numbers) {
        int highest = 0;
        int mode = 0;
        for(int i = 0; i < numbers.length; i++) {
            int count = 1;
            for(int j = 0; j < numbers.length; j++) {
                if (numbers[j] == numbers[i]) {
                    count++;
                }
                if(count > highest) {
                    mode = numbers[i];
                    highest = count;
                }
            }
        }
        return mode;
    }

    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,1,2,2,2,1,1};
        System.out.println(mode(numbers));
    }
}
