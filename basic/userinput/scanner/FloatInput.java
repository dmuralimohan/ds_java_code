//FloatInput

import java.util.Scanner;

class FloatInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //getting float input from user
        System.out.println("Enter your float input");
        float floatInput = input.nextFloat();
        System.out.printf("floatInput is: %f\n", floatInput);
    }
}
