package CloudVandana;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.*;
public class ShuffelArray {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Prompt the user for input
	        System.out.println("Enter the number of elements in the array: ");
	        int n = scanner.nextInt();

	        // Create an array with the specified number of elements
	        Integer[] myArray = new Integer[n];

	        System.out.println("Enter " + n + " integers:");

	        // Read integers from the user and store them in the array
	        for (int i = 0; i < n; i++) {
	            myArray[i] = scanner.nextInt();
	        }

	        // Convert the array to a list
	        List<Integer> myList = Arrays.asList(myArray);

	        // Shuffle the list using Collections.shuffle
	        Collections.shuffle(myList);

	        // Convert the list back to an array
	        Integer[] shuffledArray = myList.toArray(new Integer[0]);

	        // Print the shuffled array
	        System.out.println("Shuffled Array: " + Arrays.toString(shuffledArray));
	    }
}
