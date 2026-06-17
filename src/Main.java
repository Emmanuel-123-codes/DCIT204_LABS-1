import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
//

        // User inputs the size of the inputs represented n.

        System.out.println("Enter the value of n: ");
        int n = input.nextInt();

        // An array of elements n is created and the user inputs the individual elements.
        int [] arr = new int[n];
        System.out.println("Enter " + n + " values: ");
        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arr[i] = input.nextInt();
        }

        // User enters the key or what value is to e searched for.
        System.out.println("Enter target value: ");
        int target = input.nextInt();

        // Array is sorted suppose user enters the elements unordered.
        Arrays.sort(arr);


        // Results from the linear and binary search are assigned to results and resultsBL respectively

        int results = Algorithm.linearSearch(arr, target);
        int resultsBL = Algorithm.binarySearch(arr, target);



        // Print results.

        System.out.println("Linear Search results:");
        if (results!= -1){
            System.out.println("Target found at index "+results);
        } else {
            System.out.println("TARGET_NOT_FOUND !");
        }



        System.out.println("Binary Search results:");
        if (results!= -1){
            System.out.println("Target found at index "+results);
        } else {
            System.out.println("TARGET_NOT_FOUND !");
        }

    }
}