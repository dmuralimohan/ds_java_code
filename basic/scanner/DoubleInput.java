//DoubleInput

import java.util.Scanner;

class DoubleInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //getting double input from the user
        System.out.println("Enter your double Input");
        double doubleInput = input.nextDouble();
        System.out.printf("your double input is: %f\n", doubleInput);
    }
}
