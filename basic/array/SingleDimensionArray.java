//SingleDimensionArray
import java.util.Scanner;

class SingleDimensionArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
 
        System.out.print("Enter the array size: ");
        int arraySize = input.nextInt(); //getting number of elements we want to store the array from the user

        int[] array = new int[arraySize]; //if we want hardcod we can use int[] arr = {1,2,3,4,5,6,7,8,9,0};
        //same as for all data types

        for(int i = 0; i < arraySize; i++) {
            array[i] = input.nextInt(); //getting integer input

            /*
                similiar for all data types,
                input as prefex, then
                nextLong(); -> long input
                nextLine(); next() -> string input
                nextFloat(); -> float input
                nextDouble(); -> double input
                nextChar(); -> char input
            */
        }


        // for adding sum of all the values in the array
        int totalSum = 0;
        for(int i = 0; i < arraySize; i++) {
            totalSum += array[i]; //like as if we want to multiply kindly do totalSum *= array[i];...etc
        }
        System.out.printf("sum of the elements is: %d\n", totalSum);

        //printing all the elements in the array in a single line
        System.out.println("showing all the elements in the array");
        for(int i = 0; i < arraySize; i++) {
            System.out.printf("%d ", array[i]);
        }
    }
}
